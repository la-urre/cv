package com.laurre.cv.person;

import com.laurre.cv.person.details.Hobby;
import com.laurre.cv.person.details.Nationality;
import com.laurre.cv.person.details.Value;
import com.laurre.cv.person.education.Course;
import com.laurre.cv.person.experience.Topic;
import com.laurre.cv.person.experience.Language;
import com.laurre.cv.person.education.Degree;
import com.laurre.cv.person.work.WorkExperience;
import com.laurre.cv.person.work.WorkExperienceBuilder;

public class Person {
    public void sayLoudly(String message) {
        System.out.println(message);
    }

    public void received(Degree degree) {

    }

    public void codeWith(Language... languages) {
    }

    public void love(Topic... topics) {
    }

    public void teach(Course course) {

    }

    public void value(Value... values) {
    }

    public void enjoy(Hobby... hobbies) {
    }

    public void have(WorkExperience workExperience) {
    }

    public void speak(com.laurre.cv.person.details.Language ... languages) {
    }
}
