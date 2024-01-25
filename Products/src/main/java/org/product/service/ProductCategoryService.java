package org.product.service;

import org.product.domain.Product;
import org.product.domain.ProductCategory;
import org.product.repository.ProductCategoryRepository;
import org.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

	private final ProductCategoryRepository productCategoryRepository;

	@Autowired
	public ProductCategoryService(ProductCategoryRepository productCategoryRepository) {
		this.productCategoryRepository = productCategoryRepository;
	}

	public List<ProductCategory> getAllCategories() {
		return productCategoryRepository.findAll();
	}
	public ProductCategory getCategoryById(String categoryId) {
		return productCategoryRepository.findById(categoryId).get();
	}

	public ProductCategory saveCategory(ProductCategory category) {
		return productCategoryRepository.save(category);
	}

	public ProductCategory updateCategory(ProductCategory category) {
		return productCategoryRepository.save(category);

	}

	public String deleteCategory(String categoryId) {
		if (productCategoryRepository.existsById(categoryId)) {
			productCategoryRepository.deleteById(categoryId);
			return categoryId;
		} else {
			return "";
		}
	}
	}
