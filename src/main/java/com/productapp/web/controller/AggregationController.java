package com.productapp.web.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.entities.Employee;
import com.productapp.model.service.EmployeeService;

@RestController
public class AggregationController {
	
	@Autowired
	private EmployeeService empService;
	
	
	
	
	
	@GetMapping(path="employee/salary",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> averageSalary(){
		
		DoubleSummaryStatistics DoubleSummaryStatistics = new DoubleSummaryStatistics();
		List<Employee> empList = empService.showAllEmployees();
		empList.stream().collect(Collectors.groupingBy(x -> {
            return new ArrayList<String>(Arrays.asList(x.getCity(), x.getJob()));
		}))
.entrySet()
.stream()
.forEach(x -> {
        System.out.println(x.getKey());
        x.getValue().stream()
            .forEach(p -> System.out.printf(" ( %2s %-10s %-10f )%n", p.getName(), p.getCity(), p.getSalary()));
    });
		
	
	Map<String,Double> result= empList.stream().collect(Collectors.groupingBy(
            Employee::getJob,Collectors.averagingDouble(Employee::getSalary)));
	/*Iterator<Double> iterator = salaryList.listIterator();
	while(iterator.hasNext()){
		doubleSummaryStatistics 
        .accept(iterator.next()); 
	}*/
	
	return new ResponseEntity<>( HttpStatus.OK);

}
	
}

