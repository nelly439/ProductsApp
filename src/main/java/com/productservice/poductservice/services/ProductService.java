package com.productservice.poductservice.services;


import com.productservice.poductservice.Repository.ProductRepository;
import com.productservice.poductservice.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public Product createProduct(String productId, String productName, double productPrice) {
        Product product = new Product();
        product.setProductName(productName);
        product.setProductPrice(productPrice);
        product.setProductId(productId);

        return productRepository.save(product);
    }

    public Product updateProduct(String id, String name, double price) {
        Product product = productRepository.findById(id)
                        .orElseThrow(()-> new RuntimeException("Product not found"));
        product.setProductName(name);
        product.setProductPrice(price);

        return productRepository.save(product);
    }
}
