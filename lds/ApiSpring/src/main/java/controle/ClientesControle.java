package controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import repositorio.ClientesRepositorio;
import modelo.ClientesModelo;

@CrossOrigin(origins="http:localhost:4200")
@RestController
@RequestMapping("/api")

public class ClientesControle {
	
@Autowired
ClientesRepositorio clientesrep;

@RequestMapping(value = "/clientes", method = RequestMethod.GET)
public @ResponseBody java.util.List<ClientesModelo> consultar (){
	return  this.clientesrep.findAll();
}


	
}
