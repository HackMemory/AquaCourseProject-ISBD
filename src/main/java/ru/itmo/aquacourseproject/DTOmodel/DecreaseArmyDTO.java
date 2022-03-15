package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class DecreaseArmyDTO implements Serializable {
    int allianceId;
    float percent;
}
