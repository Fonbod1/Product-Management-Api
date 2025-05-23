package com.product.inventory.repository;

import com.product.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


        Optional<Product> findById(Long id);
        List<Product> findAll();
        void deleteById(Long id);
        Product save(Product product);


    //List<Product> findByNameContainingIgnoreCaseAndQuantityLessThanEqual(String name, Integer quantity);
    Optional<Product> findByNameIgnoreCase(String name);

}
