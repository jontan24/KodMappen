package ISProject;


import ISProject.Student;
import ISProject.WrittenExam;

public class Test {
    public static void main(String[] args) {

        StudentRegister listOfStudents = new StudentRegister();
        CourseRegister listOfCourses = new CourseRegister();
        //Creating objects from the Course/ WrittenExam/ Result/ Student classes.

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();
        Student student8 = new Student();

        Course course1 = new Course();
        Course course2 = new Course();

        WrittenExam exam1 = new WrittenExam();
        WrittenExam exam2 = new WrittenExam();
        WrittenExam exam3 = new WrittenExam();
        WrittenExam exam4 = new WrittenExam();

        Result result1 = new Result();
        Result result2 = new Result();
        Result result3 = new Result();
        Result result4 = new Result();
        Result result5 = new Result();
        Result result6 = new Result();
        Result result7 = new Result();
        Result result8 = new Result();

        //Creating the set methods for updating and adding attributes for the objects above
        course1.setName("Björntämjning");
        course2.setName("Hundkojebyggantion");

        course1.setCourseCode("C96000");
        course2.setCourseCode("C98000");

        course1.setCredits(15);
        course2.setCredits(7.5);

        student1.setName("Jonathan");
        student2.setName("Lovisa");
        student3.setName("Alexander");
        student4.setName("Mats");
        student5.setName("Bear");
        student6.setName("Markus");
        student7.setName("Bosse");
        student8.setName("Viktoria");

        student1.setStudentID("S10001");
        student2.setStudentID("S10002");
        student3.setStudentID("S10003");
        student4.setStudentID("S10004");
        student5.setStudentID("S11337");
        student6.setStudentID("S10005");
        student7.setStudentID("S10006");
        student8.setStudentID("S10007");

        exam1.setLocation("Classroom 069");
        exam2.setLocation("Classroom 169");
        exam3.setLocation("Classroom 239");
        exam4.setLocation("Assembly hall 1");

        exam1.setDate("2019-01-14");
        exam2.setDate("2019-09-09");
        exam3.setDate("2019-12-24");
        exam4.setDate("2019-09-11");

        exam1.setExamID("E20001");
        exam2.setExamID("E20002");
        exam3.setExamID("E20003");
        exam4.setExamID("E20004");

        exam1.setTime("07:45");
        exam2.setTime("09:00");
        exam3.setTime("13:37");
        exam4.setTime("12.00");
        //Adding courses to the list of courses.
        listOfCourses.addCourse(course1);
        listOfCourses.addCourse(course2);
        //Adding students to the list of students.
        listOfStudents.addStudent(student1);
        listOfStudents.addStudent(student2);
        listOfStudents.addStudent(student3);
        listOfStudents.addStudent(student4);
        listOfStudents.addStudent(student5);
        listOfStudents.addStudent(student6);
        listOfStudents.addStudent(student7);
        listOfStudents.addStudent(student8);
        //Setting the results for the students.
        student1.addResult(result1);
        student2.addResult(result2);
        student3.addResult(result3);
        student4.addResult(result4);
        student4.addResult(result5);
        student4.addResult(result6);
        student4.addResult(result7);
        student4.addResult(result8);

        //linking a double association between result and student.
        result1.setStudent(student1);
        result1.setStudent(student2);
        result1.setStudent(student3);
        result1.setStudent(student4);
        result1.setStudent(student5);
        result1.setStudent(student6);
        result1.setStudent(student7);
        result1.setStudent(student8);

        //Adding exam to a specific course.
        course1.addWrittenExam(exam1);
        course1.addWrittenExam(exam2);
        course2.addWrittenExam(exam3);
        course2.addWrittenExam(exam4);

        //Setting a double association between course and exam.
        exam1.setBelongsToCourse(course1);
        exam2.setBelongsToCourse(course1);
        exam3.setBelongsToCourse(course2);
        exam4.setBelongsToCourse(course2);

        //Adding results to exams.
        exam1.addResult(result1);
        exam1.addResult(result2);
        exam2.addResult(result3);
        exam2.addResult(result4);
        exam3.addResult(result5);
        exam3.addResult(result6);
        exam4.addResult(result7);
        exam4.addResult(result8);

        //Setting a double association between exams and results.
        result1.setWrittenExam(exam1);
        result2.setWrittenExam(exam1);
        result3.setWrittenExam(exam2);
        result4.setWrittenExam(exam2);
        result5.setWrittenExam(exam3);
        result6.setWrittenExam(exam3);
        result7.setWrittenExam(exam4);
        result8.setWrittenExam(exam4);
    }

}