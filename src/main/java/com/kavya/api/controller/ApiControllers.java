package com.kavya.api.controller;


import com.kavya.api.models.WebSeries;
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
        return "Welcome to Wpick API!";
    }

    @GetMapping(value = "/series")

    public List<WebSeries> getSeries()
    {
        return seriesRepo.findAll();
    }


    @GetMapping(value = "/series/{name}")
    public ResponseEntity<WebSeries> getSeriesByName(@PathVariable String name) {
        Optional<WebSeries> series = seriesRepo.findByName(name);
        return series.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }


    @PostMapping(value = "/save")
    public String saveSeries(@RequestBody WebSeries series){
        seriesRepo.save(series);
        return "saved..";
    }

    @PutMapping(value = "/update/{id}")
    public String updateSeries(@PathVariable long id, @RequestBody WebSeries series){
        WebSeries updatedSeries= seriesRepo.findById(id).get();
        updatedSeries.setDescription(series.getDescription());
        updatedSeries.setName(series.getName());
        updatedSeries.setGenre(series.getGenre());
        updatedSeries.setYear(series.getYear());
        updatedSeries.setRating(series.getRating());
        updatedSeries.setSeasons(series.getSeasons());
        updatedSeries.setCast(series.getCast());
        updatedSeries.setAllPlatforms(series.getAllPlatforms());
        updatedSeries.setEpisodesPerSeason(series.getEpisodesPerSeason());
        updatedSeries.setLanguages(series.getLanguages());
        updatedSeries.setPlatformsFree(series.getPlatformsFree());
        seriesRepo.save(series);
        return "updated..";
    }
    @DeleteMapping(value = "/delete/{id}")

    public String deleteSeries(@PathVariable long id){
        WebSeries deletedSeries = seriesRepo.findById(id).get();
        seriesRepo.delete(deletedSeries);
        return "Delete series with id: "+id;
    }


}
