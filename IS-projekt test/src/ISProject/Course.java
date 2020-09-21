package ISProject;

import ISProject.WrittenExam;

import java.util.ArrayList;

public class Course {
    //	courseCode v
//	name v
//	credit v
//	written exam v
//	A course has a unique course code, a name and credits. A course code begins with letter
//	capital “C” followed by a number between 10000 and 99999. The course code is six (6)
//	characters in total. Examples: “C10002”, “C87609”.
    private String courseCode;
    private String name;
    private double credits;
    private ArrayList<WrittenExam> writtenExamList = new ArrayList<WrittenExam>();

    public void setWrittenExamList(ArrayList<WrittenExam> writtenExamList) {
        this.writtenExamList = writtenExamList;

    }

    public ArrayList<WrittenExam> getWrittenExamList() {
        return writtenExamList;
    }

    public void addWrittenExam(WrittenExam addExam) {
        writtenExamList.add(addExam);
    }

    public WrittenExam findWrittenExam(String examID) {
        for (WrittenExam findExam : writtenExamList) {
            if (findExam.getExamID().equals(examID)) {
                return findExam;
            }
        }
        return null;

    }

    public WrittenExam removeWrittenExam(String examID) {
        WrittenExam removeExam = findWrittenExam(examID);
        if (removeExam != null) {
            writtenExamList.remove(removeExam);
            return removeExam;
        }
        return null;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}
