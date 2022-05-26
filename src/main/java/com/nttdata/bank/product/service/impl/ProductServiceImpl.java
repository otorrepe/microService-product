package com.nttdata.bank.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bank.product.model.Product;
import com.nttdata.bank.product.repository.ProductRepository;
import com.nttdata.bank.product.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Flux<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Mono<Product> findById(String id) {
		return productRepository.findById(id);
	}

}
