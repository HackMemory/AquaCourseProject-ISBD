package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.LocationEntity;

public interface LocationEntityRepository extends CrudRepository<LocationEntity, Integer> {
}