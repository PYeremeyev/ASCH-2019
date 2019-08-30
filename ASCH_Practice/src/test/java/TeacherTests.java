import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import self_work.Teacher;
import self_work.Pupil;
import self_work.School;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TeacherTests {

    Teacher teacher = new Teacher();
    Pupil pupil = new Pupil("Pavel", "Yeremeyev");
    School school = new School();
    Pupil p1 = new Pupil("Vasya", "Petykin");
    Pupil p2 = new Pupil("Petya", "Petykin");
    Pupil p3 = new Pupil("Looney", "Petykin");
    Pupil p4 = new Pupil("Dmitriy", "Petykin");
    Pupil p5 = new Pupil("Ibrahim", "Petykin");
    List<Pupil> pupils = new ArrayList<>();




    @ParameterizedTest
    @ValueSource(ints = {-10,0,69,70})
    void checkAveragePupilScoreLow(int input) {
        teacher.setAverageScore(pupil, input);
        assertEquals(false, teacher.isPassed(pupil));
    }


    @ParameterizedTest
    @ValueSource(ints = {71, 100, 500, 99999999})
    void checkAveragePupilScoreHigh(int input) {
        teacher.setAverageScore(pupil, input);
        assertEquals(true, teacher.isPassed(pupil));
    }

    @ParameterizedTest
    @ValueSource(ints = {71, 100, 500, 99999999})
    void checkSchoolSuccessHigh(int input){
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
        assertEquals(true,teacher.isSchoolSuccess(school));
    }
    @ParameterizedTest
    @ValueSource(ints = {-10,0,59,60})
    void checkSchoolSuccessLow(int input){
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
        assertEquals(false,teacher.isSchoolSuccess(school));
    }



}
