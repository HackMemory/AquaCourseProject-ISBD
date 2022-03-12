package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.entity.CharacterEntity;
import ru.itmo.aquacourseproject.entity.WarEntity;
import ru.itmo.aquacourseproject.repository.CharacterEntityRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CharacterService {
    private final CharacterEntityRepository repository;

    public CharacterService(CharacterEntityRepository repository) {
        this.repository = repository;
    }

    public List<CharacterEntity> findAll() {
        return (List<CharacterEntity>) repository.findAll();
    }

    public Optional<CharacterEntity> findById(Integer id){
        return repository.findById(id);
    }

    public CharacterEntity save(CharacterEntity entity){
        return repository.save(entity);
    }
}
