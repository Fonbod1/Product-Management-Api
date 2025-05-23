# Product-Management-Api
## This is a Spring Boot Rest API for creating product.
It supports  Article creation, viewing, updating, and deletion.
#
# Features
#
## The Product Management API has the following features

+ User Validation
+ Create Product
+ Get All Products
+ Get Product by ID
+ Update Product and Delete Product
+ Swagger API Documentation
#
# Tech Stack
## The following are the software that was used to create this API
+ Java 24
+ Spring Boot
+ Intellij
+ Postgresql

# 
# Setup Instructions
## git clone https://github.com/Fonbd1/product-management.api 
#
## Access API Docs
http://localhost:8081/swagger-ui.html
#
# HOW TO ACCESS THE API
#
## To have access to the API, do the following!!
1. Clone the repository and open it from IntelliJ
2. Launch PostgreSQL
3. Open Postman and run the different endpoints

Creating a new product

# Product API Documentation

## Create a Product
![Create product Screenshot](https://github.com/Fonbod1/Product-Management-Api/blob/main/product-inventory/src/main/resources/screen_shots/Screenshot_Create_Product.png?raw=true)

## Updating a Product
![Update product Screenshot](https://github.com/Fonbod1/Product-Management-Api/blob/main/product-inventory/src/main/resources/screen_shots/Screenshot_Product_Update.png?raw=true)

## View Product by ID
![Get product by ID Screenshot](https://github.com/Fonbod1/Product-Management-Api/blob/main/product-inventory/src/main/resources/screen_shots/Screenshot_Get_ProductBy_Id.png?raw=true)

## View All Products
![View All Products Screenshot](https://github.com/Fonbod1/Product-Management-Api/blob/main/product-inventory/src/main/resources/screen_shots/Screenshot_Get_All_Product.png?raw=true)

## Search a Product
![Search Product Screenshot](https://github.com/Fonbod1/Product-Management-Api/blob/main/product-inventory/src/main/resources/screen_shots/Screenshot_Search_a_product.png?raw=true)


#
# Product Management Endpoints
## Base URL: /api/products
#

|     Method    |   Endpoint   |      Description      |
| :-----------: |:------------:|:---------------------:|
|               |              |                       |
| Get           |     /All     | View all products and |
| Get           |  /get/{id}   |   Get Product by ID   |
| Put           | /update/{id} |    Update product     |
| Delete        | /delete/{id} |    Delete product     |
| POST          |   /create    | Create a new product  |
#
# Folder Structure

