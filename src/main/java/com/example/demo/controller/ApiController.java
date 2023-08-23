package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.AppEntity;
import com.example.demo.service.Appservice;

@RestController
public class ApiController {
	@Autowired
	Appservice eser;
	@PostMapping("addn")//adding n details
	public List<AppEntity> addnstudents(@RequestBody List<AppEntity> ee) {
		return eser.saveninfo(ee);
	}
	@GetMapping("shown")
	public List<AppEntity> show(){
		return eser.showinfo();
	}
	@PutMapping("updatebyidn/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody AppEntity ee) {
		return eser.updateinfobyid(id,ee);
	}
	@DeleteMapping("deleten")
	public void deleteMyParamId(@RequestParam int id)
	{
	     eser.deleteinfo(id); 
	}
	

}
