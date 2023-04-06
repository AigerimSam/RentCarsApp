package com.example.rentcarsapp.rep;

import com.example.rentcarsapp.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRep extends JpaRepository<Address, Long> {
}
