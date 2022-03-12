package ru.itmo.aquacourseproject.entity;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import ru.itmo.aquacourseproject.enums.AllianceTypeEnum;
import ru.itmo.aquacourseproject.enums.PostgreSQLEnumType;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@TypeDef(
        name = "pgsql_enum",
        typeClass = PostgreSQLEnumType.class
)
@Table(name = "alliance", schema = "s289136", catalog = "studs")
public class AllianceEntity {
    private int id;
    private String allianceName;
    private Integer allianceAge;
    private AllianceTypeEnum allianceType;
    private Collection<CharacterEntity> charactersById;
    private Collection<KingdomEntity> kingdomsById;
    private Collection<WarEntity> warsById;
    private Collection<WarEntity> warsById_0;
    private Collection<WarResultEntity> warResultsById;

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
    @Column(name = "alliance_name")
    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }

    @Basic
    @Column(name = "alliance_age")
    public Integer getAllianceAge() {
        return allianceAge;
    }

    public void setAllianceAge(Integer allianceAge) {
        this.allianceAge = allianceAge;
    }

    @Basic
    @Column(name = "alliance_type")
    @Enumerated(EnumType.STRING)
    @Type( type = "pgsql_enum" )
    public AllianceTypeEnum getAllianceType() {
        return allianceType;
    }

    public void setAllianceType(AllianceTypeEnum allianceType) {
        this.allianceType = allianceType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllianceEntity that = (AllianceEntity) o;
        return id == that.id && Objects.equals(allianceName, that.allianceName) && Objects.equals(allianceAge, that.allianceAge) && Objects.equals(allianceType, that.allianceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, allianceName, allianceAge, allianceType);
    }

    @OneToMany(mappedBy = "allianceByAllianceId")
    public Collection<CharacterEntity> getCharactersById() {
        return charactersById;
    }

    public void setCharactersById(Collection<CharacterEntity> charactersById) {
        this.charactersById = charactersById;
    }

    @OneToMany(mappedBy = "allianceByAllianceId")
    public Collection<KingdomEntity> getKingdomsById() {
        return kingdomsById;
    }

    public void setKingdomsById(Collection<KingdomEntity> kingdomsById) {
        this.kingdomsById = kingdomsById;
    }

    @OneToMany(mappedBy = "allianceByAttackAllId")
    public Collection<WarEntity> getWarsById() {
        return warsById;
    }

    public void setWarsById(Collection<WarEntity> warsById) {
        this.warsById = warsById;
    }

    @OneToMany(mappedBy = "allianceByDefeatAllId")
    public Collection<WarEntity> getWarsById_0() {
        return warsById_0;
    }

    public void setWarsById_0(Collection<WarEntity> warsById_0) {
        this.warsById_0 = warsById_0;
    }

    @OneToMany(mappedBy = "allianceByWinAllianceId")
    public Collection<WarResultEntity> getWarResultsById() {
        return warResultsById;
    }

    public void setWarResultsById(Collection<WarResultEntity> warResultsById) {
        this.warResultsById = warResultsById;
    }
}
