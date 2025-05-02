package Practice_Serialization;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder(

		value = { "CreatedBy", "projectName", "status", "teamSize" }

)

@JsonIgnoreProperties(value = {"teamSize"}
, allowSetters = true

		)

class Project { // POJO Class - Plain old Java Object

	private String projectName;
	@JsonProperty(value = "Created By")
	private String CreatedBy;
	private int teamSize;
	private String status;

	public Project() {

	}

	public Project(String projectName, String CreatedBy, int teamSize, String status) {

		this.projectName = projectName;
		this.CreatedBy = CreatedBy;
		this.teamSize = teamSize;
		this.status = status;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String CreatedBy) {
		this.CreatedBy = CreatedBy;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

public class Run1_JacksonSerialization_Test {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Project pobj = new Project("Tek pyramid", "Tanmay", 0, "Created");

		ObjectMapper objM = new ObjectMapper();
		objM.writeValue(new File("./project.json"), pobj);
		System.out.println("** END **");

	}

}
