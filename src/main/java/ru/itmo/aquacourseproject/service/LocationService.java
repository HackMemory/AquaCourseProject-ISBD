package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.LocationEntity;
import ru.itmo.aquacourseproject.repository.LocationEntityRepository;

import java.util.List;

@Service
public class LocationService {
    private final LocationEntityRepository repository;

    public LocationService(LocationEntityRepository repository) {
        this.repository = repository;
    }

    public List<LocationEntity> findAll() {
        return (List<LocationEntity>) repository.findAll();
    }
}
