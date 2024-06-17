package com.quipux.desafio.entity;

import com.google.gson.Gson;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_MUSICA")
public class MusicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "artista")
    private String artista;
    @Column(name = "album")
    private String album;
    @Column(name = "ano")
    private String ano;
    @Column(name = "genero")
    private String genero;
}
