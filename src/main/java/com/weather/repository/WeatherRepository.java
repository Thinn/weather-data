package com.weather.repository;

import com.weather.domain.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WeatherRepository extends MongoRepository<Country, String> {
}
