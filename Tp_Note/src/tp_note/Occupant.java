/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_note;

import java.util.ArrayList;


public abstract class Occupant {
    protected Cellule celluleOccupee;
    
    public Occupant( Cellule cellule){
        
    }
    
    public Occupant prendreOccupant(Cellule cellule){
        return cellule.prendreOccupant();
    }
    
    public Cellule getCellule()
    {
        return celluleOccupee;
    }
    
    public setCellule(Cellule cellule){
        celluleOccupee=cellule;
    }
    
    public String toString(){
        return celluleOccupee.toString();
    }
}
