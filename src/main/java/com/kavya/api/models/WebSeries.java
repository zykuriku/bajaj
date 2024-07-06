package com.kavya.api.models;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class WebSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private double rating;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> platformsFree;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> allPlatforms;
    @Column
    private String genre;
    @Column
    private int year;
    @Column
    private int seasons;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Integer> episodesPerSeason;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> languages;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> cast;
//    private List<String> creators;



    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

//    public List<String> getPlatformsFree() {
//        return platformsFree;
//    }
//
//    public List<String> getAllPlatforms() {
//        return allPlatforms;
//    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getSeasons() {
        return seasons;
    }

//    public List<Integer> getEpisodesPerSeason() {
//        return episodesPerSeason;
//    }
//
//    public List<String> getLanguages() {
//        return languages;
//    }
//
//    public List<String> getCast() {
//        return cast;
//    }
////
//    public List<String> getCreators() {
//        return creators;
//    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setRating(double rating) {
        this.rating = rating;

    }
//    public void setPlatformsFree(List<String> platformsFree) {
//        this.platformsFree = platformsFree;
//    }
//
//    public void setAllPlatforms(List<String> allPlatforms) {
//        this.allPlatforms = allPlatforms;
//    }
    public void setGenre(String genre) {

        this.genre = genre;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setSeasons(int seasons) {
        this.seasons = seasons;

    }
//    public void setEpisodesPerSeason(List<Integer> episodesPerSeason) {
//        this.episodesPerSeason = episodesPerSeason;
//    }
//    public void setLanguages(List<String> languages) {
//        this.languages = languages;
//    }
//    public void setCast(List<String> cast) {
//        this.cast = cast;
//
//    }
//    public void setCreators(List<String> creators) {
//        this.creators = creators;
//    }

    public void setId(Long id) {
        this.id = Math.toIntExact(id);
    }

    public Long getId() {
        return (long) id;
    }
}
