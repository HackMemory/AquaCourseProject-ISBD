package ru.itmo.aquacourseproject.enums;

public enum AllianceTypeEnum {
    ECONOMIC("Экономический"),
    MILITARY("Военный"),
    PERSONAL("Личностный");

    public final String label;

    AllianceTypeEnum(String label) {
        this.label = label;
    }
}
