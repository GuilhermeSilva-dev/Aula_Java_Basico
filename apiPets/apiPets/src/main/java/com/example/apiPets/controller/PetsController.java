package com.example.apiPets.controller;

import com.example.apiPets.model.PetsModel;
import com.example.apiPets.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Pets")
public class PetsController {
    @Autowired
    private PetsRepository pets;

    @GetMapping
    public List<PetsModel> listarTodos() {
        return pets.findAll();

    }
}
