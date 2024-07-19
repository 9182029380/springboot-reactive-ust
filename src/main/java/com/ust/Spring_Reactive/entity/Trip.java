package com.ust.Spring_Reactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "trip")
public class Trip {
    public String id;
    public String name;
    public String destination;
    public String duration;
    public double price;
    public int rating;
    public String description;
    public String status;

}
