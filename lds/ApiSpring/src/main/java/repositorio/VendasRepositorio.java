package repositorio;

import org.springframework.data.repository.Repository;

import modelo.VendasModelo;
import java.util.List;

public interface VendasRepositorio extends Repository<VendasModelo, Integer>{
	void save(VendasModelo Vendas);
	List <VendasModelo> findAll ();
	VendasModelo findByID(Integer id);
	void delete(VendasModelo Vendas);
}