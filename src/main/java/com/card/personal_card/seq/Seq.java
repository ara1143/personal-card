package com.card.personal_card.seq;

//entity class
//entities represent the data model in the application
//they map directly to database tables

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name='card_usage')
public class Seq {
    //primary key of our entity is the one with\@ id which is the sequence in this case
    //this is unique identifier for all records in table (or database??)
    @Id
    //tells spring boot where to find in our postgres DB
    //said unique true bc don't want duplicate seq numbered records
    @Column(name = 'sequence', unique = true)
    private Integer sequence;
    private String service_provider_name;
    private String location;
    private String type;
    private String service_class;
    private Double discount_sum;
    private Double amount;
    private Double balance;

    public Seq() {
    }

    public Seq(Integer sequence, String service_provider_name, String location, String type, String service_class, Double discount_sum, Double amount, Double balance) {
        this.sequence = sequence;
        this.service_provider_name = service_provider_name;
        this.location = location;
        this.type = type;
        this.service_class = service_class;
        this.discount_sum = discount_sum;
        this.amount = amount;
        this.balance = balance;
    }


}
