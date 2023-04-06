package com.example.rentcarsapp.service;

import com.example.rentcarsapp.model.dto.PriceDto;

import java.util.List;

public interface PriceService {
    PriceDto save(PriceDto priceDto);

    PriceDto findById(Long id);

    List<PriceDto> findAll();

    PriceDto update(PriceDto priceDto);

    void delete(Long id);
}
