---
toc: true
layout: post
categories: [markdown]
title: Clothing Store
---


<script>
// define a function to hold data for a dress
function Dress(brand, color, price, image) {
    this.brand = brand;
    this.color = color;
    this.price = price;
    this.image = image;

}




// define an HTML conversion "method" associated with Classroom
Dress.prototype._toHtml = function() {

  // HTML Style is build using inline structure


  // HTML Body of Table is build as a series of concatenations (+=)
  var body = "";
  // Heading for Array Columns
  body += "<tr>";
  body += "<th><mark>" + "brand" + "</mark></th>";
  body += "<th><mark>" + "color" + "</mark></th>";
  body += "<th><mark>" + "price" + "</mark></th>";
  body += "<th><mark>" + "image" + "</mark></th>";


var dresses = [ 
    new Dress("Lucy in the Sky", "blue", 55),
    new Dress("Windsor", "red", 55)
];

idek = new Dress(dresses);


for (const row of idek.Dress) {
    // td for each column
    const brand = document.getElementById("brand1");
    const color = document.getElementById("color1");
    const price = document.getElementById("price1");
    const price = document.getElementById("image1");

    const brand = document.getElementById("brand2");
    const color = document.getElementById("color2");
    const price = document.getElementById("price2");
    const price = document.getElementById("image2");
}

}

</script>

<div id = "brand1">Lucy In the Sky</div>
<div id = "color1">blue</div>
<div id = "price1">$55</div>
<img id = "image1" src="https://media.lucyinthesky.com/data/Dec20_1/800xAUTO/1V9A0954.JPG" alt="dress 2" style="width:25%">



<div id = "brand2">Windsor</div>
<div id = "color2">maroon</div>
<div id = "price2">$60</div>
<img id = "image2" src="https://media.lucyinthesky.com/data/Nov21_2/800xAUTO/1V9A2008.JPG" alt="dress 2" style="width:25%">




