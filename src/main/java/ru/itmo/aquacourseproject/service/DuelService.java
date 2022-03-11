package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.DuelEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.DuelEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DuelService {
    private final DuelEntityRepository repository;

    public DuelService(DuelEntityRepository repository) {
        this.repository = repository;
    }

    public List<DuelEntity> findAll() {
        return (List<DuelEntity>) repository.findAll();
    }

    public Optional<DuelEntity> findById(Long id){
        return repository.findById(id);
    }

    public DuelEntity save(DuelEntity entity){
        return repository.save(entity);
    }
}
