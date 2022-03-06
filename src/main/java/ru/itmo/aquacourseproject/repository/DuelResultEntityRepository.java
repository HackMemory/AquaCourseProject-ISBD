package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.DuelResultEntity;

public interface DuelResultEntityRepository extends CrudRepository<DuelResultEntity, Integer> {
}