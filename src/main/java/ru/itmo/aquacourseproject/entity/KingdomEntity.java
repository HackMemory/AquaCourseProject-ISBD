package ru.itmo.aquacourseproject.entity;

import ru.itmo.aquacourseproject.enums.CategoryEnum;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kingdom", schema = "s289136", catalog = "studs")
public class KingdomEntity {
    private int id;
    private int characterId;
    private int armyStrength;
    private CategoryEnum category;
    private int locationId;
    private Integer allianceId;
    private CharacterEntity characterByCharacterId;
    private LocationEntity locationByLocationId;
    private AllianceEntity allianceByAllianceId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "character_id", insertable = false, updatable = false)
    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    @Basic
    @Column(name = "army_strength")
    public int getArmyStrength() {
        return armyStrength;
    }

    public void setArmyStrength(int armyStrength) {
        this.armyStrength = armyStrength;
    }

    @Basic
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    @Basic
    @Column(name = "location_id", insertable = false, updatable = false)
    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "alliance_id", insertable = false, updatable = false)
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KingdomEntity that = (KingdomEntity) o;
        return id == that.id && characterId == that.characterId && armyStrength == that.armyStrength && locationId == that.locationId && Objects.equals(category, that.category) && Objects.equals(allianceId, that.allianceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, characterId, armyStrength, category, locationId, allianceId);
    }

    @ManyToOne
    @JoinColumn(name = "character_id", referencedColumnName = "id", nullable = false)
    public CharacterEntity getCharacterByCharacterId() {
        return characterByCharacterId;
    }

    public void setCharacterByCharacterId(CharacterEntity characterByCharacterId) {
        this.characterByCharacterId = characterByCharacterId;
    }

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    public LocationEntity getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(LocationEntity locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    @ManyToOne
    @JoinColumn(name = "alliance_id", referencedColumnName = "id")
    public AllianceEntity getAllianceByAllianceId() {
        return allianceByAllianceId;
    }

    public void setAllianceByAllianceId(AllianceEntity allianceByAllianceId) {
        this.allianceByAllianceId = allianceByAllianceId;
    }
}
