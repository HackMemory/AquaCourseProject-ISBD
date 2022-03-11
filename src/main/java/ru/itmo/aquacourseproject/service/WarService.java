package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.WarEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WarService {
    private final WarEntityRepository repository;

    public WarService(WarEntityRepository repository) {
        this.repository = repository;
    }

    public List<WarEntity> findAll() {
        return (List<WarEntity>) repository.findAll();
    }

    public Optional<WarEntity> findById(Long id){
        return repository.findById(id);
    }

    public WarEntity save(WarEntity entity){
        return repository.save(entity);
    }
}
