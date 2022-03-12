package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.WeaponEntity;

@Repository
public interface WeaponEntityRepository extends CrudRepository<WeaponEntity, Integer> {
}