package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.WarResultEntity;
import ru.itmo.aquacourseproject.repository.WarResultEntityRepository;

import java.util.List;

@Service
public class WarResultService {
    private final WarResultEntityRepository repository;

    public WarResultService(WarResultEntityRepository repository) {
        this.repository = repository;
    }

    public List<WarResultEntity> findAll() {
        return (List<WarResultEntity>) repository.findAll();
    }
}
