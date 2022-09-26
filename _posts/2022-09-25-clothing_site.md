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


var dresses = [ 
    new Dress("Lucy in the Sky", "blue", 55),
    new Dress("Windsor", "red", 55)
];

idek = new Dress(dresses);


for (const row of idek.Dress) {
    // td for each column
    const brand = document.getElementById("brand");
    const color = document.getElementById("color");
    const price = document.getElementById("price");

}

}

</script>

<div id = "brand">Lucy In the Sky</div>

<div id = "color">blue</div>
<div id = "price">55</div>


