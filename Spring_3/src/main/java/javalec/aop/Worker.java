package javalec.aop;

public class Worker {
	private String where;

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public Worker() {
		// TODO Auto-generated constructor stub
	}
	
	public void getInfo() {
		System.out.println(this.where);
	}

}
