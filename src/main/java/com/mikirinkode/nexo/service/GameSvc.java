package com.mikirinkode.nexo.service;

import com.mikirinkode.nexo.form.GameForm;
import com.mikirinkode.nexo.model.GameModel;

import java.util.List;

public interface GameSvc {
    GameModel create(GameForm form);

    List<GameModel> getAll();

    GameModel findById(Long id);
}
