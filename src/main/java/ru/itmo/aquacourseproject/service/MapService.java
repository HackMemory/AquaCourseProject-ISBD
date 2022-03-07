package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.DTOmodel.AbilityEntityDto;
import ru.itmo.aquacourseproject.entity.AbilityEntity;
import ru.itmo.aquacourseproject.repository.AbilityEntityRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapService {
    private final AbilityEntityRepository abilityEntityRepository;

    public MapService(AbilityEntityRepository abilityEntityRepository) {
        this.abilityEntityRepository = abilityEntityRepository;
    }


    public List<AbilityEntityDto> getAbilities(){
        return ((List<AbilityEntity>) abilityEntityRepository
                .findAll())
                .stream()
                .map(this::convertToAbilityDTO)
                .collect(Collectors.toList());
    }

    private AbilityEntityDto convertToAbilityDTO(AbilityEntity ability){
        return new AbilityEntityDto(ability.getId(), ability.getDescription(), ability.getPower());
    }
}
