package com.laurre.cv;

import com.laurre.cv.person.Person;
import com.laurre.cv.person.education.Field;
import com.laurre.cv.person.education.School;
import com.laurre.cv.person.education.Title;
import com.laurre.cv.person.experience.Language;
import com.laurre.cv.person.work.Company;
import com.laurre.cv.person.work.ProductKind;

import java.time.LocalDate;
import java.time.Month;

import static com.laurre.cv.person.PersonBuilder.personWith;
import static com.laurre.cv.person.details.Hobby.*;
import static com.laurre.cv.person.details.Nationality.FRENCH;
import static com.laurre.cv.person.details.Value.*;
import static com.laurre.cv.person.education.CourseBuilder.courseOf;
import static com.laurre.cv.person.education.DegreeBuilder.degreeFrom;
import static com.laurre.cv.person.experience.Skill.*;
import static com.laurre.cv.person.experience.Topic.*;
import static com.laurre.cv.person.work.WorkExperienceBuilder.workExperienceAt;

/**
 * My CV can be seen at: https://github.com/la-urre/cv/blob/master/src/main/java/com/laurre/cv/CV.java
 */
public class CV {
    public static void unroll() {
        Person i = personWith()
                .name("Damien")
                .surname("Urruty")
                .age(32)
                .nationality(FRENCH)
                .network("https://www.linkedin.com/in/urruty");

        i.sayLoudly("I'm a passionate developer looking for a remote position in a collaborative environment!");

        i.value(HUMILITY, CURIOSITY, HONESTY);

        i.love(CLEAN_CODE, TEST_DRIVEN_DEVELOPMENT,
                PAIR_PROGRAMMING, MOB_PROGRAMMING,
                EXTREME_PROGRAMMING, OPEN_SOURCE,
                SOFTWARE_DESIGN, CONTINUOUS_INTEGRATION); // and much more

        i.codeWith(Language.JAVA, Language.C, Language.JAVASCRIPT); // and some more

        i.have(workExperienceAt(Company.LEGRAND)
                .building(ProductKind.IOT_SYSTEM)
                .since(2017)
                .learning(CQRS, DDD, HEXAGONAL_ARCHITECTURE, EMBEDDED_DEVELOPMENT));

        i.have(workExperienceAt(Company.NEOMADES)
                .building(ProductKind.CROSS_PLATFORM_MOBILE_FRAMEWORK)
                .since(2010)
                .until(2017)
                .learning(COMPILER_INTERNALS, SCRUM, TEAM_SELF_ORGANIZATION, CONTINUOUS_IMPROVEMENT));

        i.teach(courseOf(Field.COMPUTER_SCIENCE)
                .at(School.IUT_BAYONNE)
                .since(2011)
                .teaching(ALGORITHMS, DATA_STRUCTURES, MOBILE_APP_DEVELOPMENT));

        i.received(degreeFrom(School.INSA_TOULOUSE)
                .with(Title.ENGINEER)
                .in(Field.COMPUTER_SCIENCE)
                .on(LocalDate.of(2010, Month.JUNE, 30)));

        i.enjoy(HIKING, BASQUE_PELOTE, SQUASH, PUZZLES);
    }
}
