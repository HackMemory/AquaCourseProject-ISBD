package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

@Data
public class LocationEntityDto implements Serializable {
    private final int id;
    private final Double x;
    private final Double y;
    private final Double z;
}
