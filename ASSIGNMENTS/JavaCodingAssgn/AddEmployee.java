package JavaCodingAssgn;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {

			List<Employee> list = new ArrayList<Employee>();// this is to store the employees

			void addEmployee(Employee emp) {
				list.add(emp);
				// this method will add a new employee
			}

// will return the employee based on the id if the employee is available else returns null.
			Employee getEmployee(int id) {     
				for(Employee e: list) {		   
					if(e.getId()==id) {
						return e;
					}
				}
				return null;
			}
					

}
