package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.WarResultEntity;

@Repository
public interface WarResultEntityRepository extends CrudRepository<WarResultEntity, Integer> {
    WarResultEntity findWarResultEntityByWarId(Integer id);
}