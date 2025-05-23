package com.product.inventory.service;

import com.product.inventory.model.Product;
import com.product.inventory.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ProductorServicedao {

    public final ProductRepository productRepository;

    public ProductorServicedao(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //update product
    //delete product
    //get product by id
    //get all products
    //search products by name and max price
    // You can also add validation and error handling in this layer

    public Product addProduct(Product product){
        Product newProduct = new Product();
        newProduct.setName(product.getName());
        newProduct.setPrice(product.getPrice());
        newProduct.setQuantity(product.getQuantity());
        // Save the new product to the database using the ProductRepository
       return productRepository.save(newProduct);

        // Return the saved product as a response

       // return RequestEntity.ok(newProduct);
    }
    public Product updateProduct(Product product) {
        // Get the ID from the incoming product
        Long id = product.getId();
        // Find the existing product by ID
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            // Update the product details
            existingProduct.setName(product.getName());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setQuantity(product.getQuantity());
            // Save the updated product to the database
            return productRepository.save(existingProduct);
        }
        return null; // or throw an exception if not found
    }
    public void deleteProduct(Long id) {
        // Delete the product by ID
        productRepository.deleteById(id);
    }
    public Product getProductById(Long id) {
        // Find the product by ID
        return productRepository.findById(id).orElse(null);
    }
    public List<Product> getAllProducts() {
        // Get all products from the database
        return productRepository.findAll();
    }



   /* public Product getProductByName(String name) {
        return productRepository.findByNameIgnoreCase(name)
                .orElse(null);
    }*/

    public Product searchProductByName(String name) {
        return productRepository.findByNameIgnoreCase(name)
                .orElse(null);
    }
}
