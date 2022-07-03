package repositorio;

import org.springframework.data.repository.Repository;

import modelo.ProdutosModelo;
import java.util.List;

public interface ProdutosRepositorio extends Repository<ProdutosModelo, Integer>{
	void save(ProdutosModelo Produto);
	List <ProdutosModelo> findAll ();
	ProdutosModelo findByID(Integer id);
	void delete(ProdutosModelo Produto);
	
}