package com.productservice.poductservice.Repository;

import com.productservice.poductservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {

}
