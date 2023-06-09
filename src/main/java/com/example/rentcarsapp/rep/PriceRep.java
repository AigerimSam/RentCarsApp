package com.example.rentcarsapp.rep;

import com.example.rentcarsapp.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRep extends JpaRepository<Price, Long> {
}
