package com.example.passportapp.repository;

import com.example.passportapp.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PassportRepository extends JpaRepository<Passport, UUID> {
}