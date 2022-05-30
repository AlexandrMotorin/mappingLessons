package com.example.mapperlesson.habr;

import com.example.mapperlesson.habr.model.Unicorn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnicornRepo extends JpaRepository<Unicorn, Long> {
}
