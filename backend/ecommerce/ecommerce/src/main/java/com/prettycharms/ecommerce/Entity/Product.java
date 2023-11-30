package com.prettycharms.ecommerce.Entity;

import java.math.BigDecimal;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	long id;
	
	@ManyToOne
	@JoinColumn(name="category_id",nullable = false)
	ProductCategory category;
	
	@Column(name="sku")
	String sku;
	
	@Column(name="name")
	String name;
	
	@Column(name = "description")
	String description;
	
	@Column(name="unit_price")
	BigDecimal unitPrice;
	
	@Column(name="image_url")
	String image_url;
	
	@Column(name="active")
	boolean active;
	
	@Column(name="date_created")
	@CreationTimestamp
	Date dateCreated;
	
	@Column(name="last_updated")
	@UpdateTimestamp
	Date lastUpdated;
	
	

	public Product(long id, ProductCategory category, String sku, String name, String description, BigDecimal unitPrice,
			String image_url, boolean active, Date dateCreated, Date lastUpdated) {
		super();
		this.id = id;
		this.category = category;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.image_url = image_url;
		this.active = active;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
	}
	
	public Product(){
		
	}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", category=" + category + ", sku=" + sku + ", name=" + name + ", description="
				+ description + ", unitPrice=" + unitPrice + ", image_url=" + image_url + ", active=" + active
				+ ", dateCreated=" + dateCreated + ", lastUpdated=" + lastUpdated + "]";
	}
	
}
