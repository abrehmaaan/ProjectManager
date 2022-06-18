
public class Project {
	private String name;
	private int PMcommission;
	
	public Project(String name, int commission) {
		this.name = name;
		this.PMcommission = commission;
	}
	
	private int getPMcommission() {
		return PMcommission;
	}
}
