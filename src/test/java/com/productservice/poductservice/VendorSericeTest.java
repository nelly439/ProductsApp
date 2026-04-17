package com.productservice.poductservice;


import com.productservice.poductservice.Repository.ProductRepository;
import com.productservice.poductservice.Repository.VendorRepository;
import com.productservice.poductservice.model.Vendor;
import com.productservice.poductservice.services.VendorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class VendorSericeTest {
    @Mock
    VendorRepository vendorRepository;

    @Mock
    ProductRepository productRepository;
    @InjectMocks
    VendorService vendorService;

    @Test
    void CreateVendor() {
        Vendor vendor = new Vendor("1", "nelly");
        when(vendorRepository.save(any(Vendor.class)))
                .thenReturn(vendor);

        Vendor result = vendorService.createVendor("1","nelly");

        assertEquals("1", result.getVendorId());
        assertEquals("nelly", result.getVendorName());
    }

}
