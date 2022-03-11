package ru.itmo.aquacourseproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmo.aquacourseproject.DTOmodel.*;
import ru.itmo.aquacourseproject.entity.*;
import ru.itmo.aquacourseproject.service.*;

import java.util.List;

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

    @GetMapping("/abilities")
    public List<AbilityEntityDto> getAbilities() {
        return mapService.getAbilities();
    }

    @GetMapping("/alliances")
    public List<AllianceEntityDto> getAlliances() {
        return mapService.getAlliances();
    }

    @GetMapping("/characters")
    public List<CharacterEntityDto> getCharacters() {
        return mapService.getCharacters();
    }

    @GetMapping("/duel-results")
    public List<DuelResultEntityDto> getDuelResults() {
        return mapService.getDuelResults();
    }

    @GetMapping("/duels")
    public List<DuelEntityDto> getDuels() {
        return mapService.getDuels();
    }

    @GetMapping("/kingdoms")
    public List<KingdomEntityDto> getKingdoms() {
        return mapService.getKingdoms();
    }

    @GetMapping("/locations")
    public List<LocationEntityDto> getLocations() {
        return mapService.getLocations();
    }

    @GetMapping("/war-results")
    public List<WarResultEntityDto> getWarResults() {
        return mapService.getWarResults();
    }

    @GetMapping("/wars")
    public List<WarEntityDto> getWars() {
        return mapService.getWars();
    }

    @GetMapping("/weapons")
    public List<WeaponEntityDto> getWeapons() {
        return mapService.getWeapons();
    }



}
