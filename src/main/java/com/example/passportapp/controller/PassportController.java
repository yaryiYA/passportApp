package com.example.passportapp.controller;

import com.example.passportapp.entity.Passport;
import com.example.passportapp.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/passport")
public class PassportController {
    private final CommonService<Passport> passportService;
    @Autowired
    public PassportController(CommonService<Passport> passportService) {
        this.passportService = passportService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Passport>> getAll() {
       return ResponseEntity.ok(passportService.findAll());
    }

    @GetMapping("/{UUID}")
    public ResponseEntity<Passport> findById(@PathVariable("UUID") UUID uuid) {
        return ResponseEntity.ok(passportService.findEntity(uuid).get());
    }

    @PostMapping("/create")
    public ResponseEntity<Passport> createEntity(@RequestBody Passport passport) {
        return ResponseEntity.ok(passportService.create(passport));

    }
    @PutMapping("/save")
    public ResponseEntity<Passport> saveEntity(@RequestBody Passport passport) {
        return ResponseEntity.ok(passportService.update(passport));
    }

    @DeleteMapping("/delete/{UUID}")
    public ResponseEntity<String> deleteEntity(@PathVariable("UUID") UUID uuid) {
        passportService.delete(uuid);
        return ResponseEntity.ok("delete Entity");
    }



}
