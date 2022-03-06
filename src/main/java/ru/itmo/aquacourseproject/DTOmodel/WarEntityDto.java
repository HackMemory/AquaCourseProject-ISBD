package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

@Data
public class WarEntityDto implements Serializable {
    private final int id;
    private final int attackAllId;
    private final int defeatAllId;
    private final int locationId;
    private final Date time;
}
