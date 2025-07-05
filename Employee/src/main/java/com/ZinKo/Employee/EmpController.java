package com.ZinKo.Employee;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class EmpController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("employees/all")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        if (employeeService.deleteEmployee(id)) {
            return "Delete Successfully";
        }
        return "Not Found";
    }

    @PutMapping("employees/{id}")
public String updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
    return employeeService.updateEmployee(id, employee);
}
@GetMapping("employees/{id}")
public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
    Employee employee = employeeService.getEmployeeById(id);
    
    if (employee != null) {
        return ResponseEntity.ok(employee);
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Employee not found");
    }
}

}
