package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping( value = "/sales")
public class SaleController {
	
	private SaleService saleService;
	
	
	public SaleController(SaleService saleService) {
		this.saleService = saleService;
	}
	
	
	@GetMapping
	public List<Sale> findSales(){
		return saleService.findSales();
	}

}
