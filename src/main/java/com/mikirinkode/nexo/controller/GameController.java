package com.mikirinkode.nexo.controller;

import com.mikirinkode.nexo.form.GameForm;
import com.mikirinkode.nexo.model.GameModel;
import com.mikirinkode.nexo.service.GameSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/game")
public class GameController {

    private final GameSvc gameSvc;

    @Autowired
    private GameController(GameSvc gameSvc){
        this.gameSvc = gameSvc;
    }

    @PostMapping
    public GameModel create(@RequestBody GameForm form) {
        return gameSvc.create(form);
    }

}
