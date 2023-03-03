package com.senacniteroi.delivery3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_pedidos")
public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "É obrigatório inserir o nome do cliente")
	@Size(min = 2, max = 50, message = "Deve conter no mínimo 02 e no máximo 50 caracteres")
	private String nome;
	
	@NotBlank(message = "É obrigatório inserir o endereço do cliente")
	@Size(min = 5, max = 100, message = "Deve conter no mínimo 05 e no máximo 100 caracteres")
	private String endereço;
	
	@NotBlank(message = "É obrigatório inserir o telefone do cliente")
	@Size(min = 9, max = 20, message = "Deve conter no mínimo 09 e no máximo 20 caracteres")
	private String telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}


	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}






