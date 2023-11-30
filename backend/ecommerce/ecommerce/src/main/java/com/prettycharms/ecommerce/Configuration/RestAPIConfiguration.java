package com.prettycharms.ecommerce.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.prettycharms.ecommerce.Entity.Product;
import com.prettycharms.ecommerce.Entity.ProductCategory;

@Configuration
public class RestAPIConfiguration implements RepositoryRestConfigurer {
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config ,CorsRegistry cors) {
		
		HttpMethod[] methodsNotAllowed = {HttpMethod.PUT, HttpMethod.POST,HttpMethod.DELETE};
		config.getExposureConfiguration()
		.forDomainType(Product.class)
		.withItemExposure((metadata , i) -> i.disable(methodsNotAllowed))
		.withCollectionExposure((metadat,i) -> i.disable(methodsNotAllowed));
		
		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
		.withItemExposure((metadata , i) -> i.disable(methodsNotAllowed))
		.withCollectionExposure((metadat,i) -> i.disable(methodsNotAllowed));
		
		
	}
}
