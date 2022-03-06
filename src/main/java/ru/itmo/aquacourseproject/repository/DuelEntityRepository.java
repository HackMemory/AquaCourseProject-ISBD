package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.DuelEntity;

public interface DuelEntityRepository extends CrudRepository<DuelEntity, Integer> {
}