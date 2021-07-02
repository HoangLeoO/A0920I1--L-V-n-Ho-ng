package com.example.smartphone.service.impl;

import com.example.smartphone.model.Smartphone;
import com.example.smartphone.repository.SmartphoneRepository;
import com.example.smartphone.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {
    @Autowired
    private SmartphoneRepository smartphoneRepository;


    @Override
    public Iterable<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(Long id) {
        return smartphoneRepository.findById(id).orElse(null);
    }

    @Override
    public Smartphone save(Smartphone phone) {
        return null;
    }

    @Override
    public Smartphone remove(Long id) {
        return null;
    }
}