package ru.itmo.aquacourseproject.service;

import org.springframework.stereotype.Service;
import ru.itmo.aquacourseproject.DTOmodel.*;
import ru.itmo.aquacourseproject.entity.*;
import ru.itmo.aquacourseproject.repository.*;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapService {
    private final AbilityEntityRepository abilityEntityRepository;
    private final AllianceEntityRepository allianceEntityRepository;
    private final CharacterEntityRepository characterEntityRepository;
    private final DuelResultEntityRepository duelResultEntityRepository;
    private final DuelEntityRepository duelEntityRepository;
    private final KingdomEntityRepository kingdomEntityRepository;
    private final LocationEntityRepository locationEntityRepository;
    private final WarResultEntityRepository warResultEntityRepository;
    private final WarEntityRepository warEntityRepository;
    private final WeaponEntityRepository weaponEntityRepository;

    public MapService(AbilityEntityRepository abilityEntityRepository, AllianceEntityRepository allianceEntityRepository, CharacterEntityRepository characterEntityRepository, DuelResultEntityRepository duelResultEntityRepository, DuelEntityRepository duelEntityRepository, KingdomEntityRepository kingdomEntityRepository, LocationEntityRepository locationEntityRepository, WarResultEntityRepository warResultEntityRepository, WarEntityRepository warEntityRepository, WeaponEntityRepository weaponEntityRepository) {
        this.abilityEntityRepository = abilityEntityRepository;
        this.allianceEntityRepository = allianceEntityRepository;
        this.characterEntityRepository = characterEntityRepository;
        this.duelResultEntityRepository = duelResultEntityRepository;
        this.duelEntityRepository = duelEntityRepository;
        this.kingdomEntityRepository = kingdomEntityRepository;
        this.locationEntityRepository = locationEntityRepository;
        this.warResultEntityRepository = warResultEntityRepository;
        this.warEntityRepository = warEntityRepository;
        this.weaponEntityRepository = weaponEntityRepository;
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

    public List<AllianceEntityDto> getAlliances(){
        return ((List<AllianceEntity>) allianceEntityRepository
                .findAll())
                .stream()
                .map(this::convertAllianceDTO)
                .collect(Collectors.toList());
    }

    private AllianceEntityDto convertAllianceDTO(AllianceEntity alliance){
        return new AllianceEntityDto(alliance.getId(), alliance.getAllianceName(), alliance.getAllianceAge(), alliance.getAllianceType());
    }

    public List<CharacterEntityDto> getCharacters(){
        return ((List<CharacterEntity>) characterEntityRepository
                .findAll())
                .stream()
                .map(this::convertCharacterDTO)
                .collect(Collectors.toList());
    }

    private CharacterEntityDto convertCharacterDTO(CharacterEntity character){
        return new CharacterEntityDto(character.getId(), character.getName(), character.getSurname(), character.getAge(), character.getWeaponId(), character.getAllianceId());
    }

    public List<DuelResultEntityDto> getDuelResults(){
        return ((List<DuelResultEntity>) duelResultEntityRepository
                .findAll())
                .stream()
                .map(this::convertDuelResultDTO)
                .collect(Collectors.toList());
    }

    private DuelResultEntityDto convertDuelResultDTO(DuelResultEntity duelResult){
        return new DuelResultEntityDto(duelResult.getId(), duelResult.getDuelId(), duelResult.getWinCharId());
    }

    public List<DuelEntityDto> getDuels(){
        return ((List<DuelEntity>) duelEntityRepository
                .findAll())
                .stream()
                .map(this::convertDuelDTO)
                .collect(Collectors.toList());
    }

    private DuelEntityDto convertDuelDTO(DuelEntity duel){
        return new DuelEntityDto(duel.getId(), duel.getAttackCharId(), duel.getAttackCharId(), duel.getLocationId(), duel.getTime());
    }

    public List<KingdomEntityDto> getKingdoms(){
        return ((List<KingdomEntity>) kingdomEntityRepository
                .findAll())
                .stream()
                .map(this::convertKingdomDTO)
                .collect(Collectors.toList());
    }

    private KingdomEntityDto convertKingdomDTO(KingdomEntity kingdom){
        return new KingdomEntityDto(kingdom.getId(), kingdom.getCharacterId(), kingdom.getArmyStrength(), kingdom.getCategory(), kingdom.getLocationId(), kingdom.getAllianceId());
    }

    public List<LocationEntityDto> getLocations(){
        return ((List<LocationEntity>) locationEntityRepository
                .findAll())
                .stream()
                .map(this::convertLocationDTO)
                .collect(Collectors.toList());
    }

    private LocationEntityDto convertLocationDTO(LocationEntity location){
        return new LocationEntityDto(location.getId(), location.getX(), location.getY(), location.getZ());
    }

    public List<WarResultEntityDto> getWarResults(){
        return ((List<WarResultEntity>) warResultEntityRepository
                .findAll())
                .stream()
                .map(this::convertWarResultDTO)
                .collect(Collectors.toList());
    }

    private WarResultEntityDto convertWarResultDTO(WarResultEntity warResult){
        return new WarResultEntityDto(warResult.getId(), warResult.getWarId(), warResult.getWinAllianceId());
    }

    public List<WarEntityDto> getWars(){
        return ((List<WarEntity>) warEntityRepository
                .findAll())
                .stream()
                .map(this::convertWarDTO)
                .collect(Collectors.toList());
    }

    private WarEntityDto convertWarDTO(WarEntity war){
        return new WarEntityDto(war.getId(), war.getAttackAllId(), war.getDefeatAllId(), war.getLocationId(), war.getTime());
    }

    public List<WeaponEntityDto> getWeapons(){
        return ((List<WeaponEntity>) weaponEntityRepository
                .findAll())
                .stream()
                .map(this::convertWeaponDTO)
                .collect(Collectors.toList());
    }

    private WeaponEntityDto convertWeaponDTO(WeaponEntity weapon){
        return new WeaponEntityDto(weapon.getId(), weapon.getEnchanted(), weapon.getStrength(), weapon.getAbilityId());
    }
}

