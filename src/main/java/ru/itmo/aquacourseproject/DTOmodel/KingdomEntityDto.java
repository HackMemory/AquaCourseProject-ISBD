package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;
import ru.itmo.aquacourseproject.enums.CategoryEnum;

import java.io.Serializable;

@Data
public class KingdomEntityDto implements Serializable {
    private final int id;
    private final int characterId;
    private final int armyStrength;
    private final CategoryEnum category;
    private final int locationId;
    private final Integer allianceId;
}
