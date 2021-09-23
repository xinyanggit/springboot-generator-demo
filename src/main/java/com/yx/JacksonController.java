package com.yx;

import com.yx.jackson.model.Student;
import com.yx.jackson.model.Teacher;
import com.yx.jackson.res.ModelResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2021-09-23 5:49 下午
 */
@RestController
public class JacksonController {

    @GetMapping("/test/jackson")
    public ModelResp testJson(@RequestParam("param") Long id) {
        ModelResp resp = new ModelResp();
        resp.setParamId(id);
        if (id == 1) {
            // stud
            resp.setName("stud:" + id);
            Student student = new Student();
            student.setStuId(id);
            student.setStrName("stud" + id);
            student.setStuNo("==>NO:" + id);
            resp.setPerson(student);
        } else {
            // tech
            resp.setName("tech:" + id);
            Teacher teacher = new Teacher();
            teacher.setTechId(id);
            teacher.setTechName("tech" + id);
            teacher.setTechNo("==>NO:" + id);
            resp.setPerson(teacher);
        }
        return resp;
    }

}
