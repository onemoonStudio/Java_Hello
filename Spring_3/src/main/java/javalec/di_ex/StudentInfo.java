package javalec.di_ex;

public class StudentInfo {

	private Student student;
	public StudentInfo(Student student) {
		// TODO Auto-generated constructor stub
		this.student = student;
	}
	
	public void getStudentInfo() {
		if(student != null) {
			System.out.println("get "+student.getName()+"'s info");
			System.out.println("age => "+student.getAge());
		}
	}

	public void setStudentInfo(Student student) {
		this.student = student;
	}

}
