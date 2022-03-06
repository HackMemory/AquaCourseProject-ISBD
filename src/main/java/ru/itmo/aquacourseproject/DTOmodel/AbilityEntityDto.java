package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class AbilityEntityDto implements Serializable {
    private final int id;
    private final String description;
    private final int power;
}
