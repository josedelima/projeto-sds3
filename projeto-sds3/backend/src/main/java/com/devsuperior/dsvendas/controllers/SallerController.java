package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SallerDTO;
import com.devsuperior.dsvendas.service.SallerService;

@RestController
@RequestMapping(value = "/sallers")
public class SallerController {

	@Autowired
	private SallerService service;
	
	
	@GetMapping
	public ResponseEntity<List<SallerDTO>> findAll() {
		List<SallerDTO> list = service.findAll();
		
		return ResponseEntity.ok(list);
	}
}
