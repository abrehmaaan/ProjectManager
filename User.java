
public class User {
	private String name;
	private int salary;
	
	public User(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int showSalary() {
		return salary;
	}
}
