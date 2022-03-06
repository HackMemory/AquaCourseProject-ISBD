package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "war", schema = "s289136", catalog = "studs")
public class WarEntity {
    private int id;
    private int attackAllId;
    private int defeatAllId;
    private int locationId;
    private Date time;
    private AllianceEntity allianceByAttackAllId;
    private AllianceEntity allianceByDefeatAllId;
    private LocationEntity locationByLocationId;
    private Collection<WarResultEntity> warResultsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "attack_all_id", insertable = false, updatable = false)
    public int getAttackAllId() {
        return attackAllId;
    }

    public void setAttackAllId(int attackAllId) {
        this.attackAllId = attackAllId;
    }

    @Basic
    @Column(name = "defeat_all_id", insertable = false, updatable = false)
    public int getDefeatAllId() {
        return defeatAllId;
    }

    public void setDefeatAllId(int defeatAllId) {
        this.defeatAllId = defeatAllId;
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
        WarEntity warEntity = (WarEntity) o;
        return id == warEntity.id && attackAllId == warEntity.attackAllId && defeatAllId == warEntity.defeatAllId && locationId == warEntity.locationId && Objects.equals(time, warEntity.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attackAllId, defeatAllId, locationId, time);
    }

    @ManyToOne
    @JoinColumn(name = "attack_all_id", referencedColumnName = "id", nullable = false)
    public AllianceEntity getAllianceByAttackAllId() {
        return allianceByAttackAllId;
    }

    public void setAllianceByAttackAllId(AllianceEntity allianceByAttackAllId) {
        this.allianceByAttackAllId = allianceByAttackAllId;
    }

    @ManyToOne
    @JoinColumn(name = "defeat_all_id", referencedColumnName = "id", nullable = false)
    public AllianceEntity getAllianceByDefeatAllId() {
        return allianceByDefeatAllId;
    }

    public void setAllianceByDefeatAllId(AllianceEntity allianceByDefeatAllId) {
        this.allianceByDefeatAllId = allianceByDefeatAllId;
    }

    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id", nullable = false)
    public LocationEntity getLocationByLocationId() {
        return locationByLocationId;
    }

    public void setLocationByLocationId(LocationEntity locationByLocationId) {
        this.locationByLocationId = locationByLocationId;
    }

    @OneToMany(mappedBy = "warByWarId")
    public Collection<WarResultEntity> getWarResultsById() {
        return warResultsById;
    }

    public void setWarResultsById(Collection<WarResultEntity> warResultsById) {
        this.warResultsById = warResultsById;
    }
}
