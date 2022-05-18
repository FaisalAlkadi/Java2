package fapplication;
public class Student {
	private String studentName;
	private int studentId;
	private int studentAge;
	private String studentGender;
	public Student(String n,int id,int age,String gen) {
		studentName=n;
		studentId=id;
		studentAge=age;
		studentGender=gen;
		
	}


	public String getStudentName() {
		return studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public String getStudentGender() {
		return studentGender;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAge=" + studentAge
				+ ", studentGender=" + studentGender + "]";
	}

}