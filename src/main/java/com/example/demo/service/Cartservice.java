package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CartEntity;
import com.example.demo.Repository.CartRepo;

@Service
public class Cartservice {
	@Autowired
	CartRepo er;
	public List<CartEntity> saveninfo(List<CartEntity> ee) {
		return (List<CartEntity>)er.saveAll(ee);//POST	
	}

	public List<CartEntity>showinfo(){
		return er.findAll();//GET
	}

	public String updateinfobyid(int id,CartEntity ee) {
		if(er.existsById(id)) {
			er.saveAndFlush(ee);
			return "Updated";
		}
		else {
			return "Enter valid id";
		}
	}

	public void deleteinfo(int id) {
		er.deleteById(id);

}
}
