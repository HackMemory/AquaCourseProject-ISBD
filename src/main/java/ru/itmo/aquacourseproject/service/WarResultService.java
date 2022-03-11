package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.entity.WarResultEntity;
import ru.itmo.aquacourseproject.repository.WarResultEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WarResultService {
    private final WarResultEntityRepository repository;

    public WarResultService(WarResultEntityRepository repository) {
        this.repository = repository;
    }

    public List<WarResultEntity> findAll() {
        return (List<WarResultEntity>) repository.findAll();
    }

    public Optional<WarResultEntity> findById(Long id){
        return repository.findById(id);
    }

    public WarResultEntity save(WarResultEntity entity){
        return repository.save(entity);
    }
}
