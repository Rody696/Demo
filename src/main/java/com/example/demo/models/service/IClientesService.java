package com.example.demo.models.service;

import com.example.demo.models.entity.Clientes;
import java.util.List;

public interface IClientesService {
	public List<Clientes> listarTodos();
	public void guardar (Clientes clientes);
	public Clientes buscarPorId (Long id);
	public void borrar (Long id);
	
	
}
