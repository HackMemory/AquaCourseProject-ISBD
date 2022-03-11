package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.AllianceEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.AllianceEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AllianceService {
    private final AllianceEntityRepository repository;

    public AllianceService(AllianceEntityRepository repository) {
        this.repository = repository;
    }

    public List<AllianceEntity> findAll() {
        return (List<AllianceEntity>) repository.findAll();
    }

    public Optional<AllianceEntity> findById(Long id){
        return repository.findById(id);
    }

    public AllianceEntity save(AllianceEntity entity){
        return repository.save(entity);
    }
}
