package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "id_usuario")
@Entity
public class UsuariosModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario  ")
	private Integer id_usuario  ;
	
	@Column(name = "nome_usuario  ")
	private Integer nome_usuario  ;
	
	@Column(name = "senha ")
	private Integer senha ;
	
	@Column(name = "nivel_acesso ")
	private Integer nivel_acesso ;

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Integer getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(Integer nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public Integer getNivel_acesso() {
		return nivel_acesso;
	}

	public void setNivel_acesso(Integer nivel_acesso) {
		this.nivel_acesso = nivel_acesso;
	}
	
	
}
