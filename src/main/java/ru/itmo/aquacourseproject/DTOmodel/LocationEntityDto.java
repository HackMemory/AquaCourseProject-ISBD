package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;

@Data
public class LocationEntityDto implements Serializable {
    private final int id;
    private final BigInteger x;
    private final BigInteger y;
    private final BigInteger z;
}
