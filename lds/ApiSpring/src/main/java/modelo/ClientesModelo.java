package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "clientes")
@Entity
public class ClientesModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Integer id_cliente;

	@Column(name = "nome_cliente")
	private Integer nome_cliente;

	@Column(name = "CPF")
	private Integer CPF;

	@Column(name = "telefone")
	private Integer telefone;
	
	@Column(name = "email")
	private Integer email;

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Integer getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(Integer nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public Integer getCPF() {
		return CPF;
	}

	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getEmail() {
		return email;
	}

	public void setEmail(Integer email) {
		this.email = email;
	}

}
