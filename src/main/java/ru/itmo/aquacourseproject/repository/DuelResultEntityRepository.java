package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.DuelResultEntity;

@Repository
public interface DuelResultEntityRepository extends CrudRepository<DuelResultEntity, Integer> {
}