package br.salesoft.dao;

import br.salesoft.entity.Cliente;

public class FactoryDao {
	
	public static InterfaceDao<Cliente> createClienteDao() {
		return new ClienteDao();
	}

	public static InterfaceDao<Cliente> createProdutosDao() {
		return new ClienteDao();
	}
}
