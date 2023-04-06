package com.example.rentcarsapp.model;

import com.example.rentcarsapp.model.enums.Category;
import com.example.rentcarsapp.model.enums.Color;
import com.example.rentcarsapp.model.enums.EngineType;
import com.example.rentcarsapp.model.enums.Transmission;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_car")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String photo;
    private LocalDate mnfYear;
    private Color color;
    private Double engineVolume;
    private EngineType engineType;
    private Transmission transmission;
    private Integer gasPer100;
    private Category category;
    private Boolean isAvailable;
    @OneToMany
    private List<Price> price;
    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private Order orderDetails;
}
