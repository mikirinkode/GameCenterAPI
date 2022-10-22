package com.mikirinkode.nexo.form;

import lombok.Data;

import javax.persistence.Column;

@Data
public class GameForm {

    private String gameName;
    private String gameDesc;
    private String requirement;
    private Double price;

}
