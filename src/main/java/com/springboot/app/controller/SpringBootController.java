package com.springboot.app.controller;

import com.springboot.app.dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SpringBootController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Laxxx....!!!";
    }

    @GetMapping("/employee")
    public Employee employee() {
        return new Employee("1", "lax", "shas");
    }

    @GetMapping("/employee/employees")
    public List<Employee> employees() {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("1", "lax", "shas"));
        emp.add(new Employee("2", "Ani", "shas"));
        emp.add(new Employee("3", "lax", "why"));
        emp.add(new Employee("4", "why", "Ani"));
        emp.add(new Employee("5", "bye", "lax"));
        return emp;
    }

    //http://localhost:8080/employee/1/lax/shast
    //@PathVariable
    @GetMapping("/employee/{id}/{firstName}/{lastName}")
    public Employee employeeByPathVariable(@PathVariable("id") String id,
                                           @PathVariable("firstName") String firstName,
                                           @PathVariable("lastName") String lastName) {
        return new Employee(id, firstName, lastName);

    }

    //build rest API to handle Query parameter
    //http://localhost:8080/employee?id=101&firstName=Lax&lastName=Shas
    @GetMapping("/employee/query")
    public Employee employeeQueryParam(@RequestParam(name = "id") String id,
                                       @RequestParam(name = "firstName") String firstName,
                                       @RequestParam(name = "lastName") String lastName) {
        return new Employee(id, firstName, lastName);
    }

    @GetMapping("/dev-dependency")
    public String string() {
        return  "Hello - Successfully Done... because of Spring-boot dev dependency";
    }


}
