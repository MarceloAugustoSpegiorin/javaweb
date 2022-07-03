package repositorio;

import org.springframework.data.repository.Repository;

import modelo.UsuariosModelo;
import java.util.List;

public interface UsuariosRepositorio extends Repository<UsuariosModelo, Integer>{
	void save(UsuariosModelo Usuario);
	List <UsuariosModelo> findAll ();
	UsuariosModelo findByID(Integer id);
	void delete(UsuariosModelo Usuario);
	
}
