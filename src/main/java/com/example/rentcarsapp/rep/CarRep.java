package com.example.rentcarsapp.rep;

import com.example.rentcarsapp.model.Address;
import com.example.rentcarsapp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRep extends JpaRepository<Car, Long> {
}
