package io.egen.api.controller;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.egen.api.constants.URI;
import io.egen.api.entity.User;
import io.egen.api.service.UserService;

//@Component
//@Controller
//@ResponseBody

@RestController
@RequestMapping(value=URI.USERS)
public class UserController {
	
	
	private UserService userService;
	
	public UserController(UserService userService){
		this.userService = userService;		
	}
	
     // @ResponseBody
    @RequestMapping(method=RequestMethod.GET) //, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<User> findAllUsers(){
    	return userService.findAll();
	}
    
   // @ResponseBody
    @RequestMapping(method=RequestMethod.GET,value=URI.TO_PATH) //, produces= MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User findUser(@PathVariable("id") String id) {
    	
    	return userService.findUser(id);
	}
    
    //@ResponseBody
    @RequestMapping(method=RequestMethod.POST,value=URI.TO_PATH) //, produces= MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User createUser(@RequestBody User user) {

    	return userService.createUser(user);
	}
    
   // @ResponseBody
    @RequestMapping(method=RequestMethod.PUT,value=URI.TO_PATH) //, produces= MediaType.APPLICATION_JSON_UTF8_VALUE,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User updateUser(@PathVariable("id") String id,@RequestBody User user) {
    	return userService.updateUser(id, user);
	}

    //@ResponseBody
    @RequestMapping(method=RequestMethod.DELETE,value=URI.TO_PATH)//,consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteUser(@PathVariable("id") String id) {
    	userService.delete(id);
	}
}
