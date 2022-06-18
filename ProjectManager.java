
public class ProjectManager extends User {
	private boolean isTechnical;
	private int extraPay;
	
	public ProjectManager(String name, int salary, boolean isTechnical, int extraPay) {
		super(name, salary);
		this.isTechnical = isTechnical;
		this.extraPay = extraPay;
	}
}
