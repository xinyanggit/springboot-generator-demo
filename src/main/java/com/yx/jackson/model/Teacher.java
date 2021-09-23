package com.yx.jackson.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;

/**
 * @create 2021-09-23 5:45 下午
 */
@Data
@JsonTypeName(value = "teacher")
public class Teacher extends Person {
    private String techNo;
    private String techName;
    private Long techId;
}
