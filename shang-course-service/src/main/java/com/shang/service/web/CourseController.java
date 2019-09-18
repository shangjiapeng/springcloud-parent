package com.shang.service.web;

import com.shang.api.course.CourseService;
import com.shang.pojo.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController implements CourseService {

    @Value("${server.port}")
    private String port;


    //课程的查看  restful接口
    @RequestMapping("/findOne/{courseId}")
    public Course findOne(@PathVariable("courseId") String coursrId) {
        System.out.println(coursrId);
        return new Course("大数据", 1000.0, "up"+port);
    }

}
