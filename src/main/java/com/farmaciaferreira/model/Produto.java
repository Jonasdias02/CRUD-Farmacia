package com.farmaciaferreira.model;

import java.math.BigDecimal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
	 public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo nome é Obrigatório!")
		@Size(min = 3, max = 100, message = "O atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
		private String nome;
		
		@NotBlank(message = "O atributo descricao é Obrigatório!")
		@Size(min = 10, max = 1000, message = "O atributo descricao deve conter no mínimo 10 e no máximo 1000 caracteres")
		private String descricao;
		
		@NotNull(message = "O atributo quantidade é Obrigatório!")
		@Positive
		private Integer quantidade;
		
		@NotNull(message = "O atributo preço é Obrigatório!")
		private BigDecimal preco;
		
		@NotBlank(message = "O atributo imagem é Obrigatório!")
		private String imagem;

	//Foreign Key
		
		
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

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public BigDecimal getPreco() {
			return preco;
		}

		public void setPreco(BigDecimal preco) {
			this.preco = preco;
		}

		public String getImagem() {
			return imagem;
		}

		public void setImagem(String imagem) {
			this.imagem = imagem;
		}

	
		
		
}
