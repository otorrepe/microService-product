package com.nttdata.bank.product.service;

import com.nttdata.bank.product.model.Product;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
	
	Flux<Product> findAll();
	
	Mono<Product> findById(String id);

}
