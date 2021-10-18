package Employee.Webservice.EmployeeManager.repo;

import Employee.Webservice.EmployeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
