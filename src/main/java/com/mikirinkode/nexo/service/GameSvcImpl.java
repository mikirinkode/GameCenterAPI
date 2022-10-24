package com.mikirinkode.nexo.service;

import com.mikirinkode.nexo.common.ResponseUtil;
import com.mikirinkode.nexo.constant.MessageConstant;
import com.mikirinkode.nexo.form.GameForm;
import com.mikirinkode.nexo.model.GameModel;
import com.mikirinkode.nexo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public ResponseEntity<Object> findById(Long id) {
        try {
            Optional<GameModel> opt = gameRepo.findById(id);
            return opt.map(gameModel -> ResponseUtil.build(MessageConstant.SUCCESS, gameModel, HttpStatus.OK)).orElseGet(() -> ResponseUtil.build(MessageConstant.DATA_NOT_FOUND, null, HttpStatus.NOT_FOUND));
        } catch (Exception e){
            return ResponseUtil.build(e.getMessage(), null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
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
