package org.vendors.services;


import org.springframework.data.jpa.repository.Modifying;
import org.vendors.entity.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import org.vendors.repository.VendorRepository;
@Service
public class VendorService {
@Autowired
    private final VendorRepository vendorRepository;

    @Autowired
    public VendorService(VendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public List<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }

    public Vendor getVendorById(String id) {
        return vendorRepository.findById(id).orElse(null);
    }

    public Vendor saveVendor(Vendor vendor) {
        return vendorRepository.saveAndFlush(vendor);
    }

    public String deleteVendor(String id) {
        if (vendorRepository.existsById(id)) {
            vendorRepository.deleteById(id);
            return id;
        } else {
            return null;
        }
    }

    public List<Vendor> getAllVendorsByWarehouse(String warehouseId) {
        return vendorRepository.findVendorsByWarehouseId(warehouseId);
    }
}