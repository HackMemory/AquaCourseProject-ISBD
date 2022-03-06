package ru.itmo.aquacourseproject.enums;

public enum CategoryEnum {
    FALLEN("Падшие"),
    COMMON("Обычные");

    public final String label;

    CategoryEnum(String label) {
        this.label = label;
    }
}
