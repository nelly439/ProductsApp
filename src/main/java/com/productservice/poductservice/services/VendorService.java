package com.productservice.poductservice.services;

import com.productservice.poductservice.Repository.VendorRepository;
import com.productservice.poductservice.model.Vendor;
import org.springframework.stereotype.Service;

@Service
public class VendorService {
    private VendorRepository vendorRepository;

    public Vendor createVendor(String id, String name) {
        Vendor vendor = new Vendor(id, name);
        return vendorRepository.save(vendor);
    }
}
