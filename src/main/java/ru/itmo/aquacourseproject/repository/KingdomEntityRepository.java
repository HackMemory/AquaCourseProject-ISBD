package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.KingdomEntity;

@Repository
public interface KingdomEntityRepository extends CrudRepository<KingdomEntity, Integer> {
}