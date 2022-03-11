package ru.itmo.aquacourseproject.DTOmodel;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseDTO  implements Serializable {
    public final Boolean status;
    public final Object result;
}
