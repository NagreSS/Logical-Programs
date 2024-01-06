public class count_number_of_employees_with_age_25 {

	List<Employee> employeeList = createEmployeeList();
	long count = employeeList.stream()
	.filter(e->e.getAge()>25)
	.count();
	System.out.println("Number of employees with age 25 are : "+count);
	

	

}
