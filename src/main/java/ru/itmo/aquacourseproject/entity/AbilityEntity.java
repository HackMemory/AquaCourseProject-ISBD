package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "ability", schema = "s289136", catalog = "studs")
public class AbilityEntity {
    private int id;
    private String description;
    private int power;
    private Collection<WeaponEntity> weaponsById;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "power")
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbilityEntity that = (AbilityEntity) o;
        return id == that.id && power == that.power && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, power);
    }

    @OneToMany(mappedBy = "abilityByAbilityId")
    public Collection<WeaponEntity> getWeaponsById() {
        return weaponsById;
    }

    public void setWeaponsById(Collection<WeaponEntity> weaponsById) {
        this.weaponsById = weaponsById;
    }
}
