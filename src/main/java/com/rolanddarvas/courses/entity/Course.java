package com.rolanddarvas.courses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
@Entity
@Table(name = "COURSE")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "COURSE_TITLE", length = 50)
    private String courseTitle;

    @Column(name = "COURSE_DESCRIPTION", length = 250)
    private String courseDescription;

    @Column(name = "COURSE_CREDIT")
    private Integer courseCredit;

    public Course() {
        //Default constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (id != null ? !id.equals(course.id) : course.id != null) return false;
        if (courseTitle != null ? !courseTitle.equals(course.courseTitle) : course.courseTitle != null) return false;
        if (courseDescription != null ? !courseDescription.equals(course.courseDescription) : course.courseDescription != null)
            return false;
        return courseCredit != null ? courseCredit.equals(course.courseCredit) : course.courseCredit == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (courseTitle != null ? courseTitle.hashCode() : 0);
        result = 31 * result + (courseDescription != null ? courseDescription.hashCode() : 0);
        result = 31 * result + (courseCredit != null ? courseCredit.hashCode() : 0);
        return result;
    }
}
