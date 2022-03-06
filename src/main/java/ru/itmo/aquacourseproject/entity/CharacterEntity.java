package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "character", schema = "s289136", catalog = "studs")
public class CharacterEntity {
    private int id;
    private String name;
    private String surname;
    private int age;
    private Integer weaponId;
    private Integer allianceId;
    private WeaponEntity weaponByWeaponId;
    private AllianceEntity allianceByAllianceId;
    private Collection<DuelEntity> duelsById;
    private Collection<DuelEntity> duelsById_0;
    private Collection<DuelResultEntity> duelResultsById;
    private Collection<KingdomEntity> kingdomsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Basic
    @Column(name = "weapon_id", insertable = false, updatable = false)
    public Integer getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(Integer weaponId) {
        this.weaponId = weaponId;
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
        CharacterEntity that = (CharacterEntity) o;
        return id == that.id && age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(weaponId, that.weaponId) && Objects.equals(allianceId, that.allianceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, weaponId, allianceId);
    }

    @ManyToOne
    @JoinColumn(name = "weapon_id", referencedColumnName = "id")
    public WeaponEntity getWeaponByWeaponId() {
        return weaponByWeaponId;
    }

    public void setWeaponByWeaponId(WeaponEntity weaponByWeaponId) {
        this.weaponByWeaponId = weaponByWeaponId;
    }

    @ManyToOne
    @JoinColumn(name = "alliance_id", referencedColumnName = "id")
    public AllianceEntity getAllianceByAllianceId() {
        return allianceByAllianceId;
    }

    public void setAllianceByAllianceId(AllianceEntity allianceByAllianceId) {
        this.allianceByAllianceId = allianceByAllianceId;
    }

    @OneToMany(mappedBy = "characterByAttackCharId")
    public Collection<DuelEntity> getDuelsById() {
        return duelsById;
    }

    public void setDuelsById(Collection<DuelEntity> duelsById) {
        this.duelsById = duelsById;
    }

    @OneToMany(mappedBy = "characterByDefeatCharId")
    public Collection<DuelEntity> getDuelsById_0() {
        return duelsById_0;
    }

    public void setDuelsById_0(Collection<DuelEntity> duelsById_0) {
        this.duelsById_0 = duelsById_0;
    }

    @OneToMany(mappedBy = "characterByWinCharId")
    public Collection<DuelResultEntity> getDuelResultsById() {
        return duelResultsById;
    }

    public void setDuelResultsById(Collection<DuelResultEntity> duelResultsById) {
        this.duelResultsById = duelResultsById;
    }

    @OneToMany(mappedBy = "characterByCharacterId")
    public Collection<KingdomEntity> getKingdomsById() {
        return kingdomsById;
    }

    public void setKingdomsById(Collection<KingdomEntity> kingdomsById) {
        this.kingdomsById = kingdomsById;
    }
}
