package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class CharacterEntityDto implements Serializable {
    private final int id;
    private final String name;
    private final String surname;
    private final int age;
    private final Integer weaponId;
    private final Integer allianceId;
}
