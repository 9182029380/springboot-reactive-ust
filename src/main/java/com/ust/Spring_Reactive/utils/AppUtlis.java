package com.ust.Spring_Reactive.utils;

import com.ust.Spring_Reactive.dto.Tripdto;
import com.ust.Spring_Reactive.entity.Trip;
import org.springframework.beans.BeanUtils;

public class AppUtlis {

    public static Tripdto entityToDto(Trip trip) {
        Tripdto tripdto1 = new Tripdto();
        BeanUtils.copyProperties(trip, tripdto1);
       return tripdto1;
    }
    public static Trip dtoToEntity(Tripdto tripdto) {
        Trip trip = new Trip();
        BeanUtils.copyProperties(tripdto, trip);
        return trip;
    }
}
