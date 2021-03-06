package ru.itmo.aquacourseproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.WeaponEntity;

import java.util.Optional;

@Repository
public interface WeaponEntityRepository extends CrudRepository<WeaponEntity, Integer> {
}