package dellatan.mcm.edu.idactivity;

public class Student {
    private int studentID;
    private String studentFname;
    private String studentLname;
    private char studentSex;
    private int studentAge;


    public Student(int id, String fname, String lname, char sex, int age) {
        studentID = id;
        studentFname = fname;
        studentLname = lname;
        studentSex = sex;
        studentAge = age;
    }


    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;

    }
    public String getStudentFname() {
        return studentFname;
    }
    public void setStudentLname(String studentFname) {
        this.studentFname = studentFname;
    }


    public String getStudentLname() {
        return studentLname;
    }
    public void setStudentFname(String studentLname) {
        this.studentLname = studentLname;
    }


    public char getStudentSex() {
        return studentSex;
    }
    public void setStudentSex(char studentSex) {
        this.studentSex = studentSex;
    }


    public int getStudentAge() {
        return studentAge;
    }
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }





}
