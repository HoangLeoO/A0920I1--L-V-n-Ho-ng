package com.example.demo.service;

import com.example.demo.model.Smartphones;

public interface SmartphoneService {
    Iterable<Smartphones> findAll();
    Smartphones findById(Long id);
    Smartphones save(Smartphones phone);
    Smartphones remove(Long id);
}
