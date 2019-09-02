import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import self_work.Teacher;
import self_work.Pupil;
import self_work.School;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TeacherTests {

    static Teacher teacher;
    static Pupil pupil;
    static School school;
    static Pupil p1;
    static Pupil p2;
    static Pupil p3;
    static Pupil p4;
    static Pupil p5;
    static List<Pupil> pupils;

    @BeforeAll
    public static void init() {
        teacher = new Teacher();
        pupil = new Pupil("Pavel", "Yeremeyev");
        school = new School();
        p1 = new Pupil("Vasya", "Petykin");
        p2 = new Pupil("Petya", "Petykin");
        p3 = new Pupil("Looney", "Petykin");
        p4 = new Pupil("Dmitriy", "Petykin");
        p5 = new Pupil("Ibrahim", "Petykin");
        pupils = new ArrayList<>();
    }


    @ParameterizedTest
    @ValueSource(ints = {71, 100, 500, 99999999})
    void checkAveragePupilScoreHigh(int input) {
        teacher.setAverageScore(pupil, input);
        assertEquals(true, teacher.isPassed(pupil));
    }

    @ParameterizedTest
    @ValueSource(ints = {-999999999, -10, 0, 69, 70})
    void checkAveragePupilScoreLow(int input) {
        teacher.setAverageScore(pupil, input);
        assertEquals(false, teacher.isPassed(pupil));
    }


    @ParameterizedTest
    @ValueSource(ints = {61, 100, 500, 99999999})
    void checkSchoolSuccessHigh(int input) {
        pupils.add(p1);
        teacher.setAverageScore(p1, input);
        pupils.add(p2);
        teacher.setAverageScore(p2, input);
        pupils.add(p3);
        teacher.setAverageScore(p3, input);
        pupils.add(p4);
        teacher.setAverageScore(p4, input);
        pupils.add(p5);
        teacher.setAverageScore(p5, input);
        school.setPupils(pupils);
        assertEquals(true, teacher.isSchoolSuccess(school));
    }

    @ParameterizedTest
    @ValueSource(ints = {-10, 0, 59, 60})
    void checkSchoolSuccessLow(int input) {
        pupils.add(p1);
        teacher.setAverageScore(p1, input);
        pupils.add(p2);
        teacher.setAverageScore(p2, input);
        pupils.add(p3);
        teacher.setAverageScore(p3, input);
        pupils.add(p4);
        teacher.setAverageScore(p4, input);
        pupils.add(p5);
        teacher.setAverageScore(p5, input);
        school.setPupils(pupils);
        assertEquals(false, teacher.isSchoolSuccess(school));
    }

    @AfterAll
    public static void clearData() {
        teacher = null;
        pupil = null;
        school = null;
        p1 = null;
        p2 = null;
        p3 = null;
        p4 = null;
        p5 = null;
        pupils = null;
    }


}
