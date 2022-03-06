package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class WeaponEntityDto implements Serializable {
    private final Boolean isEnchanted;
    private final int id;
    private final int strength;
    private final Boolean enchanted;
    private final Integer abilityId;
}
