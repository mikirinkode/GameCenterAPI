package com.mikirinkode.nexo.service;

import com.mikirinkode.nexo.form.GameForm;
import com.mikirinkode.nexo.model.GameModel;
import com.mikirinkode.nexo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameSvcImpl implements GameSvc{

    private final GameRepository gameRepo;

    @Autowired
    public GameSvcImpl(GameRepository gameRepo) {
        this.gameRepo = gameRepo;
    }

    @Override
    public GameModel create(GameForm form) {
        return gameRepo.save(game(form));
    }

    @Override
    public List<GameModel> getAll(){
        return gameRepo.findAll();
    }

    private GameModel game(GameForm form) {
        GameModel game = new GameModel();
        game.setGameName(form.getGameName());
        game.setGameDesc(form.getGameDesc());
        game.setRequirement(form.getRequirement());
        game.setPrice(form.getPrice());
        return game;
    }
}
