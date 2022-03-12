package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.LocationEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.LocationEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    private final LocationEntityRepository repository;

    public LocationService(LocationEntityRepository repository) {
        this.repository = repository;
    }

    public List<LocationEntity> findAll() {
        return (List<LocationEntity>) repository.findAll();
    }

    public Optional<LocationEntity> findById(Integer id){
        return repository.findById(id);
    }

    public LocationEntity save(LocationEntity entity){
        return repository.save(entity);
    }
}
