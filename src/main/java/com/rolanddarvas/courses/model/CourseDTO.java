package com.rolanddarvas.courses.model;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
public class CourseDTO {

    private String courseTitle;

    private String courseDescription;

    private Integer courseCredit;

    public CourseDTO(String courseTitle, String courseDescription, Integer courseCredit) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseCredit = courseCredit;
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

        CourseDTO courseDTO = (CourseDTO) o;

        if (courseTitle != null ? !courseTitle.equals(courseDTO.courseTitle) : courseDTO.courseTitle != null)
            return false;
        if (courseDescription != null ? !courseDescription.equals(courseDTO.courseDescription) : courseDTO.courseDescription != null)
            return false;
        return courseCredit != null ? courseCredit.equals(courseDTO.courseCredit) : courseDTO.courseCredit == null;
    }

    @Override
    public int hashCode() {
        int result = courseTitle != null ? courseTitle.hashCode() : 0;
        result = 31 * result + (courseDescription != null ? courseDescription.hashCode() : 0);
        result = 31 * result + (courseCredit != null ? courseCredit.hashCode() : 0);
        return result;
    }
}
