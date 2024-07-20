package com.ust.Spring_Reactive.controller;

import com.ust.Spring_Reactive.dto.Tripdto;
import com.ust.Spring_Reactive.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/trip")
public class TripController {
    @Autowired
    private TripService tripService;

    @PostMapping("/addtrip")
        public Mono<Tripdto> addTrip(@RequestBody Mono<Tripdto> tripdtomono){
            return tripService.addTrip(tripdtomono);
        }
    @GetMapping("/gettrips")
    public Flux<Tripdto> getAllTrips(){
        return tripService.getAllTrips();
    }

    @GetMapping("/gettrip/{id}")
    public Mono<Tripdto> getTripById(@PathVariable String id){
        return tripService.getTripById(id);
    }
    @PutMapping("/updatetrip/{id}")
    public Mono<Tripdto> updateTrip(@PathVariable String id, @RequestBody Mono<Tripdto> tripdtomono){
        return tripService.updateTrip(id, tripdtomono);
    }
    @DeleteMapping("/deletetrip/{id}")
    public Mono<Void> deleteTrip(@PathVariable String id){
        return tripService.deleteTrip(id);
    }

}
