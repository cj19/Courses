package com.rolanddarvas.courses.service;

import com.rolanddarvas.courses.entity.Course;
import com.rolanddarvas.courses.model.CourseDTO;
import com.rolanddarvas.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public void save(CourseDTO courseDTO) {
        Course course = new Course();
        course.setCourseTitle(courseDTO.getCourseTitle());
        course.setCourseDescription(courseDTO.getCourseDescription());
        course.setCourseCredit(courseDTO.getCourseCredit());
        courseRepository.save(course);
    }

    public void update(Long courseId, CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseId);
        course.setCourseCredit(courseDTO.getCourseCredit());
        course.setCourseDescription(courseDTO.getCourseDescription());
        course.setCourseTitle(courseDTO.getCourseTitle());
        courseRepository.save(course);
    }

    public Course getCourseById(Long id) {
        return courseRepository.findOne(id);
    }

    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    public void deleteById(Long id) {
        courseRepository.delete(id);
    }


}
