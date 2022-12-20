package com.unicauca.creationalpatterns.src.main;


import com.unicauca.creationalpatterns.src.model.entities.Chair;
import com.unicauca.creationalpatterns.src.model.entities.CoffeeTable;
import com.unicauca.creationalpatterns.src.model.entities.Sofa;
import com.unicauca.creationalpatterns.src.model.factories.AbstractFurnitureFactory;
import com.unicauca.creationalpatterns.src.model.factories.FactoryType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahydo
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFurnitureFactory factory = AbstractFurnitureFactory.getFurnitureFactory(FactoryType.MODERN);
        Chair chair1 = factory.getChair();
        Chair chair2 = factory.getChair();
        Chair chair3 = factory.getChair();
        Sofa sofa1 = factory.getSofa();
    }
    
}
