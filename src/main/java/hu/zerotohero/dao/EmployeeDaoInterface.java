package hu.zerotohero.dao;

import hu.zerotohero.model.Employee;

/**
 * @author Adam Saghy <adam.saghy@webvalto.hu>
 */
public interface EmployeeDaoInterface {
	Employee findEmployeeById(Integer id);

	Employee findEmployeeWithJobById(Integer id);

	Employee findManagerByEmployee(Employee employee);
}
