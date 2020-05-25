package nelson.nelson.com.br.vmperuse.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nelson.nelson.com.br.vmperuse.dao.SoftwareDAO;
import nelson.nelson.com.br.vmperuse.model.Software;



@RestController
@CrossOrigin("*")
public class SoftwareController {
	
	@Autowired
	SoftwareDAO swDao;
	
	@GetMapping("/softwares")
	public ResponseEntity<ArrayList<Software>> recuperarTodos(){
		ArrayList<Software> lista = (ArrayList<Software>)swDao.findAll();
		return ResponseEntity.ok(lista);
	}

}