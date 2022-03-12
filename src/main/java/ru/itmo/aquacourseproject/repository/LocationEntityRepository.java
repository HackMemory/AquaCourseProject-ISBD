package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.LocationEntity;

@Repository
public interface LocationEntityRepository extends CrudRepository<LocationEntity, Integer> {
}