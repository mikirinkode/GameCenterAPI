package com.mikirinkode.nexo.repository;

import com.mikirinkode.nexo.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Long> {
}
