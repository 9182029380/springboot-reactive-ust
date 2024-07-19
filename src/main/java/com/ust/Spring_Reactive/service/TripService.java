package com.ust.Spring_Reactive.service;

import com.ust.Spring_Reactive.Repository.Triprepo;
import com.ust.Spring_Reactive.dto.Tripdto;

import com.ust.Spring_Reactive.utils.AppUtlis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class TripService {
    @Autowired
    private Triprepo repo;


    public Mono<Tripdto> addTrip(Mono<Tripdto> tripdtomono) {
        return tripdtomono.map(AppUtlis::dtoToEntity)
                          .flatMap(repo::insert)
                .map(AppUtlis::entityToDto);
    }
}
