package com.kavya.api.models;

import java.util.List;

public class WebSeries {

    private int id;
    private String name;
    private String description;
    private double rating;
    private List<String> platformsFree;
    private List<String> allPlatforms;
    private String genre;
    private int year;
    private int seasons;
    private List<Integer> episodesPerSeason;
    private List<String> languages;
    private List<String> cast;
    private List<String> creators;


    public void setAllPlatforms(List<String> allPlatforms) {
        this.allPlatforms = allPlatforms;
    }

    public List<Integer> getEpisodesPerSeason() {
        return episodesPerSeason;
    }
}
