/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.creationalpatterns.src.model.factories;

import com.unicauca.creationalpatterns.src.model.entities.Chair;
import com.unicauca.creationalpatterns.src.model.entities.ClassicChair;
import com.unicauca.creationalpatterns.src.model.entities.ClassicSofa;
import com.unicauca.creationalpatterns.src.model.entities.CoffeeTable;
import com.unicauca.creationalpatterns.src.model.entities.Sofa;

/**
 *
 * @author sahydo
 */
public class ClassicFurnitureFactory extends AbstractFurnitureFactory {

    @Override
    public Chair getChair() {
        System.out.println("Getting a Chair from: " + this.getClass().getName());
        return new ClassicChair();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sofa getSofa() {
        System.out.println("Getting a Sofa from: " + this.getClass().getName());
        return new ClassicSofa();
    }
    
}
