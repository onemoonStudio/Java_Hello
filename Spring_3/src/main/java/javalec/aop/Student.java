package javalec.aop;

public class Student {
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void getInfo() {
		System.out.println(this.name);
	}

}
