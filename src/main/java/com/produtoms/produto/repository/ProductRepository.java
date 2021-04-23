package com.produtoms.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.produtoms.produto.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{}
