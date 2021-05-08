package com.devsuperior.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.dto.SallerDTO;
import com.devsuperior.dsvendas.entities.Saller;
import com.devsuperior.dsvendas.repositories.SallerRepository;

@Service
public class SallerService {

	@Autowired	
	private SallerRepository repository;
	
	public List<SallerDTO> findAll() {
		List<Saller> result = repository.findAll();
		
		return result.stream().map(x -> new SallerDTO(x)).collect(Collectors.toList());
		
	}
}
