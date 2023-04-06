package com.example.rentcarsapp.service;

import com.example.rentcarsapp.model.dto.OrderDto;
import com.example.rentcarsapp.model.dto.PriceDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrderService {
    OrderDto save(OrderDto orderDto);

    OrderDto findById(Long id);

    List<OrderDto> findAll();

    OrderDto update(OrderDto OrderDto);

    void delete(Long id);
}
