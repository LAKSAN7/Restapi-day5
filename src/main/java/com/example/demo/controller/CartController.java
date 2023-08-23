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

import com.example.demo.Entity.CartEntity;
import com.example.demo.service.Cartservice;

@RestController
public class CartController {
	@Autowired
	Cartservice eser;
	@PostMapping("addm")//adding n details
	public List<CartEntity> addnstudents(@RequestBody List<CartEntity> ee) {
		return eser.saveninfo(ee);
	}
	@GetMapping("showm")
	public List<CartEntity> show(){
		return eser.showinfo();
	}
	@PutMapping("updatebyidm/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody CartEntity ee) {
		return eser.updateinfobyid(id,ee);
	}
	@DeleteMapping("deletem")
	public void deleteMyParamId(@RequestParam int id)
	{
	     eser.deleteinfo(id); 
	}
}
