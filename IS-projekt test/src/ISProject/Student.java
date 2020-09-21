package ISProject;

import java.util.ArrayList;

public class Student {

    private String studentID;
    private String name;
    private ArrayList<Result> result = new ArrayList<Result>();

    public void setStudentID(String studentID) {
        this.studentID = studentID;

    }

    public String getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

}
