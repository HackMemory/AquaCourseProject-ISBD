package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "duel_result", schema = "s289136", catalog = "studs")
public class DuelResultEntity {
    private int id;
    private int duelId;
    private int winCharId;
    private DuelEntity duelByDuelId;
    private CharacterEntity characterByWinCharId;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "duel_result_id_seq")
    @SequenceGenerator(name = "duel_result_id_seq", sequenceName = "duel_result_id_seq", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "duel_id")
    public int getDuelId() {
        return duelId;
    }

    public void setDuelId(int duelId) {
        this.duelId = duelId;
    }

    @Basic
    @Column(name = "win_char_id")
    public int getWinCharId() {
        return winCharId;
    }

    public void setWinCharId(int winCharId) {
        this.winCharId = winCharId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DuelResultEntity that = (DuelResultEntity) o;
        return id == that.id && duelId == that.duelId && winCharId == that.winCharId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, duelId, winCharId);
    }

    @ManyToOne
    @JoinColumn(name = "duel_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public DuelEntity getDuelByDuelId() {
        return duelByDuelId;
    }

    public void setDuelByDuelId(DuelEntity duelByDuelId) {
        this.duelByDuelId = duelByDuelId;
    }

    @ManyToOne
    @JoinColumn(name = "win_char_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public CharacterEntity getCharacterByWinCharId() {
        return characterByWinCharId;
    }

    public void setCharacterByWinCharId(CharacterEntity characterByWinCharId) {
        this.characterByWinCharId = characterByWinCharId;
    }
}
