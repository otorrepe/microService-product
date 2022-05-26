package com.nttdata.bank.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bank.product.model.Product;
import com.nttdata.bank.product.service.ProductService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	private Flux<Product> findAll(){
		return productService.findAll();
	}
	
	@GetMapping("/{id}")
	private Mono<Product> findById(@PathVariable String id){
		return productService.findById(id);
	}

}
