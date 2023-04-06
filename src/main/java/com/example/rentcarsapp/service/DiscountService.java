package com.example.rentcarsapp.service;

import com.example.rentcarsapp.model.dto.DiscountDto;
import com.example.rentcarsapp.model.dto.OrderDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DiscountService {
    DiscountDto save(DiscountDto discountDto);

    DiscountDto findById(Long id);

    List<DiscountDto> findAll();

    DiscountDto update(DiscountDto discountDto);

    void delete(Long id);
}
