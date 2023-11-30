package com.prettycharms.ecommerce.Entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="product_category")

public class ProductCategory {
	
	@Id
	@Column(name="id")
	long categoryId;
	
	@Column(name="category_name")
	String category_name;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy = "category")
	Set<Product> products;

	public ProductCategory(long categoryId, String category_name, Set<Product> products) {
		super();
		this.categoryId = categoryId;
		this.category_name = category_name;
		this.products = products;
	}
	
	public ProductCategory() {}
	

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
}
