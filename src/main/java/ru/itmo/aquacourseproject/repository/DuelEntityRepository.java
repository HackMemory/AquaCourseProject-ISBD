package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.DuelEntity;

@Repository
public interface DuelEntityRepository extends CrudRepository<DuelEntity, Integer> {
}