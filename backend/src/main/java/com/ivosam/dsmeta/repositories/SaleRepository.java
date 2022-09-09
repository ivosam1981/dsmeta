package com.ivosam.dsmeta.repositories;

import com.ivosam.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
