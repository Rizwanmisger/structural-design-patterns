
package adapter;

import java.util.List;

public class Demo {

	public static void main(String[] args) {

		EmployeeClient client = new EmployeeClient();
		List<Employee> employeeList = client.getEmployeeList();
		System.out.println(employeeList);
	}
}
