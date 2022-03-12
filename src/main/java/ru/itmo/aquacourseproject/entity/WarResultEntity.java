package ru.itmo.aquacourseproject.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "war_result", schema = "s289136", catalog = "studs")
public class WarResultEntity {
    private int id;
    private int warId;
    private int winAllianceId;
    private WarEntity warByWarId;
    private AllianceEntity allianceByWinAllianceId;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "war_result_id_seq")
    @SequenceGenerator(name = "war_result_id_seq", sequenceName = "war_result_id_seq", allocationSize = 1)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "war_id")
    public int getWarId() {
        return warId;
    }

    public void setWarId(int warId) {
        this.warId = warId;
    }

    @Basic
    @Column(name = "win_alliance_id")
    public int getWinAllianceId() {
        return winAllianceId;
    }

    public void setWinAllianceId(int winAllianceId) {
        this.winAllianceId = winAllianceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarResultEntity that = (WarResultEntity) o;
        return id == that.id && warId == that.warId && winAllianceId == that.winAllianceId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warId, winAllianceId);
    }

    @ManyToOne
    @JoinColumn(name = "war_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public WarEntity getWarByWarId() {
        return warByWarId;
    }

    public void setWarByWarId(WarEntity warByWarId) {
        this.warByWarId = warByWarId;
    }

    @ManyToOne
    @JoinColumn(name = "win_alliance_id", referencedColumnName = "id", nullable = false, insertable=false, updatable=false)
    public AllianceEntity getAllianceByWinAllianceId() {
        return allianceByWinAllianceId;
    }

    public void setAllianceByWinAllianceId(AllianceEntity allianceByWinAllianceId) {
        this.allianceByWinAllianceId = allianceByWinAllianceId;
    }
}
