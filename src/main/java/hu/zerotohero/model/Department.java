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
@Table(name = "departments")
public class Department implements Serializable {

	@Id
	@Basic(optional = false)
	@Column(name = "department_id")
	private Integer id;

	@Basic(optional = false)
	@Column(name = "department_name")
	private String departmentName;

	@JoinColumn(name = "location_id")
	@ManyToOne
	private Location location;

	@JoinColumn(name = "manager_id")
	@ManyToOne
	private Employee manager;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
