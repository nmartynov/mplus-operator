package ru.a3.mplus.admin.operator.ui.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.a3.mplus.admin.operator.service.TestService;

@SuppressWarnings("serial")
@Component
@ManagedBean
@RequestScoped
public class TestBean implements Serializable{
	private String name="jopa";
	@Autowired
	TestService testService;
	public String getName() {
		return testService.getTestName();
	}
	public void setName(String name){
		this.name = name;
	}
	@PostConstruct
	public void init(){
		System.out.println("SUPER RESOURCE CONSTRUCTED!");
	}
	
}
