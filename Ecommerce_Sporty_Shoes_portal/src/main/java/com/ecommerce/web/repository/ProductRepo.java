package com.ecommerce.web.repository;
//Interface for crud operations in product------>
import org.springframework.data.repository.CrudRepository;

import com.ecommerce.web.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

}
