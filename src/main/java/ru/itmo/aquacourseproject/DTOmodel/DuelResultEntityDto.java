package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class DuelResultEntityDto implements Serializable {
    private final int id;
    private final int duelId;
    private final int winCharId;
}
