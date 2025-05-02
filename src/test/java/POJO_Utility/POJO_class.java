package POJO_Utility;

public class POJO_class {

	private String projectName;
	private String status;
	private String createdBy;
	private int teamSize;

	public POJO_class() {

	}

	public POJO_class(String projectName, String status, String createdBy, int teamSize) {
        super();
		this.projectName = projectName;
		this.status = status;
		this.createdBy = createdBy;
		this.teamSize = teamSize;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getcreatedBy() {
		return createdBy;
	}

	public void setcreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

}
