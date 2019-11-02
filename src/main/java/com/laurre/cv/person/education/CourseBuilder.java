package com.laurre.cv.person.education;

import com.laurre.cv.person.experience.Skill;

public class CourseBuilder {
    public CourseBuilder(Field field) {
    }

    public static CourseBuilder courseOf(Field field) {
        return new CourseBuilder(field);
    }

    public CourseBuilder at(School school) {
        return this;
    }

    public CourseBuilder since(int year) {
        return this;
    }

    public Course teaching(Skill... skills) {
        return new Course();
    }
}
