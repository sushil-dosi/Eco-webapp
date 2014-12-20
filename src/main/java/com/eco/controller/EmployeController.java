package com.eco.controller;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.eco.entities.Employee;
import com.eco.services.EmployeeService;

@Controller
@Scope("request")
public class EmployeController {

	public static Logger logger = Logger.getLogger(EmployeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        return new ModelAndView("home");
    }

   
    @RequestMapping(value = "/employeeList", method = RequestMethod.GET, produces = {"application/xml", "application/json"} )
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Employee> employeeList() {
        return employeeService.findAllEmployee();
    }
    
    @RequestMapping(value = "/employeesList", method = RequestMethod.GET, produces = {"application/xml", "application/json"} )
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String employeesList() throws JsonGenerationException, JsonMappingException, IOException {
    	ObjectMapper mapper = new ObjectMapper();
    	logger.info(mapper.writeValueAsString (employeeService.findAllEmployee().get(0)));
    	return mapper.writeValueAsString (employeeService.findAllEmployee().get(0));
    	
    }
    
    
    @RequestMapping(value = "employees", method = RequestMethod.GET)
    public ModelAndView getEmployes() {
    	logger.info("INN FUNCTION");
        ModelAndView mv= new ModelAndView("employeeModel");
        mv.addObject("employeeModel", employeeService.findAllEmployee());
        return mv;
    }
	
}
