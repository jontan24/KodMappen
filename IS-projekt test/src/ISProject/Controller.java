package ISProject;

import java.awt.Label;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField textExamScore;
    @FXML
    private TextField txtStudentID;
    @FXML
    private TextField txtStudentFirstName;
    @FXML
    private TextField txtStudentLastName;
    @FXML
    private Button addNewStudentBtn;
    @FXML
    private ComboBox<Student> findStudentCB;
    @FXML
    private Button removeExistingStudentBtn;
    @FXML
    private Button updateStudentBtn;
    @FXML
    private TextField txtCourseName;
    @FXML
    private TextField txtCourseCode;
    @FXML
    private Button addNewCourseBtn;
    @FXML
    private ComboBox<Course> searchForCourseCB;
    @FXML
    private Button removeExistingCourseBtn;
    @FXML
    private Button updateCourseBtn;
    @FXML
    private TextField txtCreditsForCourse;
    @FXML
    private Button findExamLocationBtn;
    @FXML
    private Button addExamToCourseBtn;
    @FXML
    private Button removeExamFromCourseBtn;
    @FXML
    private ComboBox<WrittenExam> findExamCB;
    @FXML
    private DatePicker examDatePicker;
    @FXML
    private ComboBox<String> examTimeMinutesCB;
    @FXML
    private ComboBox<String> examTimeHoursCB;
    @FXML
    private TextArea txtShowOutput;
    @FXML
    private ComboBox<Course> ChooseCourseForExamCB;
    @FXML
    private Label studentResponseLabel;
    @FXML
    private Label resultsResponseLabel;
    @FXML
    private Label courseResponseLabel;
    @FXML
    private Label examResponseLabel;
    @FXML
    private Label lblChooseExamToShow;
    @FXML
    private Label chooseCourseForExamLabel;
    @FXML
    private ComboBox<Student> findStudentCBToAddResult;// vet inte om det ska vara sample.Student eller String i hajmunnarna
    @FXML
    private Label lblExamResponse;
    @FXML
    private ComboBox<String> examLocationCB;
    @FXML
    private ComboBox<String> creditsForCourseCB;
    @FXML
    private ComboBox<WrittenExam> findExamAndCourseCBToAddResult;
    @FXML
    private ComboBox<String> findStudentToAddResultCB;

    private boolean foundStudentBoolean = false;
    private boolean foundCourseBoolean = false;
    private boolean foundExamBoolean = false;

    StudentRegister studentRegister = new StudentRegister();
    Student student = new Student();
    CourseRegister courseRegister = new CourseRegister();

    ObservableList<Student> listToFindStudent = FXCollections.observableArrayList();
    ObservableList<Student> sortedListToFindStudent = FXCollections.observableArrayList();
    ObservableList<Course> listToFindCourses = FXCollections.observableArrayList();
    ObservableList<Course> sortedListToFindCourses = FXCollections.observableArrayList();
    ObservableList<WrittenExam> listToFindExams = FXCollections.observableArrayList();
    ObservableList<WrittenExam> sortedListToFindExam = FXCollections.observableArrayList();
    ObservableList<String> examTimeMinutes = FXCollections.observableArrayList("00", "15", "30", "45");

    ObservableList<String> examTimeHours = FXCollections.observableArrayList("08", "09", "10", "11", "12", "13", "14",
            "15", "16", "17", "18");
    ObservableList<WrittenExam> listToFindExamAndCourseToAddResult = FXCollections.observableArrayList();
    ObservableList<WrittenExam> sortedListToFindExamAndCourseToAddResult = FXCollections.observableArrayList();
    ObservableList<String> listOfLocationsForExam = FXCollections.observableArrayList("Room A123", "Room A167",
            "“Room\r\n" + "B198", "Room B067");
    ObservableList<String> listOfCreditsForCourse = FXCollections.observableArrayList("0.5", "1.0", "2.0", "5.0", "7.5",
            "10.0", "15.0", "30.0");

    @FXML
    private void initialize() {

        examTimeHoursCB.setItems(examTimeHours);
        examTimeHoursCB.setDisable(true);
        examTimeMinutesCB.setItems(examTimeMinutes);
        examTimeMinutesCB.setDisable(true);
        examLocationCB.setItems(listOfLocationsForExam);
        examLocationCB.setDisable(true);
        // examDatePicker.getEditor().setDisable(true);
        examDatePicker.setDisable(true);
        creditsForCourseCB.setItems(listOfCreditsForCourse);
        findExamAndCourseCBToAddResult.setDisable(true);
        textExamScore.setDisable(true); // ?

        sortedListToFindStudent = listToFindStudent.sorted();
        findStudentCB.setItems(sortedListToFindStudent);
        findStudentCBToAddResult.setItems(sortedListToFindStudent);

        // Populating Find Course ComboBox (list) with test data
        sortedListToFindCourses = listToFindCourses.sorted();
        searchForCourseCB.setItems(sortedListToFindCourses);

        // Populating Find Written exam ComboBox (list) with test data
        sortedListToFindExam = listToFindExams.sorted();
        findExamCB.setItems(sortedListToFindExam);

        // Populating the ComboBox for writtenExams used to add result
        sortedListToFindExamAndCourseToAddResult = listToFindExamAndCourseToAddResult.sorted();
        findExamAndCourseCBToAddResult.setDisable(true);
    }

    // Add student
    @FXML
    public void btnAddStudent_Click(ActionEvent event) {

        if (txtStudentFirstName.getText().equals(" ") || txtStudentLastName.getText().equals(" ")) {
            courseResponseLabel.setText("Both first and last name are required to add a new student.");

        } else {

            String studentFirstName = txtStudentFirstName.getText();
            String studentLastName = txtStudentLastName.getText();

            String studentName = studentLastName + studentFirstName;

            Student studentToBeAdded = new Student();
            studentToBeAdded.setName(studentName);

            while (true) {
                Random generateStudentID = new Random();
                int newStudentID = generateStudentID.nextInt(89999) + 10000;
                String studentID = "S" + newStudentID;
                if (studentRegister.validateStudentID(studentID) == false) {
                    continue;
                }
                boolean tmpConditionForWhileLoop = true;
                for (Student otherExistingStudentIDs : studentRegister.getStudents()) {
                    if (studentID.equals(otherExistingStudentIDs.getStudentID())) {
                        tmpConditionForWhileLoop = false;
                    }
                }
                if (!tmpConditionForWhileLoop) {
                    continue;
                }
                studentToBeAdded.setStudentID(studentID);
                studentRegister.addStudent(studentToBeAdded);
                listToFindStudent.add(studentToBeAdded);
                sortedListToFindStudent = listToFindStudent.sorted();
                findStudentCB.setItems(sortedListToFindStudent);
                txtStudentFirstName.setText("");
                txtStudentLastName.setText("");
                findStudentCB.setValue(null);
                // creditsForCourseComboBox.setValue(null);
                courseResponseLabel.setText(studentToBeAdded.getName() + " was added. ");

            }
        }
    }

    // Find student
    public void btnFindStudent_Click(ActionEvent event) {
        try {
            Student studentToBeFound = findStudentCB.getValue();
            String[] splittName = studentToBeFound.getName().split(" ");
            String firstName = "";
            String lastName = "";
            int nbrOfNames = splittName.length;
            if (nbrOfNames == 2) {
                firstName = splittName[0];
                lastName = splittName[1];
            } else if (nbrOfNames > 2) {
                firstName = splittName[0];
                for (int i = 1; i < splittName.length; i++) {
                    lastName += splittName[i] + " ";
                }
            }
            txtStudentFirstName.setText(firstName);
            txtStudentLastName.setText(lastName);
            txtStudentID.setText(studentToBeFound.getStudentID());
            studentResponseLabel
                    .setText(studentToBeFound.getName() + " (" + studentToBeFound.getStudentID() + ") has been found.");
            foundStudentBoolean = true;
        } catch (NullPointerException e) {
            studentResponseLabel
                    .setText("An unexpected error occured. The student was deleted. Please check 'Find student'.");
        }
    }

    //remove student
    @FXML
    public void btnRemoveStudent_Click(ActionEvent event) {

        Student studentToBeRemoved = studentRegister.findStudent(txtStudentID.getText());
        try {
            if (foundStudentBoolean == true) {
                String name = studentToBeRemoved.getName();
                String studentID = studentToBeRemoved.getStudentID();
                for (Student studentToBeRemovedFromList : listToFindStudent) {
                    if (studentToBeRemovedFromList.getStudentID().equals(studentID)) {
                        studentRegister.removeStudent(studentID);
                        listToFindStudent.remove(studentToBeRemovedFromList);
                        sortedListToFindStudent = listToFindStudent.sorted();
                        findStudentCB.setItems(sortedListToFindStudent);
                        studentResponseLabel.setText(name + " (" + studentID + ") has been deleted.");
                        txtStudentFirstName.setText("");
                        txtStudentLastName.setText("");
                        txtStudentID.setText("");
                        findStudentCB.setValue(null);
                    }
                }
            } else {
                studentResponseLabel
                        .setText("You need to use the 'Find student' button before you can remove a student.");
            }
        } catch (NullPointerException e) {
            studentResponseLabel.setText("You need to use the 'Find student' button before you can remove a student.");
        } catch (ConcurrentModificationException e2) {
            studentResponseLabel.setText(
                    studentToBeRemoved.getName() + " (" + studentToBeRemoved.getStudentID() + ") has been removed.");
        }
    }

    // Update student

    @FXML
    public void updateStudent_Click(ActionEvent event) {

        try {
            if (foundStudentBoolean == true) {
                String txtFieldFirstName = txtStudentFirstName.getText();
                String txtFieldLastName = txtStudentLastName.getText();
                String txtFieldName = txtFieldFirstName + " " + txtFieldLastName;
                String foundStudentsID = txtStudentID.getText();
                /*
                 * if (txtStudentID == null) { lblStudentResponse.
                 * setText("No student has been selected. Try again by using 'Find student'.");
                 * }
                 */ // smart men ska vi ha med det, pgav att vi kanske inte tänkt på det själva..

                if (txtStudentID != null) {
                    Student studentToBeUpdated = studentRegister.findStudent(foundStudentsID);
                    if (studentToBeUpdated.getName().equals(txtFieldName)) {
                        studentResponseLabel.setText("No change has been made. Try again.");
                    } else if (studentToBeUpdated.getName() != txtFieldName) {
                        String txtFieldNameTmp = txtFieldName.replaceAll(" ", "");
                        if (txtFieldNameTmp.equals("")) {
                            studentResponseLabel
                                    .setText("A full name is required. Please enter both first and last name.");
                        } else if (txtStudentFirstName.getText().equals("")) {
                            studentResponseLabel.setText("A full name is required. Please enter first name.");
                        } else if (txtStudentLastName.getText().equals("")) {
                            studentResponseLabel.setText("A full name is required. Please enter last name.");
                        } else {
                            studentToBeUpdated.setName(txtFieldName);
                            listToFindStudent.remove(studentToBeUpdated);
                            sortedListToFindStudent = listToFindStudent.sorted();
                            findStudentCB.setItems(sortedListToFindStudent);
                            listToFindStudent.add(studentToBeUpdated);
                            sortedListToFindStudent = listToFindStudent.sorted();
                            findStudentCB.setItems(sortedListToFindStudent);
                            findStudentCBToAddResult.setItems(sortedListToFindStudent);
                            findStudentCB.setValue(studentToBeUpdated);
                            studentResponseLabel.setText("sample.Student (" + foundStudentsID + ") name updated to "
                                    + studentToBeUpdated.getName());
                        }
                    }
                }
            } else if (foundStudentBoolean == false) {
                studentResponseLabel
                        .setText("You need to use the 'Find student' button before you can edit student info.");
            }
        } catch (NullPointerException e) {
            studentResponseLabel.setText("You need to use the 'Find student' button before you can edit student info.");
        }
    }

    // Add Course
    @FXML
    public void addCourse_Click(ActionEvent event) {
        if (txtCourseName.getText().equals("") || creditsForCourseCB.getValue() == null) {
            courseResponseLabel.setText("Try again. Both Course name and credits is required to add a new course.");
        } else {
            String courseName = txtCourseName.getText();
            double courseCredits = Double.parseDouble(creditsForCourseCB.getValue());

            Course courseToBeAdded = new Course();
            courseToBeAdded.setName(courseName);
            courseToBeAdded.setCredits(courseCredits);

            while (true) {
                Random generateCourseNbr = new Random();
                int newCourseNbr = generateCourseNbr.nextInt(89999) + 10000;
                String courseCode = "C" + newCourseNbr;
                if (courseRegister.validateCourseCode(courseCode) == false) {
                    continue;
                }
                boolean tmpConditionForWhileLoop = true;
                for (Course otherExistingCourses : courseRegister.getCourses()) {
                    if (courseCode.equals(otherExistingCourses.getCourseCode())) {
                        tmpConditionForWhileLoop = false;
                    }
                }
                if (!tmpConditionForWhileLoop) {
                    continue;
                }
                courseToBeAdded.setCourseCode(courseCode);
                courseRegister.addCourse(courseToBeAdded);
                listToFindCourses.add(courseToBeAdded);
                sortedListToFindCourses = listToFindCourses.sorted();
                searchForCourseCB.setItems(sortedListToFindCourses);
                txtCourseName.setText("");
                txtCourseCode.setText("");
                searchForCourseCB.setValue(null);
                txtCreditsForCourse.setText(" ");
                courseResponseLabel.setText(courseToBeAdded.getName() + " was assigned the course code: "
                        + courseToBeAdded.getCourseCode());

                break;
            }
        }

    }

    // find course

    @FXML
    public void btnFindCourse_Click(ActionEvent event) {
        Course courseToBeFound = searchForCourseCB.getValue();
        try {
            txtCourseName.setText(courseToBeFound.getName());
            txtCourseCode.setText(courseToBeFound.getCourseCode());
            double courseCredits = courseToBeFound.getCredits();
            String foundCourseNbrOfCredits = Double.toString(courseCredits);
            creditsForCourseCB.setValue(foundCourseNbrOfCredits);
            courseResponseLabel
                    .setText(courseToBeFound.getName() + " (" + courseToBeFound.getCourseCode() + ") has been found.");
            chooseCourseForExamLabel.setText("");
            foundCourseBoolean = true;
            examDatePicker.setDisable(false);
            examTimeHoursCB.setDisable(false);
            examTimeMinutesCB.setDisable(false);
            examLocationCB.setDisable(false);
        } catch (NullPointerException e) {
            courseResponseLabel
                    .setText("An unexpected error occured. A course was deleted. Please check 'Find course'.");
        }
    }

    // remove course

    @FXML
    public void btnRemoveCourse_Click(ActionEvent event) {
        Course courseToBeRemoved = courseRegister.findCourse(txtCourseCode.getText());
        try {
            if (foundCourseBoolean == true) {
                String name = courseToBeRemoved.getName();
                String courseCode = courseToBeRemoved.getCourseCode();
                for (Course courseToBeRemovedFromRegister : listToFindCourses) {
                    if (courseToBeRemovedFromRegister.getCourseCode().equals(courseCode)) {
                        courseRegister.removeCourse(courseCode);
                        listToFindCourses.remove(courseToBeRemovedFromRegister);
                        sortedListToFindCourses = listToFindCourses.sorted();
                        searchForCourseCB.setItems(sortedListToFindCourses);
                        courseResponseLabel.setText(name + " (" + courseCode + ") has been deleted.");
                        txtCourseName.setText("");
                        txtCourseCode.setText("");

                        searchForCourseCB.setValue(null);
                        creditsForCourseCB.setValue(null);

                    }
                }
            } else {
                courseResponseLabel.setText("You need to use the 'Find course' button before you can delete a course.");
            }
        } catch (ConcurrentModificationException e) {
            courseResponseLabel.setText(
                    courseToBeRemoved.getName() + " (" + courseToBeRemoved.getCourseCode() + ") has been removed.");
        } catch (NullPointerException e2) {
            courseResponseLabel.setText("You need to use the 'Find course' button before you can delete a course.");
        }
    }

    // remove course
    @FXML
    public void updateCourse_Click(ActionEvent event) {
        try {
            if (foundCourseBoolean == true) {
                String txtFieldCourseName = txtCourseName.getText();
                Course foundCourse = courseRegister.findCourse(txtCourseCode.getText());
                String foundCourseCredits = Double.toString(foundCourse.getCredits()); // så den går från att ha haft
                // ett doublevärde till att bli
                // en String!
                if (foundCourse.getName().equals(txtFieldCourseName)
                        && foundCourseCredits.equals(creditsForCourseCB.getValue())) {
                    courseResponseLabel.setText("No change has been made. Try again.");
                } else if (foundCourse.getName() != txtFieldCourseName
                        && foundCourseCredits.equals(creditsForCourseCB.getValue())) {
                    if (txtCourseName.getText().replace(" ", "").equals("")) {
                        courseResponseLabel.setText("A course name is required. Try again.");
                    } else if (foundCourse.getName() != txtFieldCourseName) {
                        foundCourse.setName(txtFieldCourseName);
                        listToFindCourses.remove(foundCourse);
                        sortedListToFindCourses = listToFindCourses.sorted();
                        searchForCourseCB.setItems(sortedListToFindCourses);
                        listToFindCourses.add(foundCourse);
                        sortedListToFindCourses = listToFindCourses.sorted();
                        searchForCourseCB.setItems(sortedListToFindCourses);
                        searchForCourseCB.setValue(foundCourse);
                        courseResponseLabel.setText("Course name updated to " + foundCourse.getName());
                    }
                } else if (foundCourse.getName().equals(txtFieldCourseName)
                        && foundCourseCredits != creditsForCourseCB.getValue()) {
                    if (foundCourseCredits != (creditsForCourseCB.getValue())) {
                        double courseCredits = Double.parseDouble(creditsForCourseCB.getValue());
                        foundCourse.setCredits(courseCredits);
                        courseResponseLabel.setText("Course credits updated to " + courseCredits);
                    }
                } else if (!foundCourse.getName().equals(txtFieldCourseName)
                        && foundCourseCredits != creditsForCourseCB.getValue()) {
                    foundCourse.setName(txtFieldCourseName);
                    double creditsToBeUpdatedForCourse = Double.parseDouble(creditsForCourseCB.getValue());
                    foundCourse.setCredits(creditsToBeUpdatedForCourse);
                    listToFindCourses.remove(foundCourse);
                    sortedListToFindCourses = listToFindCourses.sorted();
                    searchForCourseCB.setItems(sortedListToFindCourses);
                    listToFindCourses.add(foundCourse);
                    sortedListToFindCourses = listToFindCourses.sorted();
                    searchForCourseCB.setItems(sortedListToFindCourses);
                    searchForCourseCB.setValue(foundCourse);
                    courseResponseLabel.setText("Course name is " + foundCourse.getName() + " and course credits are "
                            + creditsToBeUpdatedForCourse);
                }
            }
            if (foundCourseBoolean == false) {
                courseResponseLabel
                        .setText("You need to use the 'Find course' button before you can edit course info.");
            }
        } catch (NullPointerException e) {
            courseResponseLabel.setText("You need to use the 'Find course' button before you can edit course info.");
        }
    }

    // add written exam

    @FXML
    public void addWrittenExamToCourse_Click(ActionEvent event) {
        try {
            if (foundCourseBoolean == true && searchForCourseCB.getValue() != null) {

                Course courseToAddWrittenExam = searchForCourseCB.getValue();
                LocalDate writtenExamDate = examDatePicker.getValue();
                DateTimeFormatter writtenExamDateFormatter = DateTimeFormatter.ofPattern("d MMM uuuu");
                String formattedWrittenExamDate = writtenExamDate.format(writtenExamDateFormatter);
                String examHour = examTimeHoursCB.getValue();
                String examMinute = examTimeMinutesCB.getValue();
                String locationForWrittenExam = examLocationCB.getValue();
                WrittenExam writtenExamToBeAdded = new WrittenExam();
                writtenExamToBeAdded.setDate(formattedWrittenExamDate);
                writtenExamToBeAdded.setTime(examMinute + ":" + examHour);
                writtenExamToBeAdded.setLocation(locationForWrittenExam);

                for (Course courseToBeCheckedForDoubleBooking : courseRegister.getCourses()) {
                    for (WrittenExam writtenExamToBeCheckedForDoubleBooking : courseToBeCheckedForDoubleBooking
                            .getWrittenExamList()) {

                        if (writtenExamToBeCheckedForDoubleBooking.getDate().equals(formattedWrittenExamDate)
                                && writtenExamToBeCheckedForDoubleBooking.getLocation().equals(locationForWrittenExam)
                                && writtenExamToBeCheckedForDoubleBooking.getTime()
                                .equals(examHour + ":" + examMinute)) {

                            examResponseLabel.setText("This location is already booked at this time");
                        }
                    }
                    if (examMinute == null || examHour == null || locationForWrittenExam == null) {
                        examResponseLabel.setText(
                                "Date, time (hh & mm), to add a new exam you need a location and a selected course.");
                    } else {
                        while (true) {
                            Random generateWrittenExamNr = new Random();
                            int newWrittenExamNr = generateWrittenExamNr.nextInt(89999) + 10000;
                            String writtenExamID = "E" + newWrittenExamNr;

                            if (writtenExamToBeAdded.validateExamID(writtenExamID) == false) {
                                continue;
                            }
                            boolean tmpConditionForWhileLoop = true;

                            for (Course allCourses : courseRegister.getCourses()) {

                                for (WrittenExam otherWrittenExams : allCourses.getWrittenExamList()) {

                                    if (writtenExamID.equals(otherWrittenExams.getExamID())) {
                                        tmpConditionForWhileLoop = false;
                                    }

                                }

                                if (!tmpConditionForWhileLoop) {
                                    continue;
                                }
                                writtenExamToBeAdded.setExamID(writtenExamID);
                                courseToAddWrittenExam.addWrittenExam(writtenExamToBeAdded);
                                listToFindExams.add(writtenExamToBeAdded);

                                Course tmpCourse = searchForCourseCB.getValue();

                                writtenExamToBeAdded.setBelongsToCourse(tmpCourse);
                                sortedListToFindExam = listToFindExams.sorted();

                                listToFindExamAndCourseToAddResult.add(writtenExamToBeAdded);

                                findExamCB.setItems(sortedListToFindExam);
                                examResponseLabel.setText("Exam " + writtenExamID + "has been added to the course "
                                        + searchForCourseCB.getValue() + "\nThe date set is " + formattedWrittenExamDate

                                        + " at " + examHour + ":" + examMinute + " in " + locationForWrittenExam);
                                break;
                            }
                        }
                    }
                }
            } else {

                examResponseLabel.setText("You need to use the 'Find course' button before you can add a new exam.");

                chooseCourseForExamLabel.setText("Choose course here!");
            }
        } catch (NullPointerException e) {

            examResponseLabel
                    .setText("Date, time (hh & mm), location and a selected course is required to add a new exam.");
        }
    }

    // Button for registering a result for a student
    @FXML
    public void btnRegisterResult_Click(ActionEvent Event) {
        try {
            Student studentToAddResult = findStudentCBToAddResult.getValue();
            WrittenExam examToAddResult = findExamCB.getValue();
            String textWrittenExamScore = textExamScore.getText();
            int writtenExamValue = Integer.parseInt(textWrittenExamScore);
            Result resultToBeAdded = new Result();
            if (writtenExamValue < 0) {
                resultsResponseLabel.setText(
                        "The value you have entered subceeds the minimum score limit(0), please enter another value");
            } else if (writtenExamValue > 100) {
                resultsResponseLabel.setText(
                        "The value you have entered exceeds the Maximum score limit(100), please enter another value");
            } else {
                resultToBeAdded.setWrittenExam(examToAddResult);
                resultToBeAdded.setStudent(studentToAddResult);
                resultToBeAdded.giveResult(writtenExamValue);
                examToAddResult.addResult(resultToBeAdded);
                studentToAddResult.addResult(resultToBeAdded);
                resultsResponseLabel.setText("The grade: " + resultToBeAdded.getLetterGrade() + " with a score of: ("
                        + writtenExamValue + "/100) has been added to student" + studentToAddResult.getName()
                        + " with student-ID: " + studentToAddResult.getStudentID() + " for exam: " + examToAddResult
                        + ".");
                findExamCB.setValue(null);
                findExamCB.setDisable(true);
                findStudentToAddResultCB.setValue(null);
                textExamScore.setText("");
                textExamScore.setDisable(true);
            }
        } catch (NullPointerException e) {
            resultsResponseLabel
                    .setText("Please a student, an exam and enter a exam score (0-100) to register a new result.");
        } catch (NumberFormatException e2) {
            resultsResponseLabel
                    .setText("Please a student, an exam and enter a exam score (0-100) to register a new result.");
        }
    }

    @FXML
    public void cBfindWrittenExam_Click(ActionEvent event) {

        try {
            WrittenExam exam = findExamCB.getValue();
            foundExamBoolean = true;
            examResponseLabel.setText("Exam " + exam.getExamID() + "from course " + exam.getBelongsToCourse()
                    + "has been selected. \n The date set is " + exam.getDate() + "at " + exam.getTime() + "in "
                    + exam.getLocation());
            // lblChooseExamToShow.setText("");

        } catch (NullPointerException e) {
            examResponseLabel.setText("An error occured. Find/Select new exam.");
        }

    }

    // remove written exam
    @FXML
    public void btnRemoveWrittenExam_Click(ActionEvent event) {
        WrittenExam removeExam = findExamCB.getValue();
        try {
            if (foundExamBoolean == true) {
                Course courseToRemoveWrittenExamFrom = removeExam.getBelongsToCourse();
                String ExamID = removeExam.getExamID();
                Course belongsToCourse = removeExam.getBelongsToCourse();
                String courseName = belongsToCourse.getName();
                for (WrittenExam examToBeDeletedFromList : listToFindExams) {
                    if (examToBeDeletedFromList.getExamID().equals(ExamID)) {
                        courseToRemoveWrittenExamFrom.removeWrittenExam(ExamID);
                        listToFindExams.remove(examToBeDeletedFromList);
                        sortedListToFindExam = listToFindExams.sorted();

                        findExamCB.setItems(sortedListToFindExam);
                        examResponseLabel
                                .setText("Exam: " + ExamID + " from course: " + courseName + " has been deleted.");

                    }
                }
            } else {
                examResponseLabel
                        .setText("Before you can delete a exam you need to use the 'Find written exam' button");
            }

        } catch (NullPointerException e) {
            examResponseLabel.setText("No exam has been found/selected, try again.");
        }
    }

    @FXML
    public void findStudentToAddResultCB_Click(ActionEvent event) {
        try {
            Student student = findStudentCBToAddResult.getValue();

            listToFindExamAndCourseToAddResult.setAll(listToFindExams);
            sortedListToFindExamAndCourseToAddResult = listToFindExamAndCourseToAddResult.sorted();

            findExamAndCourseCBToAddResult.setItems(sortedListToFindExamAndCourseToAddResult);

            for (Result resultThatIsAlreadyAdded : student.getResult()) {

                WrittenExam examToBeRemovedFromList = resultThatIsAlreadyAdded.getWrittenExam();
                listToFindExamAndCourseToAddResult.remove(examToBeRemovedFromList);
            }
            sortedListToFindExamAndCourseToAddResult = listToFindExamAndCourseToAddResult.sorted();
            findExamAndCourseCBToAddResult.setItems(sortedListToFindExamAndCourseToAddResult);
            findExamAndCourseCBToAddResult.setDisable(false);
        } catch (NullPointerException e) {

        }

    }
    /*
     * @FXML public void cBfindExamAndCourseToAddResult_Click(ActionEvent event) {
     * WrittenExam exam = findExamAndCourseCBToAddResult.getValue();
     * txtExamScore.setDisable(false);
     *
     * }
     *
     * // button to clear all
     *
     * @FXML public void btnClearAll_Click(ActionEvent event) {
     *
     * }
     */
}

