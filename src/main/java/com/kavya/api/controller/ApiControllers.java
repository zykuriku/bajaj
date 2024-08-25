package com.kavya.api.controller;


import com.kavya.api.models.Info;
import com.kavya.api.repo.SeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ApiControllers {

    @Autowired
    private SeriesRepo seriesRepo;


    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome to BFHL API!";
    }

    @GetMapping(value = "/bfhl")

    public List<Info> getSeries()
    {
        return seriesRepo.findAll();
    }


    @GetMapping(value = "/series/{name}")
    public ResponseEntity<Info> getSeriesByName(@PathVariable String name) {
        Optional<Info> series = seriesRepo.findByName(name);
        return series.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping(value = "/save")
    public String saveSeries(@RequestBody Info series){
        seriesRepo.save(series);
        return "saved..";
    }



}
