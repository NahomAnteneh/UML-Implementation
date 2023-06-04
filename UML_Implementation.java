public class Employee {

	private int Employee_Id;
	private string Employee_Name;
	private string Role;
	public Student_Group m_Student_Group;

	public Employee(){

	}

	public void finalize() throws Throwable {

	}

	public void arrange_meeting(){

	}

	public void get_student_info(){

	}

}
public class Meeting {

	private int Duration;
	private string Place;
	private string Subject;
	private Date Term;
	public Employee m_Employee;
	public Student_Group m_Student_Group;

	public Meeting(){

	}

	public void finalize() throws Throwable {

	}

	public void Arrange_meetings(){

	}

}
public class Attendance {

	private string Notes;
	private bool presence;
	public Meeting m_Meeting;
	public Student m_Student;

	public Attendance(){

	}

	public void finalize() throws Throwable {

	}

	public void attendance_list(){

	}

}
public class Courses {

	private int Course_ID;
	private int Credit_hr;
	private int Credit_point;
	private int Lecture_hr;
	public Meeting m_Meeting;

	public Courses(){

	}

	public void finalize() throws Throwable {

	}

	public void display_courses(){

	}

}
public class Grade {

	private char course_grade;
	private char value;
	public Courses m_Courses;
	public Student m_Student;



	public void finalize() throws Throwable {

	}

	public void Grade(){

	}

	public void ~Grade(){

	}

	public bool pass(){
		return null;
	}

}
public class Final_grade extends Grade {

	private float avarage;
	private int Total_score;
	public Partial_grade m_Partial_grade;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public int Final_grade(){
		return 0;
	}

}
public class Partial_grade extends Grade {

	private int Assignment;
	private int Final;
	private int mid_term;
	private int quiz;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public void Partial_grade(){

	}

}
public class Student {

	private int Album_Number;
	private int Student_ID;
	private string Student_Name;

	public Student(){

	}

	public void finalize() throws Throwable {

	}

	public string get_courses(){
		return "";
	}

	public char get_grade(){
		return 0;
	}

}
public class Student_Group {

	private string Group_Name;
	private long Year_Book;
	public Student m_Student;

	public Student_Group(){

	}

	public void finalize() throws Throwable {

	}

	public long Max_Count(){
		return 0;
	}

	public long Student_Count(){
		return 0;
	}

}