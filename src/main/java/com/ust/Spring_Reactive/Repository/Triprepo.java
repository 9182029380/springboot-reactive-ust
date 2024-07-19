package com.ust.Spring_Reactive.Repository;

import com.ust.Spring_Reactive.entity.Trip;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Triprepo extends ReactiveMongoRepository<Trip,String> {
}
