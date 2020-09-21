package ISProject;

import ISProject.Student;
import ISProject.WrittenExam;

public class Result {
    private int result;
    private String letterGrade;
    private Student student;
    private WrittenExam writtenExam;
    //create setters and getters
    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public WrittenExam getWrittenExam() {
        return writtenExam;
    }

    public void setWrittenExam(WrittenExam writtenExam) {
        this.writtenExam = writtenExam;
    }
    //Get a grade based on exam score.
    public void giveResult(int result) {
        this.setResult(result);
        if(result <=50) {
            this.setLetterGrade("Fail");
        }
        else if (result>=50 && result<55) {
            this.setLetterGrade("E");
        }
        else if (result>=55 && result<65) {
            this.setLetterGrade("D");
        }
        else if (result>=65 && result<75) {
            this.setLetterGrade("C");
        }
        else if (result>=75 && result<85) {
            this.setLetterGrade("B");
        }
        else if (result<=85) {
            this.setLetterGrade("A");
        }

    }


}
