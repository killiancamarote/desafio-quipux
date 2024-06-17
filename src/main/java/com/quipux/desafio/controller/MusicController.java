package com.quipux.desafio.controller;

import com.quipux.desafio.entity.MusicEntity;
import com.quipux.desafio.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/musica")
@Validated
public class MusicController {

    @Autowired
    private MusicRepository repository;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public ResponseEntity<List<MusicEntity>> findAll(){
        List<MusicEntity> musicEntities = repository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(musicEntities);
    }

    @RequestMapping(value = "/findByMusic", method = RequestMethod.GET)
    public ResponseEntity<MusicEntity> findByMusic(@RequestParam(value = "musica", required = true) String musica){
        MusicEntity entity = repository.findByTitulo(musica);
        return ResponseEntity.status(HttpStatus.OK).body(entity);
    }

}
