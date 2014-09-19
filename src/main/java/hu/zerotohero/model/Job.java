package hu.zerotohero.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author Attila Budai <attila.budai@zerotohero.hu>
 * 
 */
@Entity
@Table(name = "jobs")
public class Job implements Serializable {

	@Id
	@Basic(optional = false)
	@Column(name = "job_id")
	private String id;

	@Basic(optional = false)
	@Column(name = "job_title")
	private String jobTitle;

	@Column(name = "min_salary")
	private Integer minSalary;

	@Column(name = "max_salary")
	private Integer maxSalary;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "job")
	private List<Employee> employees;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	public Integer getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + "]";
	}

}
