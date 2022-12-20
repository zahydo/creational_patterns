/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.creationalpatterns.src.model.factories;

import com.unicauca.creationalpatterns.src.model.entities.Chair;
import com.unicauca.creationalpatterns.src.model.entities.CoffeeTable;
import com.unicauca.creationalpatterns.src.model.entities.Sofa;

/**
 *
 * @author sahydo
 */
public abstract class AbstractFurnitureFactory {

    public static AbstractFurnitureFactory getFurnitureFactory(FactoryType factoryType) {
        switch (factoryType) {
            case MODERN -> {
                return new ModernFurnitureFactory();
            }
            case CLASSIC -> {
                return new ClassicFurnitureFactory();
            }
            default -> {
                return new ModernFurnitureFactory();
            }
        }
    }

    public abstract Chair getChair();

    public abstract CoffeeTable getCoffeeTable();

    public abstract Sofa getSofa();
}
