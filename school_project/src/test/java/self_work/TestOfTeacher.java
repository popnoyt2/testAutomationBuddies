package self_work;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOfTeacher {
    static Pupil pupil;
    static Pupil pupi12;
    static Pupil pupil3;
    static Pupil pupil4;

    @BeforeAll
    static void init() {
        pupil = new Pupil("Elina", "Marko");
        pupi12 = new Pupil("Vasja", "Pupkin");
        pupil3 = new Pupil("Kot", "Boris");
        pupil4 = new Pupil("Funtik", "Rabotnik");
        Teacher teacher = new Teacher();
        teacher.setAverageScore(pupil, 88);
        teacher.setAverageScore(pupi12, 45);
        teacher.setAverageScore(pupil3, 90);
        teacher.setAverageScore(pupil4, 15);
    }

    @Test
    public void setAverageScForPupil() {
        assertEquals(88, pupil.getAverageScore());
    }

    @Test
    public void setAverageScForPupil2() {
        assertEquals(45, pupi12.getAverageScore());
    }

    @Test
    public void setAverageScForPupil3() {
        assertEquals(90, pupil3.getAverageScore());
    }

    @Test
    public void setAverageScForPupil4() {
        assertEquals(15, pupil4.getAverageScore());
    }

    @Test
    public void setSuccessfulSchool() {
        School school = new School();
        Teacher teacher = new Teacher();
        List<Pupil> pupilList = new ArrayList<>();
        pupilList.add(pupil3);
        pupilList.add(pupi12);
        pupilList.add(pupil);
        school.setPupils(pupilList);
        System.out.println(pupilList);
        for (Pupil p : pupilList) {
            System.out.println(p.getAverageScore());
        }
        assertEquals(true, teacher.isSchoolSuccess(school), "Check if school is successful");
    }

    @Test
    public void setNotSuccessfulSchool() {
        School school = new School();
        Teacher teacher = new Teacher();
        List<Pupil> pupilList = new ArrayList<>();
        pupilList.add(pupil4);
        pupilList.add(pupi12);
        pupilList.add(pupil);
        school.setPupils(pupilList);
        System.out.println(pupilList);
        for (Pupil p : pupilList) {
            System.out.println(p.getAverageScore());
        }
        assertEquals(false, teacher.isSchoolSuccess(school), "Check if school is not successful");
    }
}
