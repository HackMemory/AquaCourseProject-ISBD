package ru.itmo.aquacourseproject;

import org.springframework.web.bind.annotation.*;
import ru.itmo.aquacourseproject.DTOmodel.*;
import ru.itmo.aquacourseproject.entity.*;
import ru.itmo.aquacourseproject.service.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    private final MapService mapService;
    private final AbilityService abilityService;
    private final AllianceService allianceService;
    private final CharacterService characterService;
    private final DuelService duelService;
    private final DuelResultService duelResultService;
    private final KingdomService kingdomService;
    private final LocationService locationService;
    private final WarService warService;
    private final WarResultService warResultService;
    private final WeaponService weaponService;

    public MainController(MapService mapService, AbilityService abilityService, AllianceService allianceService, CharacterService characterService, DuelService duelService, DuelResultService duelResultService, KingdomService kingdomService, LocationService locationService, WarService warService, WarResultService warResultService, WeaponService weaponService) {
        this.mapService = mapService;
        this.abilityService = abilityService;
        this.allianceService = allianceService;
        this.characterService = characterService;
        this.duelService = duelService;
        this.duelResultService = duelResultService;
        this.kingdomService = kingdomService;
        this.locationService = locationService;
        this.warService = warService;
        this.warResultService = warResultService;
        this.weaponService = weaponService;
    }

    @GetMapping("/get/abilities")
    public List<AbilityEntityDto> getAbilities() {
        return mapService.getAbilities();
    }

    @GetMapping("/get/abilities/{id}")
    public Object getAbilitiesById(@PathVariable("id") int id) {
        Optional<AbilityEntity> entity = abilityService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertToAbilityDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/alliances")
    public List<AllianceEntityDto> getAlliances() {
        return mapService.getAlliances();
    }

    @GetMapping("/get/characters")
    public List<CharacterEntityDto> getCharacters() {
        return mapService.getCharacters();
    }

    @GetMapping("/get/duel-results")
    public List<DuelResultEntityDto> getDuelResults() {
        return mapService.getDuelResults();
    }

    @GetMapping("/get/duels")
    public List<DuelEntityDto> getDuels() {
        return mapService.getDuels();
    }

    @GetMapping("/get/kingdoms")
    public List<KingdomEntityDto> getKingdoms() {
        return mapService.getKingdoms();
    }

    @GetMapping("/get/locations")
    public List<LocationEntityDto> getLocations() {
        return mapService.getLocations();
    }

    @GetMapping("/get/war-results")
    public List<WarResultEntityDto> getWarResults() {
        return mapService.getWarResults();
    }

    @GetMapping("/get/wars")
    public List<WarEntityDto> getWars() {
        return mapService.getWars();
    }

    @GetMapping("/get/weapons")
    public List<WeaponEntityDto> getWeapons() {
        return mapService.getWeapons();
    }

    @PostMapping("/add/abilities")
    public ResponseDTO addAbilities(@RequestBody AbilityEntityDto abilityEntityDto){
        try{
            AbilityEntity ability = new AbilityEntity();
            ability.setDescription(abilityEntityDto.getDescription());
            ability.setPower(abilityEntityDto.getPower());

            return new ResponseDTO(true, mapService.convertToAbilityDTO(abilityService.save(ability)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

}
