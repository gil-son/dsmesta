package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	private SaleRepository saleRepository;
	
	
	SaleService(SaleRepository saleRepository){
		this.saleRepository = saleRepository;
	}

	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
}
