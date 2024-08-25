package com.kavya.api.repo;

import com.kavya.api.models.Info;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SeriesRepo extends JpaRepository<Info, Long> {

    Optional<Info> findById(int id);
}
