package com.innovatech.promos.microservicepromos.promos.domain.model.entities;

import com.innovatech.promos.microservicepromos.shared.domain.model.aggregate.AuditableAbstractAggregateRoot;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "promos")
@Getter
@Setter
public class Promo extends AuditableAbstractAggregateRoot<Promo> {
    private String name;
    private String description;
    private String imageUrl;
    private Date validUntil;
}