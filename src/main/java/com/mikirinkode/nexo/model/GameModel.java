package com.mikirinkode.nexo.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "game")
@NoArgsConstructor
public class GameModel extends BaseDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "game_name", nullable = false)
    private String gameName;

    @Column(name = "game_desc", nullable = false)
    private String gameDesc;

    @Column(name = "requirement", nullable = false)
    private String requirement;

    @Column(name = "price", nullable = false)
    private Double price;
}
