package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.WeaponEntity;
import ru.itmo.aquacourseproject.repository.WeaponEntityRepository;

import java.util.List;

@Service
public class WeaponService {
    private final WeaponEntityRepository repository;

    public WeaponService(WeaponEntityRepository repository) {
        this.repository = repository;
    }

    public List<WeaponEntity> findAll() {
        return (List<WeaponEntity>) repository.findAll();
    }
}
