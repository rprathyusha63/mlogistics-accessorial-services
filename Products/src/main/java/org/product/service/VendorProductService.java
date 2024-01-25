package org.product.service;

import org.product.domain.ProductCategory;
import org.product.domain.VendorProduct;
import org.product.domain.VendorProductId;
import org.product.repository.ProductCategoryRepository;
import org.product.repository.VendorProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorProductService {

	private final VendorProductRepository vendorProductRepository;

	@Autowired
	public VendorProductService(VendorProductRepository vendorProductRepository) {
		this.vendorProductRepository = vendorProductRepository;
	}

	public List<VendorProduct> getAllVendorProducts() {
		return vendorProductRepository.findAll();
	}
	public List<VendorProduct> getAllVendorProductsByVendorId(String vendorid) {
		return vendorProductRepository.findVendorProductsByVendorId(vendorid);
	}

	public VendorProduct saveVendorProduct(VendorProduct vendorProduct){
		return vendorProductRepository.save(vendorProduct);
	}

	public VendorProduct getById(VendorProductId id){
		return vendorProductRepository.findById(id).orElse(null);
	}

	public VendorProductId deleteVendorProduct(VendorProductId vendorProductId) {
		if (vendorProductRepository.existsById(vendorProductId)) {
			vendorProductRepository.deleteById(vendorProductId);
			return vendorProductId;
		} else {
			return null;
		}
	}
}
