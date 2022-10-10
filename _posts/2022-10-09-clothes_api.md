---
title: Fetch of Backend Clothes
layout: default
categories: [1.C]
tags: [javascript]
---
<!-- HTML table fragment for page -->
<table>
  <thead>
  <tr>
    <th>Clothing Item</th>
    <th>Buy</th>
    <th>Skip</th>
  </tr>
  </thead>
  <tbody id="result">
    <!-- javascript generated data -->
  </tbody>
</table>

<!-- Script is layed out in a sequence (without a function) and will execute when page is loaded -->
<script>

  // prepare HTML defined "result" container for new output
  const resultContainer = document.getElementById("result");

  // keys for joke reactions
  const BUY = "buy";
  const SKIP = "skip";

  // prepare fetch urls
  // const url = "https://flask.nighthawkcodingsociety.com/api/jokes";
  const url = "https://spring.nighthawkcodingsociety.com/api/jokes";
  const get_url = url +"/";
  const like_url = url + "/like/";  // buy reaction
  const jeer_url = url + "/jeer/";  // skip reaction

  // prepare fetch GET options
  const options = {
    method: 'GET', // *GET, POST, PUT, DELETE, etc.
    mode: 'cors', // no-cors, *cors, same-origin
    cache: 'default', // *default, no-cache, reload, force-cache, only-if-cached
    credentials: 'same-origin', // include, same-origin, omit
    headers: {
      'Content-Type': 'application/json'
      // 'Content-Type': 'application/x-www-form-urlencoded',
    },
  };
  // prepare fetch PUT options, clones with JS Spread Operator (...)
  const put_options = {...options, method: 'PUT'}; // clones and replaces method

  // fetch the API
  fetch(get_url, options)
    // response is a RESTful "promise" on any successful fetch
    .then(response => {
      // check for response errors
      if (response.status !== 200) {
          error('GET API response failure: ' + response.status);
          return;
      }
      // valid response will have JSON data
      response.json().then(data => {
          console.log(data);
          for (const row of data) {
            // make "tr element" for each "row of data"
            const tr = document.createElement("tr");
            
            // td for joke cell
            const item = document.createElement("td");
              item.innerHTML = row.id + ". " + row.item;  // add fetched data to innerHTML

            // td for buy cell with onclick actions
            const buy = document.createElement("td");
              const buy_but = document.createElement('button');
              buy_but.id = buy+row.id   // establishes a buy JS id for cell
              buy_but.innerHTML = row.buy;  // add fetched "buy count" to innerHTML
              buy_but.onclick = function () {
                // onclick function call with "like parameters"
                reaction(buy, like_url+row.id, buy_but.id);  
              };
              buy.appendChild(buy_but);  // add "buy button" to buy cell

            // td for skip cell with onclick actions
            const skip = document.createElement("td");
              const skip_but = document.createElement('button');
              skip_but.id = skip+row.id  // establishes a skip JS id for cell
              skip_but.innerHTML = row.skip;  // add fetched "skip count" to innerHTML
              skip_but.onclick = function () {
                // onclick function call with "jeer parameters"
                reaction(skip, jeer_url+row.id, skip_but.id);  
              };
              skip.appendChild(skip_but);  // add "skip button" to skip cell
             
            // this builds ALL td's (cells) into tr (row) element
            tr.appendChild(item);
            tr.appendChild(buy);
            tr.appendChild(skip);

            // this adds all the tr (row) work above to the HTML "result" container
            resultContainer.appendChild(tr);
          }
      })
  })
  // catch fetch errors (ie Nginx ACCESS to server blocked)
  .catch(err => {
    error(err + " " + get_url);
  });

  // Reaction function to likes or jeers user actions
  function reaction(type, put_url, elemID) {

    // fetch the API
    fetch(put_url, put_options)
    // response is a RESTful "promise" on any successful fetch
    .then(response => {
      // check for response errors
      if (response.status !== 200) {
          error("PUT API response failure: " + response.status)
          return;  // api failure
      }
      // valid response will have JSON data
      response.json().then(data => {
          console.log(data);
          // Likes or Jeers updated/incremented
          if (type === buy) // like data element
            document.getElementById(elemID).innerHTML = data.buy;  // fetched buy data assigned to buy Document Object Model (DOM)
          else if (type === skip) // jeer data element
            document.getElementById(elemID).innerHTML = data.skip;  // fetched skip data assigned to skip Document Object Model (DOM)
          else
            error("unknown type: " + type);  // should never occur
      })
    })
    // catch fetch errors (ie Nginx ACCESS to server blocked)
    .catch(err => {
      error(err + " " + put_url);
    });
    
  }

  // Something went wrong with actions or responses
  function error(err) {
    // log as Error in console
    console.error(err);
    // append error to resultContainer
    const tr = document.createElement("tr");
    const td = document.createElement("td");
    td.innerHTML = err;
    tr.appendChild(td);
    resultContainer.appendChild(tr);
  }

</script>