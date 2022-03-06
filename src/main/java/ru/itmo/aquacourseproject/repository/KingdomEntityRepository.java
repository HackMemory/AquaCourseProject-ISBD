package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.KingdomEntity;

public interface KingdomEntityRepository extends CrudRepository<KingdomEntity, Integer> {
}