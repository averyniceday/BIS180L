package tutorial.dao;
import java.sql.SQLException;

import tutorial.Employee;

public interface EmployeeDao {
	public void insert(Employee employee);
	public Employee findById(int id);
}
