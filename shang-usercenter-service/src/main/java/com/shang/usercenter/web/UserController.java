package com.shang.usercenter.web;

import com.shang.api.course.CourseService;
import com.shang.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 微服务之间的远程调用有3中方式，分别是：RestTemplate、DiscoveryClient、Feign
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * RestTemplate是Spring提供的用于模拟浏览器发送http请求的客户端，
     * RestTemplate提供了多种便捷访问远程Http服务的方法，能够大大提高客户端的编写效率
     */
    //private RestTemplate restTemplate = new RestTemplate();


    /*@Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findCourse/{userId}")
    public Course findCourse() {
        //远程调用course-service 微服务
        Course course = restTemplate.getForObject(
                "http://SHANG-COURSE-SERVICE/course/findOne/12", Course.class);
        return course;
    }*/


    @Autowired
    private CourseService courseService;

    @RequestMapping("/findCourse/{userId}")
    public Course findCourse() {
        //远程调用course-service 微服务
        Course course = courseService.findOne(12+"");
        return course;
    }

}
