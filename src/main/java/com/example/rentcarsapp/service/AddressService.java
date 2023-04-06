package com.example.rentcarsapp.service;

import com.example.rentcarsapp.model.dto.AddressDto;
import com.example.rentcarsapp.model.dto.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AddressService {
    AddressDto save(AddressDto addressDto);

    AddressDto findById(Long id);

    List<AddressDto> findAll();

    AddressDto update(AddressDto addressDto);

    void delete(Long id);
}
