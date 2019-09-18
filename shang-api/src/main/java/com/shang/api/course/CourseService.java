package com.shang.api.course;

import com.shang.pojo.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("SHANG-COURSE-SERVICE")
@RequestMapping("/course")
public interface CourseService {

    //shang-course-service 微服务的http接口
    @RequestMapping("/findOne/{courseId}")  //PathVariable:专门用来获取路径中的参数
    public Course findOne(@PathVariable("courseId") String coursrId);
}
