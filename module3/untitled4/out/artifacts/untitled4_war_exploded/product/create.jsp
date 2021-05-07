<%--
  Created by IntelliJ IDEA.
  User: TY
  Date: 4/23/2021
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Product</title>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<p>
    <a href="/product">List All Product</a>
</p>
<form method="post">
    <fieldset>
        <legend>Fill In Product Information</legend>

        <div class="form" style="width: 50%">


            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="product_id"> Product id</label>
                </div>
                <input type="text" class="form-control" id="product_id" name="product_id" placeholder="0000">
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="product_name">Product name</label>
                </div>
                <input type="date" class="form-control" id="product_name" name="product_name" >
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="product_price">Product_price</label>
                </div>
                <input type="number" class="form-control" id="product_price" name="product_price">
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="product_discount">Product_price</label>
                </div>
                <input type="number" class="form-control" id="product_discount" name="product_discount">
            </div>
            <div class="input-group mb-3">
                <div class="input-group-prepend">
                    <label class="input-group-text" for="product_stock">Product_price</label>
                </div>
                <input type="number" class="form-control" id="product_stock" name="product_stock">
            </div>


            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </fieldset>
</form>
</body>
</html>
