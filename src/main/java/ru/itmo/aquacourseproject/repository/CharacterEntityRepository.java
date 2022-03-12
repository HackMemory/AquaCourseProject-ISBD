package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.CharacterEntity;

@Repository
public interface CharacterEntityRepository extends CrudRepository<CharacterEntity, Integer> {
}