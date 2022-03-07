package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.DuelEntity;
import ru.itmo.aquacourseproject.repository.DuelEntityRepository;

import java.util.List;

@Service
public class DuelService {
    private final DuelEntityRepository repository;

    public DuelService(DuelEntityRepository repository) {
        this.repository = repository;
    }

    public List<DuelEntity> findAll() {
        return (List<DuelEntity>) repository.findAll();
    }
}
