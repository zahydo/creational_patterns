/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.creationalpatterns.src.model.entities;

/**
 *
 * @author sahydo
 */
public class ClassicSofa implements Sofa {

    @Override
    public void sitOn() {
        System.out.println("sitOn from: " + this.getClass().getName());
    }

    @Override
    public String getSize() {
        System.out.println("getSize from: " + this.getClass().getName());
        return "Small";
    }
    
}
