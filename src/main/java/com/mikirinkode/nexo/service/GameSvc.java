package com.mikirinkode.nexo.service;

import com.mikirinkode.nexo.form.GameForm;
import com.mikirinkode.nexo.model.GameModel;

public interface GameSvc {
    GameModel create(GameForm form);

}
