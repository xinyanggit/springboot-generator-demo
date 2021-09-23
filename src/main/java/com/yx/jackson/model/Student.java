package com.yx.jackson.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * @create 2021-09-23 5:42 下午
 */
@Data
@JsonTypeName(value = "student")
public class Student extends Person {
    private String stuNo;
    private String strName;
    private Long stuId;
}
