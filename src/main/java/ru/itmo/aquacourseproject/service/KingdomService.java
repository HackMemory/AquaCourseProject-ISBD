package ru.itmo.aquacourseproject.service;


import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.CharacterEntity;
import ru.itmo.aquacourseproject.entity.KingdomEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.KingdomEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class KingdomService {
    private final KingdomEntityRepository repository;

    public KingdomService(KingdomEntityRepository repository) {
        this.repository = repository;
    }

    public List<KingdomEntity> findAll() {
        return (List<KingdomEntity>) repository.findAll();
    }

    public Optional<KingdomEntity> findById(Integer id){
        return repository.findById(id);
    }

    public List<KingdomEntity> findByCharId(Integer id){ return repository.findKingdomEntityByCharacterId(id); }

    public List<KingdomEntity> findByAllId(Integer id){ return repository.findKingdomEntityByAllianceId(id); }

    public void upgradeArmy(Integer kingdomId){ repository.upgradeArmy(kingdomId); }

    public KingdomEntity save(KingdomEntity entity){
        return repository.save(entity);
    }
}
