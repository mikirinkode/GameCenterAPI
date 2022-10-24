package com.mikirinkode.nexo.service;

import com.mikirinkode.nexo.form.GameForm;
import com.mikirinkode.nexo.model.GameModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameSvc {
    GameModel create(GameForm form);

    List<GameModel> getAll();

    ResponseEntity<Object> findById(Long id);

    ResponseEntity<Object> updateById(GameForm form, Long id);
}
