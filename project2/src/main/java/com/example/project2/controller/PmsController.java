package com.example.project2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.project2.model.Pms;
import com.example.project2.model.Pms;
import com.example.project2.repository.PmsRepo;
import com.example.project2.repository.PmsRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class PmsController{
    @Autowired
    PmsRepo repo;
    @GetMapping("/users")
    public List<Pms> getAllPms()
    {
        List<Pms> pms =repo.findAll();
        return pms;
    }
    @GetMapping("/users/{id}")
    public Pms getPms(@PathVariable int id)
    {
        Pms pms = repo.findById(id).get();
        return pms;
    }
    @PostMapping("/users/add")
    public void createPms(@RequestBody Pms pms)
    {
        repo.save(pms);
    }
    @PutMapping("/users/update/{id}")
    public void updatePms(@PathVariable int id)
    {
        Pms pms = repo.findById(id).get();
        pms.setPname("Task Monitor");
        pms.setDays(20);
        pms.setTeamlead("sharma");
        repo.save(pms);
    }
    @DeleteMapping("/users/delete/{id}")
    public void deletePms(@PathVariable int id)
    {
        Pms pms = repo.findById(id).get();
        repo.delete(pms);
    }
}