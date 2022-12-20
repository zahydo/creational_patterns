/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.creationalpatterns.src.model.entities;

import java.io.Serializable;

/**
 *
 * @author sahydo
 */
public class ChairHead implements Serializable {
    private String type;

    public ChairHead() {
    }

    public ChairHead(String type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
