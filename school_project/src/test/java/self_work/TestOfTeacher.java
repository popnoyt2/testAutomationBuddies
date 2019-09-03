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

    @BeforeAll
    static void init() {
        pupil = new Pupil("Elina", "Marko");
        pupi12 = new Pupil("Vasja", "Pupkin");
        pupil3 = new Pupil("Kot", "Boris");
        Teacher teacher = new Teacher();
        teacher.setAverageScore(pupil, 88);
        teacher.setAverageScore(pupi12, 45);
        teacher.setAverageScore(pupil3, 90);
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
    public void setSchool() {

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
        System.out.println(teacher.isSchoolSuccess(school));
}
}
