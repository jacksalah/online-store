package com.example.demo.Repository;

import com.example.demo.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductReprository extends CrudRepository<Product,String>{
}
