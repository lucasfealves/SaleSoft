package br.salesoft.business;

import br.salesoft.dao.FactoryDao;
import br.salesoft.dao.InterfaceDao;
import br.salesoft.entity.Cliente;

public class ClienteBusiness {
	
	public void salvar(Cliente c) throws BusinessException {
				
		InterfaceDao<Cliente> clienteDao = FactoryDao.createClienteDao();
		clienteDao.salvar(c);
	
	}

}
