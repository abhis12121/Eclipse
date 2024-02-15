package org.college;

public class Student extends Hostel {
	public void studentName() {
		System.out.println("abhishek");

	}

	public void StudentDept() {
       System.out.println("IIT");
}
	public void studentId() {
       System.out.println("id is 782");
	}
	public static void main(String[] args) {
		 Student s = new Student();
		 s.StudentDept();
		 s.studentId();
		 s.studentName();
		 s.collegeName();
		 s.collegeCode();
		 s.collegeRank();
		 s.hostelName();
		 s.deptName();
	}
}
