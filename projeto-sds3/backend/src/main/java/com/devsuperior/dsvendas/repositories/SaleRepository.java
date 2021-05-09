package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.saller, SUM(obj.amount)) "
			+ " FROM Sale AS obj GROUP BY obj.saller")
	List<SaleSumDTO> amountGroupBySaller();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.saller, SUM(obj.visited), SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.saller")
	List<SaleSuccessDTO> successGroupBySaller();
	
}
