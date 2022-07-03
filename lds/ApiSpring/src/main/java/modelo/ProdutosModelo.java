package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "id_produtos")
@Entity
public class ProdutosModelo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produtos ")
	private Integer id_produtos ;
	
	@Column(name = "descricao_produto")
	private Integer descricao_produto ;
	
	@Column(name = "quantidade_produto")
	private Integer quantidade_produto ;
	
	@Column(name = "valor")
	private Integer valor ;

	public Integer getId_produtos() {
		return id_produtos;
	}

	public void setId_produtos(Integer id_produtos) {
		this.id_produtos = id_produtos;
	}

	public Integer getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(Integer descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public Integer getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(Integer quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	

	
	
	
}
