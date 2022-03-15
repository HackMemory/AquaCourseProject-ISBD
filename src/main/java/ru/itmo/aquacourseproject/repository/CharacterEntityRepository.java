package ru.itmo.aquacourseproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.CharacterEntity;
import ru.itmo.aquacourseproject.entity.WeaponEntity;

@Repository
public interface CharacterEntityRepository extends CrudRepository<CharacterEntity, Integer> {
    @Query(nativeQuery = true, value = "select 1 from upgrade_weapon( :charId )")
    int upgradeWeapon(@Param("charId") int charId);
}