package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;
import ru.itmo.aquacourseproject.enums.AllianceTypeEnum;

import java.io.Serializable;

@Data
public class AllianceEntityDto implements Serializable {
    private final int id;
    private final String allianceName;
    private final Integer allianceAge;
    private final AllianceTypeEnum allianceType;
}
