package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.DuelResultEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.DuelResultEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DuelResultService {
    private final DuelResultEntityRepository repository;

    public DuelResultService(DuelResultEntityRepository repository) {
        this.repository = repository;
    }

    public List<DuelResultEntity> findAll() {
        return (List<DuelResultEntity>) repository.findAll();
    }

    public Optional<DuelResultEntity> findById(Long id){
        return repository.findById(id);
    }

    public DuelResultEntity save(DuelResultEntity entity){
        return repository.save(entity);
    }
}
