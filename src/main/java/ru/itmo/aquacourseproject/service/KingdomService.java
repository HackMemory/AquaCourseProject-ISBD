package ru.itmo.aquacourseproject.service;


import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.KingdomEntity;
import ru.itmo.aquacourseproject.repository.KingdomEntityRepository;

import java.util.List;

@Service
public class KingdomService {
    private final KingdomEntityRepository repository;

    public KingdomService(KingdomEntityRepository repository) {
        this.repository = repository;
    }

    public List<KingdomEntity> findAll() {
        return (List<KingdomEntity>) repository.findAll();
    }
}
