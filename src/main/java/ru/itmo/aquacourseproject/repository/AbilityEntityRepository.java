package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.AbilityEntity;

@Repository
public interface AbilityEntityRepository extends CrudRepository<AbilityEntity, Integer> {
}