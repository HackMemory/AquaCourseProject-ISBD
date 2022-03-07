package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.WarEntityRepository;

import java.util.List;

@Service
public class WarService {
    private final WarEntityRepository repository;

    public WarService(WarEntityRepository repository) {
        this.repository = repository;
    }

    public List<WarEntity> findAll() {
        return (List<WarEntity>) repository.findAll();
    }
}
