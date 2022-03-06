package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "duel", schema = "s289136", catalog = "studs")
public class DuelEntity {
    private int id;
    private int attackCharId;
    private int defeatCharId;
    private int locationId;
    private Date time;
    private CharacterEntity characterByAttackCharId;
    private CharacterEntity characterByDefeatCharId;
    private LocationEntity locationByLocationId;
    private Collection<DuelResultEntity> duelResultsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attack_char_id", insertable = false, updatable = false)
    public int getAttackCharId() {
        return attackCharId;
    }

    public void setAttackCharId(int attackCharId) {
        this.attackCharId = attackCharId;
    }

    @Basic
    @Column(name = "defeat_char_id", insertable = false, updatable = false)
    public int getDefeatCharId() {
        return defeatCharId;
    }

    public void setDefeatCharId(int defeatCharId) {
        this.defeatCharId = defeatCharId;
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
    @Column(name = "time")
    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuelEntity that = (DuelEntity) o;
        return id == that.id && attackCharId == that.attackCharId && defeatCharId == that.defeatCharId && locationId == that.locationId && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attackCharId, defeatCharId, locationId, time);
    }

    @ManyToOne
    @JoinColumn(name = "attack_char_id", referencedColumnName = "id", nullable = false)
    public CharacterEntity getCharacterByAttackCharId() {
        return characterByAttackCharId;
    }

    public void setCharacterByAttackCharId(CharacterEntity characterByAttackCharId) {
        this.characterByAttackCharId = characterByAttackCharId;
    }

    @ManyToOne
    @JoinColumn(name = "defeat_char_id", referencedColumnName = "id", nullable = false)
    public CharacterEntity getCharacterByDefeatCharId() {
        return characterByDefeatCharId;
    }

    public void setCharacterByDefeatCharId(CharacterEntity characterByDefeatCharId) {
        this.characterByDefeatCharId = characterByDefeatCharId;
    }

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    public LocationEntity getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(LocationEntity locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    @OneToMany(mappedBy = "duelByDuelId")
    public Collection<DuelResultEntity> getDuelResultsById() {
        return duelResultsById;
    }

    public void setDuelResultsById(Collection<DuelResultEntity> duelResultsById) {
        this.duelResultsById = duelResultsById;
    }
}
