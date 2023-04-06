package com.example.rentcarsapp.rep;

import com.example.rentcarsapp.model.Address;
import com.example.rentcarsapp.model.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRep  extends JpaRepository<Discount, Long> {
}
