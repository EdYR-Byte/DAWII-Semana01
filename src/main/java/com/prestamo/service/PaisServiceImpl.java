package com.prestamo.service;

import com.prestamo.entity.Pais;
import com.prestamo.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImpl implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> findAll() {
        return paisRepository.findAll();
    }

}
