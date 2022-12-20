/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.creationalpatterns.src.model.factories;

import com.unicauca.creationalpatterns.src.model.entities.Chair;
import com.unicauca.creationalpatterns.src.model.entities.ChairHead;
import com.unicauca.creationalpatterns.src.model.entities.CoffeeTable;
import com.unicauca.creationalpatterns.src.model.entities.ModernChair;
import com.unicauca.creationalpatterns.src.model.entities.ModernSofa;
import com.unicauca.creationalpatterns.src.model.entities.Sofa;
import org.apache.commons.lang3.SerializationUtils;

/**
 *
 * @author sahydo
 */
public class ModernFurnitureFactory extends AbstractFurnitureFactory {

    private ModernChair chairToClone;

    public void setChairToClone(ModernChair chairToClone) {
        this.chairToClone = chairToClone;
    }

    public Chair getChairToClone() {
        return chairToClone;
    }
    
    @Override
    public Chair getChair() {
        System.out.println("Getting a Chair from: " + this.getClass().getName());
        ModernChair chair;
        try {
            if (this.chairToClone == null) {
                ChairHead head = new ChairHead("head type");
                chair = new ModernChair("Name", head);
                this.setChairToClone(chair);
            } else {
                chair = (ModernChair) this.chairToClone.clone();
            }
        } catch (CloneNotSupportedException ex) {
            return null;
        }
        System.out.println(chair);
        System.out.println(chair.getChairHead());
        return chair;
        //return new ModernChair("New name");
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sofa getSofa() {
        System.out.println("Getting a Sofa from: " + this.getClass().getName());
        return new ModernSofa();
    }
    
}
