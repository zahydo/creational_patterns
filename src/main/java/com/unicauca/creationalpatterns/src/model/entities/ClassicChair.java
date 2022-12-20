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
public class ClassicChair implements Chair {

    @Override
    public void sitOn() {
        System.out.println("sitOn from: " + this.getClass().getName());
    }

    @Override
    public boolean hasLegs() {
        System.out.println("hasLegs from: " + this.getClass().getName());
        return true;
    }
    
}
