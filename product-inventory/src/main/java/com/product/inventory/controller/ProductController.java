package com.product.inventory.controller;

import com.product.inventory.model.Product;
import com.product.inventory.service.ProductorServicedao;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Tag(name = "Product API", description = "API for managing products")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductorServicedao productorServicedao;

    public ProductController(ProductorServicedao productorServicedao) {
        this.productorServicedao = productorServicedao;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long id) {
        Product product = productorServicedao.getProductById(id);
        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productorServicedao.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> addProduct(@RequestBody @Valid Product product) {
        Product newProduct = productorServicedao.addProduct(product);
        return ResponseEntity.ok(newProduct);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody @Valid Product product) {
        product.setId(id); // Make sure the id is assigned!
        Product updatedProduct = productorServicedao.updateProduct(product);
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id) {
        productorServicedao.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchProductByName(@RequestParam String name) {
        Product product = productorServicedao.searchProductByName(name);
        if (product == null) {
            return ResponseEntity.notFound().build();
        }
        if (product.getQuantity() < 5) {
            Map<String, Object> response = new HashMap<>();
            response.put("product", product);
            response.put("message", "Stock is running low, needs to be replenished");
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.ok(product);
    }
}