package javalec.di_ex;

public class Student {

	private String name;
	private int age;
	private String[] hobbys;
	
	public Student(String name , int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void getHobbys() {
		for(String hello : this.hobbys) {
			System.out.print(hello + " ");
		}
	}

	public void setHobbys(String[] hobbys) {
		this.hobbys = hobbys;
	}

	

}
