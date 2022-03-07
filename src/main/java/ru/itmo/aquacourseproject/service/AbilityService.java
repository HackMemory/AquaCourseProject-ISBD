package ru.itmo.aquacourseproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.AbilityEntity;
import ru.itmo.aquacourseproject.repository.AbilityEntityRepository;

import java.util.List;

@Service
public class AbilityService {
    private final AbilityEntityRepository repository;

    public AbilityService(AbilityEntityRepository repository) {
        this.repository = repository;
    }

    public List<AbilityEntity> findAll() {
        return (List<AbilityEntity>) repository.findAll();
    }
}
