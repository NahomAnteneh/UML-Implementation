#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Student_Group;

class Employee {
private:
    int Employee_Id;
    string Employee_Name;
    string Role;
    Student_Group* m_Student_Group;

public:
    Employee() {}

    void arrange_meeting() {}

    void get_student_info() {}
};

class Meeting {
private:
    int Duration;
    string Place;
    string Subject;
    Date Term;
    Employee* m_Employee;
    Student_Group* m_Student_Group;

public:
    Meeting() {}

    void Arrange_meetings() {}
};

class Attendance {
private:
    string Notes;
    bool presence;
    Meeting* m_Meeting;
    Student* m_Student;

public:
    Attendance() {}

    void attendance_list() {}
};

class Courses {
private:
    int Course_ID;
    int Credit_hr;
    int Credit_point;
    int Lecture_hr;
    Meeting* m_Meeting;

public:
    Courses() {}

    void display_courses() {}
};

class Grade {
private:
    char course_grade;
    char value;
    Courses* m_Courses;
    Student* m_Student;

public:
    Grade() {}

    virtual ~Grade() {}

    bool pass() { return false; }
};

class Final_grade : public Grade {
private:
    float average;
    int Total_score;
    Partial_grade* m_Partial_grade;

public:
    int Final_grade() { return 0; }
};

class Partial_grade : public Grade {
private:
    int Assignment;
    int Final;
    int mid_term;
    int quiz;

public:
    Partial_grade() {}
};

class Student {
private:
    int Album_Number;
    int Student_ID;
    string Student_Name;

public:
    Student() {}

    string get_courses() { return ""; }

    char get_grade() { return 0; }
};

class Student_Group {
private:
    string Group_Name;
    long Year_Book;
    vector<Student*> m_Students;

public:
    Student_Group() {}

    long Max_Count() { return 0; }

    long Student_Count() { return m_Students.size(); }
};
