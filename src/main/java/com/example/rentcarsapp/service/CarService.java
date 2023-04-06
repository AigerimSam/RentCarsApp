package com.example.rentcarsapp.service;

import com.example.rentcarsapp.model.dto.CarDto;
import com.example.rentcarsapp.model.dto.DiscountDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface  CarService {
    CarDto save(CarDto carDto);

    CarDto findById(Long id);

    List<CarDto> findAll();

    CarDto update(CarDto carDto);

    void delete(Long id);
}
