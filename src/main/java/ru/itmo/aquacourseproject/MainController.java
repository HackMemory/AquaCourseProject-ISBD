package ru.itmo.aquacourseproject;

import org.springframework.web.bind.annotation.*;
import ru.itmo.aquacourseproject.DTOmodel.*;
import ru.itmo.aquacourseproject.entity.*;
import ru.itmo.aquacourseproject.service.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
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

    @GetMapping("/get/alliances/{id}")
    public Object getAlliancesById(@PathVariable("id") int id) {
        Optional<AllianceEntity> entity = allianceService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertAllianceDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/characters")
    public List<CharacterEntityDto> getCharacters() {
        return mapService.getCharacters();
    }

    @GetMapping("/get/characters/{id}")
    public Object getCharactersById(@PathVariable("id") int id) {
        Optional<CharacterEntity> entity = characterService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertCharacterDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/duel-results")
    public List<DuelResultEntityDto> getDuelResults() {
        return mapService.getDuelResults();
    }

    @GetMapping("/get/duel-results/{id}")
    public Object getDuelResById(@PathVariable("id") int id) {
        Optional<DuelResultEntity> entity = duelResultService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertDuelResultDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/duelResultsByDuel/{id}")
    public Object getDuelResByDuelId(@PathVariable("id") int id) {
        DuelResultEntity entity = duelResultService.findByDuelId(id);
        return mapService.convertDuelResultDTO(entity);
    }

    @GetMapping("/get/duels")
    public List<DuelEntityDto> getDuels() {
        return mapService.getDuels();
    }

    @GetMapping("/get/duels/{id}")
    public Object getDuelsById(@PathVariable("id") int id) {
        Optional<DuelEntity> entity = duelService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertDuelDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/kingdoms")
    public List<KingdomEntityDto> getKingdoms() {
        return mapService.getKingdoms();
    }

    @GetMapping("/get/kingdoms/{id}")
    public Object getKingdomsById(@PathVariable("id") int id) {
        Optional<KingdomEntity> entity = kingdomService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertKingdomDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/kingdomByCharId/{id}")
    public Object getKingdomByCharId(@PathVariable("id") int id) {
        try {
            Optional<CharacterEntity> character = characterService.findById(id);
            return character.map(characterEntity -> new ResponseDTO(true,
                    kingdomService.findByCharId(characterEntity.getId())
                            .stream()
                            .map(mapService::convertKingdomDTO)
                            .collect(Collectors.toList()))).orElseGet(() -> new ResponseDTO(false, "Not found"));

        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @GetMapping("/get/locations")
    public List<LocationEntityDto> getLocations() {
        return mapService.getLocations();
    }

    @GetMapping("/get/locations/{id}")
    public Object getLocationsById(@PathVariable("id") int id) {
        Optional<LocationEntity> entity = locationService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertLocationDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/war-results")
    public List<WarResultEntityDto> getWarResults() {
        return mapService.getWarResults();
    }

    @GetMapping("/get/war-results/{id}")
    public Object getWarResById(@PathVariable("id") int id) {
        Optional<WarResultEntity> entity = warResultService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertWarResultDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/warResultsByWar/{id}")
    public Object getWarResByWarId(@PathVariable("id") int id) {
        WarResultEntity entity = warResultService.findByWarId(id);
        return mapService.convertWarResultDTO(entity);
    }

    @GetMapping("/get/wars")
    public List<WarEntityDto> getWars() {
        return mapService.getWars();
    }

    @GetMapping("/get/wars/{id}")
    public Object getWarsById(@PathVariable("id") int id) {
        Optional<WarEntity> entity = warService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertWarDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }

    @GetMapping("/get/weapons")
    public List<WeaponEntityDto> getWeapons() {
        return mapService.getWeapons();
    }

    @GetMapping("/get/weapons/{id}")
    public Object getWeaponsById(@PathVariable("id") int id) {
        Optional<WeaponEntity> entity = weaponService.findById(id);
        if(entity.isPresent()) {
            return mapService.convertWeaponDTO(entity.get());
        }

        return new ResponseDTO(false, "Not found");
    }


    @PostMapping("/add/ability")
    public ResponseDTO addAbility(@RequestBody AbilityEntityDto abilityEntityDto){
        try{
            AbilityEntity ability = new AbilityEntity();
            ability.setDescription(abilityEntityDto.getDescription());
            ability.setPower(abilityEntityDto.getPower());

            return new ResponseDTO(true, mapService.convertToAbilityDTO(abilityService.save(ability)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/alliance")
    public ResponseDTO addAlliance(@RequestBody AllianceEntityDto entityDto){
        try{
            AllianceEntity entity = new AllianceEntity();
            entity.setAllianceAge(entityDto.getAllianceAge());
            entity.setAllianceName(entityDto.getAllianceName());
            entity.setAllianceType(entityDto.getAllianceType());

            return new ResponseDTO(true, mapService.convertAllianceDTO(allianceService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/character")
    public ResponseDTO addCharacter(@RequestBody CharacterEntityDto entityDto){
        try{
            CharacterEntity entity = new CharacterEntity();
            entity.setName(entityDto.getName());
            entity.setSurname(entityDto.getSurname());
            entity.setAge(entityDto.getAge());
            entity.setAllianceId(entityDto.getAllianceId());
            entity.setWeaponId(entityDto.getWeaponId());

            return new ResponseDTO(true, mapService.convertCharacterDTO(characterService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/duel")
    public ResponseDTO addDuel(@RequestBody DuelEntityDto entityDto){
        try{
            DuelEntity entity = new DuelEntity();
            entity.setAttackCharId(entityDto.getAttackCharId());
            entity.setDefeatCharId(entityDto.getDefeatCharId());
            entity.setLocationId(entityDto.getLocationId());
            entity.setTime(entityDto.getTime());

            return new ResponseDTO(true, mapService.convertDuelDTO(duelService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/kingdom")
    public ResponseDTO addKingdom(@RequestBody KingdomEntityDto entityDto){
        try{
            KingdomEntity entity = new KingdomEntity();
            entity.setAllianceId(entityDto.getAllianceId());
            entity.setArmyStrength(entityDto.getArmyStrength());
            entity.setCategory(entityDto.getCategory());
            entity.setLocationId(entityDto.getCharacterId());
            entity.setCharacterId(entityDto.getCharacterId());

            return new ResponseDTO(true, mapService.convertKingdomDTO(kingdomService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/location")
    public ResponseDTO addLocation(@RequestBody LocationEntityDto entityDto){
        try{
            LocationEntity entity = new LocationEntity();
            entity.setX(entityDto.getX());
            entity.setY(entityDto.getY());
            entity.setZ(entityDto.getZ());

            return new ResponseDTO(true, mapService.convertLocationDTO(locationService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/war")
    public ResponseDTO addWar(@RequestBody WarEntityDto entityDto){
        try{
            WarEntity entity = new WarEntity();
            entity.setAttackAllId(entityDto.getAttackAllId());
            entity.setDefeatAllId(entityDto.getDefeatAllId());
            entity.setLocationId(entityDto.getLocationId());
            entity.setTime(entityDto.getTime());

            return new ResponseDTO(true, mapService.convertWarDTO(warService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/add/weapon")
    public ResponseDTO addWeapon(@RequestBody WeaponEntityDto entityDto){
        try{
            WeaponEntity entity = new WeaponEntity();
            entity.setAbilityId(entityDto.getAbilityId());
            entity.setEnchanted(entityDto.getIsEnchanted());
            entity.setStrength(entityDto.getStrength());

            return new ResponseDTO(true, mapService.convertWeaponDTO(weaponService.save(entity)));
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @GetMapping("/upgradeWeapon/{id}")
    public WeaponEntityDto upgradeWeapon(@PathVariable("id") int id) {
        characterService.upgradeWeapon(id);
        return mapService.convertWeaponDTO(characterService.findById(id).get().getWeaponByWeaponId());
    }

    @GetMapping("/upgradeArmyByKingdom/{id}")
    public KingdomEntityDto upgradeArmy(@PathVariable("id") int id) {
        kingdomService.upgradeArmy(id);
        return mapService.convertKingdomDTO(kingdomService.findById(id).get());
    }

    @PostMapping("/set/characterAlliance")
    public ResponseDTO setCharacterAlliance(@RequestBody CharacterEntityDto entityDto){
        try{
            Optional<CharacterEntity> entity = characterService.findById(entityDto.getId());
            if(entity.isPresent()){
                List<KingdomEntity> kingdomList = kingdomService.findByCharId(entity.get().getId());
                kingdomList.forEach(k -> k.setAllianceId(entityDto.getAllianceId()));

                entity.get().setAllianceId(entityDto.getAllianceId());
                return new ResponseDTO(true, mapService.convertCharacterDTO(characterService.save(entity.get())));
            }

            return new ResponseDTO(false, "Not Found");
        }catch (Exception e){
            return new ResponseDTO(false, e.getMessage());
        }
    }

    @PostMapping("/changeKingdomsRuler")
    public ResponseDTO changeKingdomsRuler(@RequestBody DuelEntityDto entityDto){
        List<KingdomEntity> kingList = kingdomService.findByCharId(entityDto.getDefeatCharId());
        Optional<CharacterEntity> character = characterService.findById(entityDto.getAttackCharId());
        for(KingdomEntity king : kingList){
            king.setAllianceId(character.get().getAllianceId());
            king.setCharacterId(entityDto.getAttackCharId());
            kingdomService.save(king);
        }

        return new ResponseDTO(true, "OK");
    }

    @PostMapping("/decreaseArmyStrength")
    public ResponseDTO decreaseArmyStrength(@RequestBody DecreaseArmyDTO dto){
        List<KingdomEntity> kingList = kingdomService.findByAllId(dto.getAllianceId());
        kingList.forEach(k ->{
            k.setArmyStrength(Math.round(k.getArmyStrength() * dto.getPercent()));
            kingdomService.save(k);
        });


        return new ResponseDTO(true, "OK");
    }

}
