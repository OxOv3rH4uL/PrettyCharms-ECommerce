package com.prettycharms.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.prettycharms.ecommerce.Entity.Product;


@CrossOrigin("http://localhost:4200")
public interface ProductJPARepository extends JpaRepository<Product, Long> {

}
