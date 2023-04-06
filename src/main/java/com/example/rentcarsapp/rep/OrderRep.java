package com.example.rentcarsapp.rep;

import com.example.rentcarsapp.model.Address;
import com.example.rentcarsapp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRep extends JpaRepository<Order, Long> {
}
