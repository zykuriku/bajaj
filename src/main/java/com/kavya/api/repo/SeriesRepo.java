package com.kavya.api.repo;

import com.kavya.api.models.WebSeries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SeriesRepo extends JpaRepository<WebSeries, Long> {

    WebSeries findByName(String name);
}
