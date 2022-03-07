package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.DuelResultEntity;
import ru.itmo.aquacourseproject.repository.DuelResultEntityRepository;

import java.util.List;

@Service
public class DuelResultService {
    private final DuelResultEntityRepository repository;

    public DuelResultService(DuelResultEntityRepository repository) {
        this.repository = repository;
    }

    public List<DuelResultEntity> findAll() {
        return (List<DuelResultEntity>) repository.findAll();
    }
}
