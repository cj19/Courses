package com.rolanddarvas.courses.repository;

import com.rolanddarvas.courses.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
