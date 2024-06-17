package com.quipux.desafio.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_LISTA")
public class ListaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "lista")
    private String lista;
}
