package com.example.demo.service;

import com.example.demo.model.Smartphones;
import com.example.demo.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneServiceImpl implements SmartphoneService {

    @Autowired
    private SmartphoneRepository smartphoneRepository;

    @Override
    public Iterable<Smartphones> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphones findById(Long id) {
        Smartphones smartphone = smartphoneRepository.findById(id).orElse(null);

        return smartphone;
    }

    @Override
    public Smartphones save(Smartphones phone) {
        return smartphoneRepository.save(phone);
    }

    @Override
    public Smartphones remove(Long id) {
        Smartphones smartphone = findById(id);
        smartphoneRepository.deleteById(id);
        return smartphone;
    }
}