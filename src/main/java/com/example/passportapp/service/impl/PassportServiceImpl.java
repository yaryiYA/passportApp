package com.example.passportapp.service.impl;

import com.example.passportapp.entity.Passport;
import com.example.passportapp.repository.PassportRepository;
import com.example.passportapp.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PassportServiceImpl implements CommonService<Passport> {

    private final PassportRepository passportRepository;

    @Autowired
    public PassportServiceImpl(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    @Override
    public List<Passport> findAll() {
        return passportRepository.findAll();
    }

    @Override
    public Optional<Passport> findEntity(UUID uuid) {
        return passportRepository.findById(uuid);
    }

    @Override
    public Passport create(Passport object) {
        return passportRepository.save(object);
    }

    @Override
    public Passport update( Passport object) {

        return passportRepository.save(object);
    }

    @Override
    public void delete(UUID uuid) {
        passportRepository.deleteById(uuid);

    }
}
