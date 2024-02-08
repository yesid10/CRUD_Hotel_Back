package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //Moestrar a los huespedes
    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    //Crear un huesped
    public Huesped createHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Editar un huesped
    public Huesped updateHuesped(Huesped huesped){
        return huespedRepository.save(huesped);
    }

    //Eliminar huesped
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }
}
