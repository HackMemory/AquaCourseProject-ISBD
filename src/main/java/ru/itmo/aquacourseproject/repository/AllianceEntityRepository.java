package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.AllianceEntity;

@Repository
public interface AllianceEntityRepository extends CrudRepository<AllianceEntity, Long> {
}