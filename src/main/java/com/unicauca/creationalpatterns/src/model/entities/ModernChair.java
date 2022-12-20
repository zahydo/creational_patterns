/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.creationalpatterns.src.model.entities;

import java.io.Serializable;
import org.apache.commons.lang3.SerializationUtils;

/**
 *
 * @author sahydo
 */
public class ModernChair implements Chair, Serializable {
    
    private String name;
    private ChairHead chairHead;

    public ModernChair(String name, ChairHead chairHead) {
        this.name = name;
        this.chairHead = chairHead;
    }

    public ModernChair() {
    }

    public void setChairHead(ChairHead chairHead) {
        this.chairHead = chairHead;
    }

    public ChairHead getChairHead() {
        return chairHead;
    }

    public ModernChair(String name) {
        this.name = name;
    }
    
    @Override
    public void sitOn() {
        System.out.println("sitOn from: " + this.getClass().getName());
    }

    @Override
    public boolean hasLegs() {
        System.out.println("hasLegs from: " + this.getClass().getName());
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ModernChair clone() throws CloneNotSupportedException {
        /*ModernChair chair = new ModernChair();
        try {
            ChairHead head = (ChairHead) this.getChairHead().clone();
            chair.setChairHead(head);
            chair = (ModernChair) super.clone();
            
        } catch (CloneNotSupportedException e) {
            chair = new ModernChair(this.name);
        }
        return chair;*/
        return SerializationUtils.clone(this);
        //return (ModernChair) super.clone();
    }
    
    
    
}
