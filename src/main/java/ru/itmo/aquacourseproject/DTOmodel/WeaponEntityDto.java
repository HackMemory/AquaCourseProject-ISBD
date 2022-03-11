package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeaponEntityDto implements Serializable {
    private final int id;
    private final Boolean isEnchanted;
    private final int strength;
    private final int abilityId;
}
