package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.WarEntity;

public interface WarEntityRepository extends CrudRepository<WarEntity, Integer> {
}