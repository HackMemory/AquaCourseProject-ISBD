package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class DuelEntityDto implements Serializable {
    private final int id;
    private final int attackCharId;
    private final int defeatCharId;
    private final int locationId;
    private final Date time;
}
