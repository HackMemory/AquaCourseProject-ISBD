package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.WeaponEntity;

public interface WeaponEntityRepository extends CrudRepository<WeaponEntity, Integer> {
}