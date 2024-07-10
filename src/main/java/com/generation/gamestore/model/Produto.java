package com.generation.gamestore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name = "tb_produtos")
public class Produto {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "O atributo nome é obrigatório!")
    @Size(max = 100, message = "O atributo nome deve conter no máximo 100 caracteres.")
    private String nome;

    @NotBlank(message = "O atributo descrição é obrigatório!")
    @Size (max = 1000, message = "O atrirbuto descrição deve conter no mínimo 1000 caracteres.")
    private String descricao;

    @NotNull
    private Float preco;

    @UpdateTimestamp
    private LocalDateTime data;

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

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
