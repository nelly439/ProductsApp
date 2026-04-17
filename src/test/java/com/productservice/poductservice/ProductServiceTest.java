package com.productservice.poductservice;


import com.productservice.poductservice.Repository.ProductRepository;
import com.productservice.poductservice.model.Product;
import com.productservice.poductservice.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    void testtoCreateProduct() {
        Product product = new Product("001", "okin", 500.0);
        when(productRepository.save(any(Product.class)))
                .thenReturn(product);

        Product result = productService.createProduct("001","okin",500.0);

        assertEquals("001", result.getProductId());
        assertEquals("okin", result.getProductName());
        assertEquals(500.0, result.getProductPrice());

    }

    @Test
    void testtoUpdateProduct() {
        Product product = new Product("001", "okin", 500.0);
        when(productRepository.save(any(Product.class)))
            .thenReturn(product);

        Product result = productService.createProduct("001","okin",500.0);

        Product product1 = new Product("123", "close-up", 700.0);

        Product result = productService.updateProduct("123", "close-up", 700.0);

        assertEquals("123", result.getProductId());
        assertEquals("close-up", result.getProductName());
        assertEquals(700.0, result.getProductPrice());



    }
}
