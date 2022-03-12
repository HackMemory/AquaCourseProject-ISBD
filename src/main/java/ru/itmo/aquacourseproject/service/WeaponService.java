package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.entity.WeaponEntity;
import ru.itmo.aquacourseproject.repository.WeaponEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class WeaponService {
    private final WeaponEntityRepository repository;

    public WeaponService(WeaponEntityRepository repository) {
        this.repository = repository;
    }

    public List<WeaponEntity> findAll() {
        return (List<WeaponEntity>) repository.findAll();
    }

    public Optional<WeaponEntity> findById(Integer id){
        return repository.findById(id);
    }

    public WeaponEntity save(WeaponEntity entity){
        return repository.save(entity);
    }
}
