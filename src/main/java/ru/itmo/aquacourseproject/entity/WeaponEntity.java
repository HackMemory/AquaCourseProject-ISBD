package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "weapon", schema = "s289136", catalog = "studs")
public class WeaponEntity {
    private int id;
    private int strength;
    private Boolean isEnchanted;
    private Integer abilityId;
    private Collection<CharacterEntity> charactersById;
    private AbilityEntity abilityByAbilityId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "strength")
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Basic
    @Column(name = "is_enchanted")
    public Boolean getEnchanted() {
        return isEnchanted;
    }

    public void setEnchanted(Boolean enchanted) {
        isEnchanted = enchanted;
    }

    @Basic
    @Column(name = "ability_id", insertable = false, updatable = false)
    public Integer getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeaponEntity that = (WeaponEntity) o;
        return id == that.id && strength == that.strength && Objects.equals(isEnchanted, that.isEnchanted) && Objects.equals(abilityId, that.abilityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, strength, isEnchanted, abilityId);
    }

    @OneToMany(mappedBy = "weaponByWeaponId")
    public Collection<CharacterEntity> getCharactersById() {
        return charactersById;
    }

    public void setCharactersById(Collection<CharacterEntity> charactersById) {
        this.charactersById = charactersById;
    }

    @ManyToOne
    @JoinColumn(name = "ability_id", referencedColumnName = "id")
    public AbilityEntity getAbilityByAbilityId() {
        return abilityByAbilityId;
    }

    public void setAbilityByAbilityId(AbilityEntity abilityByAbilityId) {
        this.abilityByAbilityId = abilityByAbilityId;
    }
}
