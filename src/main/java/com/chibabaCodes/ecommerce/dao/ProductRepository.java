package com.chibabaCodes.ecommerce.dao;

import com.chibabaCodes.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
