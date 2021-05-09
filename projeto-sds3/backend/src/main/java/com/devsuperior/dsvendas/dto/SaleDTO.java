package com.devsuperior.dsvendas.dto;

import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO {

	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SallerDTO saller;
	
	public SaleDTO() {}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SallerDTO saller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.saller = saller;
	}
	
	public SaleDTO(Sale entity) {
		super();
		this.id = entity.getId();
		this.visited = entity.getVisited();
		this.deals = entity.getDeals();
		this.amount = entity.getAmount();
		this.date = entity.getDate();
		this.saller = new SallerDTO(entity.getSaller());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SallerDTO getSaller() {
		return saller;
	}

	public void setSaller(SallerDTO saller) {
		this.saller = saller;
	}
	
	
	
	
}
