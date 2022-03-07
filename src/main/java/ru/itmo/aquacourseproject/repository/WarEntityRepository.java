package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.WarEntity;

@Repository
public interface WarEntityRepository extends CrudRepository<WarEntity, Long> {
}