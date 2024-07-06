package com.kavya.api.controller;


import com.kavya.api.models.WebSeries;
import com.kavya.api.repo.SeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private SeriesRepo seriesRepo;


    @GetMapping(value = "/")
    public String getPage()
    {
        return "Welcome";
    }

    @GetMapping(value = "/series")

    public List<WebSeries> getSeries()
    {
        List<WebSeries> all = seriesRepo.findAll();
        return all;
    }

    @PostMapping(value = "/save")
    public String saveSeries(@RequestBody WebSeries series){
        seriesRepo.save(series);
        return "saved..";
    }

    @PutMapping(value = "/delete/{id}")
    public String updateSeries(@PathVariable long id, @RequestBody WebSeries series){
        WebSeries updatedSeries= seriesRepo.findById(id).get();
        updatedSeries.setDescription(series.getDescription());
        updatedSeries.setName(series.getName());
        updatedSeries.setGenre(series.getGenre());
        updatedSeries.setYear(series.getYear());
        updatedSeries.setRating(series.getRating());
        updatedSeries.setSeasons(series.getSeasons());
        seriesRepo.save(series);
        return "updated..";
    }


}
