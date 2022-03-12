package ru.itmo.aquacourseproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.AbilityEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.AbilityEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AbilityService {
    private final AbilityEntityRepository repository;

    public AbilityService(AbilityEntityRepository repository) {
        this.repository = repository;
    }

    public List<AbilityEntity> findAll() {
        return (List<AbilityEntity>) repository.findAll();
    }

    public Optional<AbilityEntity> findById(Integer id){
        return repository.findById(id);
    }

    public AbilityEntity save(AbilityEntity entity){
        return repository.save(entity);
    }
}
