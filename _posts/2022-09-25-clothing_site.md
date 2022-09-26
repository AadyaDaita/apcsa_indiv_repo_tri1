---
toc: true
layout: post
categories: [markdown]
title: Clothing Store
---

<div>
<div style="float: left">
<img src="https://media.lucyinthesky.com/data/Dec20_1/800xAUTO/1V9A0954.JPG" alt="dress 2" style="width:25%">
</div>
<div>
Lucy in the Sky Blue $55
</div>
</div>

<br>

<br>
<div>
<div style="float: left">
<img src="https://media.lucyinthesky.com/data/Nov21_2/800xAUTO/1V9A2008.JPG" alt="dress 2" style="width:25%">
</div>
<div>
Lucy in the Sky Maroon $55
</div>
</div>



<script>
// define a function to hold data for a dress
function Dress(brand, color, price) {
    this.brand = brand;
    this.color = color;
    this.price = price;

}



// define a JSON conversion "method" associated with Person
Person.prototype.toJSON = function() {
    const obj = {brand: this.brand, color: this.color, price: this.price};
    const json = JSON.stringify(obj);  // json/string is useful when passing data on internet
    return json;
}

// make a new Person and assign to variable teacher
var dress1 = new Dress("Lucy In the Sky", "navy blue", 55);  // object type is easy to work with in JavaScript
logItType(dress1);  // before role
logItType(dress1.toJSON());  // ok to do this even though role is not yet defined

// output of Object and JSON/string associated with Teacher






// define an HTML conversion "method" associated with Classroom
Dress.prototype._toHtml = function() {
  // HTML Style is build using inline structure
  var style = (
    "display:inline-block;" +
    "border: 2px solid grey;" +
    "box-shadow: 0.8em 0.4em 0.4em grey;"
  );

  // HTML Body of Table is build as a series of concatenations (+=)
  var body = "";
  // Heading for Array Columns
  body += "<tr>";
  body += "<th><mark>" + "Brand" + "</mark></th>";
  body += "<th><mark>" + "Color" + "</mark></th>";
  body += "<th><mark>" + "Price" + "</mark></th>";
  body += "</tr>";
  // Data of Array, iterate through each row of compsci.classroom 
  for (var row in dress1.dress) {
    // tr for each row, a new line
    body += "<tr>";
    // td for each column of data
    body += "<td>" + dress1.dress[row].brand + "</td>";
    body += "<td>" + dress1.dress[row].color + "</td>";
    body += "<td>" + dress1.dress[row].price + "</td>";
    // tr to end line
    body += "<tr>";
  }

   // Build and HTML fragment of div, table, table body
  return (
    "<div style='" + style + "'>" +
      "<table>" +
        body +
      "</table>" +
    "</div>"
  );

};


// IJavaScript HTML processor receive parameter of defined HTML fragment




<script>
