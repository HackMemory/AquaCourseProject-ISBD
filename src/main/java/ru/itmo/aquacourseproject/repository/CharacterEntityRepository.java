package ru.itmo.aquacourseproject.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itmo.aquacourseproject.entity.CharacterEntity;

public interface CharacterEntityRepository extends CrudRepository<CharacterEntity, Integer> {
}