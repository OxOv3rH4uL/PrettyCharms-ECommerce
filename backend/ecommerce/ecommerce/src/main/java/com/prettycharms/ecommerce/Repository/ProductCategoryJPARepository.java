package com.prettycharms.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.prettycharms.ecommerce.Entity.ProductCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "productCategory" , path = "product-category")
public interface ProductCategoryJPARepository extends JpaRepository<ProductCategory, Long>{

}
