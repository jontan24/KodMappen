package ISProject;

import java.util.ArrayList;

public class StudentRegister {

    private ArrayList<Student> students = new ArrayList<Student>();

    public void setStudent(ArrayList<Student>students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public Student findStudent(String studentID) {
        for(Student s : students) {
            if(s.getName().equals(studentID));
            return s;
        }
        return null;
    }

    public void addStudent(Student students) {
        this.students.add(students);
    }
    public void removeStudent(String studentID) {
        Student s1 = this.findStudent(studentID);
        if(s1!= null) {
            this.students.remove(s1);
        }

    }
    //retrieveAllStudentsNames()

    // student id validation
    public boolean validateStudentID (String studentID) {
        if(studentID.substring(0, 1).equals("S")){
            String IdNbr = studentID.replace("S", "");
            int nbr = Integer.parseInt(IdNbr);
            if(nbr >= 10000 && nbr <= 99999) {
                return true;
            }
        }
        return false;
    }
}