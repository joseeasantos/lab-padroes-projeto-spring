package one.digitalinnovation.gof.service.interf;

import one.digitalinnovation.exception.InformationNotFoundException;
import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author falvojr
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id) throws InformationNotFoundException;

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente) throws InformationNotFoundException;

	void deletar(Long id);

}
