package ru.itmo.aquacourseproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.itmo.aquacourseproject.entity.CharacterEntity;
import ru.itmo.aquacourseproject.entity.KingdomEntity;

import java.util.List;

@Repository
public interface KingdomEntityRepository extends CrudRepository<KingdomEntity, Integer> {
    List<KingdomEntity> findKingdomEntityByCharacterId(Integer id);
    List<KingdomEntity> findKingdomEntityByAllianceId(Integer id);

    @Query(nativeQuery = true, value = "select 1 from upgrade_kingdom_army( :kingdomId )")
    int upgradeArmy(@Param("kingdomId") int kingdomId);
}