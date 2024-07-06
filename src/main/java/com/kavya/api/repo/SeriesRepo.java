package com.kavya.api.repo;

import com.kavya.api.models.WebSeries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepo extends JpaRepository<WebSeries, Long> {
}
