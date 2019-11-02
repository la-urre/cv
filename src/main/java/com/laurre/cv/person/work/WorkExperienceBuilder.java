package com.laurre.cv.person.work;

import com.laurre.cv.person.experience.Skill;

import java.time.LocalDate;

public class WorkExperienceBuilder {
    public WorkExperienceBuilder(Company company) {

    }

    public static WorkExperienceBuilder workExperienceAt(Company company) {
        return new WorkExperienceBuilder(company);
    }

    public WorkExperienceBuilder building(ProductKind productKind) {
        return this;
    }

    public WorkExperienceBuilder since(int year) {
        return this;
    }

    public WorkExperienceBuilder until(int year) {
        return this;
    }

    public WorkExperience learning(Skill... skills) {
        return new WorkExperience();
    }
}
