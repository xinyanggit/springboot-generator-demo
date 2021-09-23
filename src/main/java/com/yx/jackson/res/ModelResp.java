package com.yx.jackson.res;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.yx.jackson.model.Person;
import com.yx.jackson.model.Student;
import com.yx.jackson.model.Teacher;
import lombok.Data;

import java.io.Serializable;

/**
 * @create 2021-09-23 5:48 下午
 */

@Data
public class ModelResp  implements Serializable {
    private Long  paramId;
    private String name;
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Student.class,name="student"),
            @JsonSubTypes.Type(value = Teacher.class,name="teacher")
    })
    private Person person;
}
