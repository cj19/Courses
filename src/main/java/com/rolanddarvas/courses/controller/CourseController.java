package com.rolanddarvas.courses.controller;

import com.rolanddarvas.courses.entity.Course;
import com.rolanddarvas.courses.model.CourseDTO;
import com.rolanddarvas.courses.model.RestResponse;
import com.rolanddarvas.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
@RestController
@RequestMapping(value = "/api/course")
public class CourseController extends BaseRestController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(method = RequestMethod.POST)
    private RestResponse createCourse(@RequestBody CourseDTO courseDTO) {
        if (courseDTO != null) {
            courseService.save(courseDTO);
            return RestResponse.ok();
        } else {
            return RestResponse.failure();
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{courseId}")
    public RestResponse<Course> getCourse(@PathVariable long courseId) {
        return RestResponse.ok(courseService.getCourseById(courseId));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{courseId")
    public RestResponse updateCourse(@PathVariable long courseId, @RequestBody CourseDTO courseDTO) {
        if (courseDTO != null) {
            courseService.update(courseId, courseDTO);
            return RestResponse.ok();
        } else {
            return RestResponse.failure();
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{courseId)")
    public RestResponse deleteCourse(@PathVariable long courseId) {
        courseService.deleteById(courseId);
        return RestResponse.ok();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/courseList")
    public RestResponse<List<Course>> getCourseList(){
        return RestResponse.ok(courseService.getAll());
    }
}
