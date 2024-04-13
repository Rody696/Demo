package com.example.demo.models.service;

import com.example.demo.models.entity.Clientes;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.models.repository.ClientesRepository;

@Service
public class ClientesServiceImplements implements IClientesService {
	@Autowired
	private ClientesRepository clientesRepository;
	
	@Override
	public List<Clientes> listarTodos() {
		return (List<Clientes>) clientesRepository.findAll();
	}

	@Override
	public void guardar(Clientes clientes) {
		clientesRepository.save(clientes);

	}

	@Override
	public Clientes buscarPorId(Long id) {
		return clientesRepository.findById(id).orElse(null);
	}

	@Override
	public void borrar(Long id) {
		clientesRepository.deleteById(id);
	}

}
