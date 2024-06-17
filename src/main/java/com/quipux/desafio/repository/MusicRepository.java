package com.quipux.desafio.repository;

import com.quipux.desafio.entity.MusicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicRepository extends JpaRepository<MusicEntity, Long> {
    MusicEntity findByTitulo(String musica);
}
