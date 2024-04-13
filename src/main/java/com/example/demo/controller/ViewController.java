package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.example.demo.models.entity.Clientes;
import java.util.List;
import com.example.demo.models.service.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/views/clientes")
public class ViewController {
	@Autowired
	IClientesService ClienteService;
	
	List<Clientes> clientesLista = ClienteService.listarTodos();
	
@GetMapping("/")
	public String tableController(Model model)
	{
		model.addAttribute("titulo", "Lista de clientes");
		model.addAttribute("lista", clientesLista);
		return "/views/clientes/lista";
	}
	
}
