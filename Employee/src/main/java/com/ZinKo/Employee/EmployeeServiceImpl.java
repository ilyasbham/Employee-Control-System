package com.ZinKo.Employee;


import java.util.Optional;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
     private EmployeeRepository employeeRepository;
    // List<Employee> employees=new ArrayList<>();

    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity=new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        // employees.add(employee);
        return "SAVED SUCCESSFULLY";
    }

@Override
public List<Employee> readEmployees() {
    List<EmployeeEntity> employeesList = employeeRepository.findAll();
    List<Employee> employees = new ArrayList<>();

    for (EmployeeEntity employeeEntity : employeesList) {
        Employee emp = new Employee();
        emp.setName(employeeEntity.getName());
        emp.setEmail(employeeEntity.getEmail());
        emp.setPhone(employeeEntity.getPhone()); // add this
        employees.add(emp);
    }

    return employees;
}


   @Override
public boolean deleteEmployee(Long id) {
    if (employeeRepository.existsById(id.intValue())) {
        employeeRepository.deleteById(id.intValue());
        return true;
    }
    return false;
}

@Override
public String updateEmployee(Long id, Employee employee) {
    Optional<EmployeeEntity> optionalEmployee = employeeRepository.findById(id.intValue());

    if (optionalEmployee.isPresent()) {
        EmployeeEntity existingEmployee = optionalEmployee.get();
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());
        existingEmployee.setEmail(employee.getEmail());

        employeeRepository.save(existingEmployee);
        return "Update successfully";
    } else {
        return "Employee not found";
    }
}
@Override
public Employee getEmployeeById(Long id) {
    Optional<EmployeeEntity> optionalEmployee = employeeRepository.findById(id.intValue());

    if (optionalEmployee.isPresent()) {
        EmployeeEntity entity = optionalEmployee.get();
        Employee employee = new Employee();
        employee.setId(entity.getId());
        employee.setName(entity.getName());
        employee.setPhone(entity.getPhone());
        employee.setEmail(entity.getEmail());
        return employee;
    } else {
        throw new RuntimeException("Employee not found with ID: " + id);
    }
}

}
