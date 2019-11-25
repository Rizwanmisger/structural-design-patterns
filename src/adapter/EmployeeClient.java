
package adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {

		List<Employee> employeeList = new ArrayList<>();
		Employee employeeDb = new EmployeeDb("101", "some", "one", "someone@db.com");
		employeeList.add(employeeDb);
		EmployeeLdap employeeLdap = new EmployeeLdap("201", "someonefrom", "ldap", "someone@ldap.com");
		employeeList.add(new EmployeeLdapAdapter(employeeLdap));
		return employeeList;
	}
}
