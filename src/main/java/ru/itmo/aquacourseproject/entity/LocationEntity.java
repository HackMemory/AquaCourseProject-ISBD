package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "location", schema = "s289136", catalog = "studs")
public class LocationEntity {
    private int id;
    private Double x;
    private Double y;
    private Double z;
    private Collection<DuelEntity> duelsById;
    private Collection<KingdomEntity> kingdomsById;
    private Collection<WarEntity> warsById;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "x")
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    @Basic
    @Column(name = "y")
    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Basic
    @Column(name = "z")
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationEntity that = (LocationEntity) o;
        return id == that.id && Objects.equals(x, that.x) && Objects.equals(y, that.y) && Objects.equals(z, that.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, x, y, z);
    }

    @OneToMany(mappedBy = "locationByLocationId")
    public Collection<DuelEntity> getDuelsById() {
        return duelsById;
    }

    public void setDuelsById(Collection<DuelEntity> duelsById) {
        this.duelsById = duelsById;
    }

    @OneToMany(mappedBy = "locationByLocationId")
    public Collection<KingdomEntity> getKingdomsById() {
        return kingdomsById;
    }

    public void setKingdomsById(Collection<KingdomEntity> kingdomsById) {
        this.kingdomsById = kingdomsById;
    }

    @OneToMany(mappedBy = "locationByLocationId")
    public Collection<WarEntity> getWarsById() {
        return warsById;
    }

    public void setWarsById(Collection<WarEntity> warsById) {
        this.warsById = warsById;
    }
}
