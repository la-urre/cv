package com.laurre.cv.person.education;

import java.time.LocalDate;

public class DegreeBuilder {
    public static DegreeBuilder degreeFrom(School school) {
        return new DegreeBuilder(school);
    }

    private DegreeBuilder(School school) {
    }

    public DegreeBuilder with(Title title) {
        return this;
    }

    public DegreeBuilder in(Field field) {
        return this;
    }

    public Degree on(LocalDate localDate) {
        return new Degree();
    }
}
