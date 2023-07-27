package com.example.passportapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "passport")
public class Passport  {

    @Id

    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "serial_passport")
    private Integer serialPassport;

    @Column(name = "number_passport")
    private Integer numberPassport;



    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    private Date createdDate;

}