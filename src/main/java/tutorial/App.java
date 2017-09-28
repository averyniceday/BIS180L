package tutorial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tutorial.dao.EmployeeDao;

public class App {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<Employee> employees = new ArrayList<Employee>();

        Employee employee1 = new Employee(123, "kent", 30);
        Employee employee2 = new Employee(131, "henry", 30);
        Employee employee3 = new Employee(154, "bob", 30);
        Employee employee4 = new Employee(160, "avery", 30);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
        for (Employee empl:employees){
        	employeeDao.insert(empl);
        }
        
        Employee employee1a = employeeDao.findById(1230000);
        System.out.println(employee1a);
        Employee employee2a = employeeDao.findById(1310000);
        System.out.println(employee2a);
        Employee employee3a = employeeDao.findById(1540000);
        System.out.println(employee3a);
        Employee employee4a = employeeDao.findById(1600000);
        System.out.println(employee4a);
		context.close();
}
	
}
