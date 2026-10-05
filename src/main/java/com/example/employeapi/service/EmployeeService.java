package com.example.employeapi.service;

import com.example.employeapi.model.Employee;
import com.example.employeapi.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Optional<Employee> updateEmployee(Long id, Employee updated) {
        return employeeRepository.findById(id).map(existing -> {
            existing.setName(updated.getName());
            existing.setDepartment(updated.getDepartment());
            existing.setSalary(updated.getSalary());
            return employeeRepository.save(existing);
        });
    }

    public boolean deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) return false;
        employeeRepository.deleteById(id);
        return true;
    }
}
