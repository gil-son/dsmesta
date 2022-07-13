package com.devsuperior.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	private SaleRepository saleRepository;
	
	
	SaleService(SaleRepository saleRepository){
		this.saleRepository = saleRepository;
	}

	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		try {
			
			LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
			
			LocalDate min = minDate.equals("") ? today.minusYears(1) : LocalDate.parse(minDate);
			LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
			
			return saleRepository.findSales(min, max, pageable);
			
		}catch(DateTimeParseException e) {
		
			throw new DateTimeParseException("Invalid date: "+minDate+" AND/OR "+ maxDate, "" , 0);
		}
	}
}
