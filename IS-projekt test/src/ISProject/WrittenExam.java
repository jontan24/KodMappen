package ISProject;

import java.util.ArrayList;

public class WrittenExam {

    private String examID;
    private String date;
    private String location;
    private String time;
    private String maxPoints;
    private Course belongsToCourse;

    private ArrayList<Result> result = new ArrayList<Result>();

    // set och get metoderna

    public void setExamID(String examID) {
        this.examID = examID;
    }

    public String getExamID() {
        return examID;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;

    }

    public void setMaxPoints(String maxPoints) {
        this.maxPoints = maxPoints;
    }

    public String getMaxPoints() {
        return maxPoints;

    }

    public void setResult(ArrayList<Result> result) {
        this.result = result;
    }

    public ArrayList<Result> getResult() {
        return result;
    }

    public void addResult(Result newResult) {
        this.result.add(newResult);
    }

    public void setBelongsToCourse(Course belongsToCourse) {
        this.belongsToCourse = belongsToCourse;
    }

    public Course getBelongsToCourse() {
        return belongsToCourse;
    }

    // exam id validation
    public boolean validateExamID(String examID) {
        if (examID.substring(0, 1).equals("E")) {
            String examNbr = examID.replace("E", "");
            int nbr = Integer.parseInt(examNbr);
            if (nbr >= 10000 && nbr <= 99999) {
                return true;
            }
        }
        return false;
    }
}