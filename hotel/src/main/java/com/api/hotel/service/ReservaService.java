package com.api.hotel.service;

import com.api.hotel.model.Huesped;
import com.api.hotel.model.Reserva;
import com.api.hotel.repository.HuespedRepository;
import com.api.hotel.repository.ReservaRpository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservaService {

    @Autowired
    private ReservaRpository reservaRpository;

    //Moestrar a los reserva
    public List<Reserva> getAllHuespedes(){
        return reservaRpository.findAll();
    }

    //Crear un reserva
    public Reserva createHuesped(Reserva reserva){
        return reservaRpository.save(reserva);
    }

    //Editar una reserva
    public Reserva updateHuesped(Reserva reserva){
        return reservaRpository.save(reserva);
    }

    //Eliminar reserva
    public void deleteReservaById(Long id){
        reservaRpository.deleteById(id);
    }
}
