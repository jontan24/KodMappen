package ISProject;

import java.util.ArrayList;

public class CourseRegister {

    private ArrayList<Course> courses = new ArrayList<Course>();

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course courses) {
        this.courses.add(courses);

    }

    public void removeCourse(String name) {

        Course c = findCourse(name);
        if (c != null)
            ;
        {
            courses.remove(c);
        }
    }

    public Course findCourse(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseCode().equals(courseCode))
                ;
            return c;
        }
        return null;
    }
    // retrieveAllCourseCodes()

    // course code validation
    public boolean validateCourseCode(String courseCode) {
        if (courseCode.substring(0, 1).equals("C")) {
            String codeNbr = courseCode.replace("C", "");
            int nbr = Integer.parseInt(codeNbr);
            if (nbr >= 10000 && nbr <= 99999) {
                return true;
            }
        }
        return false;
    }

}