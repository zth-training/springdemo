package hu.zerotohero.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author Attila Budai <attila.budai@zerotohero.hu>
 * 
 */
@Entity
@Table(name = "employees")
public class Employee implements Serializable {

	@Id
	@Basic(optional = false)
	@Column(name = "employee_id")
	private Integer id;

	@Column(name = "first_name")
	private String firstName;

	@Basic(optional = false)
	@Column(name = "last_name")
	private String lastName;

	@Basic(optional = false)
	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Basic(optional = false)
	@Column(name = "hire_date")
	@Temporal(TemporalType.DATE)
	private Date hireDate;

	@Basic(optional = false)
	@Column(name = "salary")
	private Long salary;

	@Column(name = "commission_pct")
	private Long commissionPct;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "manager_id")
	private List<Employee> employees;

	@JoinColumn(name = "department_id")
	@ManyToOne
	private Department department;

	@JoinColumn(name = "job_id")
	@ManyToOne(optional = false)
	private Job job;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public Long getCommissionPct() {
		return commissionPct;
	}

	public void setCommissionPct(Long commissionPct) {
		this.commissionPct = commissionPct;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
