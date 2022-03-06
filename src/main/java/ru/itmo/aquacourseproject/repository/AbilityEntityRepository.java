package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.AbilityEntity;

public interface AbilityEntityRepository extends CrudRepository<AbilityEntity, Integer> {
}