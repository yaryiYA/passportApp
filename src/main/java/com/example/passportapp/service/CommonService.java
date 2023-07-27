package com.example.passportapp.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CommonService <T>{

    List<T> findAll();

    Optional<T> findEntity(UUID uuid);

    T create(T object);

    T update( T object);

    void delete(UUID uuid);
}
