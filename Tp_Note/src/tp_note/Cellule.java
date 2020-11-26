/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_note;

import java.util.ArrayList;

/**
 *
 * @author Moplo
 */
public class Cellule {
    private Occupant occupantCellule;
    private Cellule nord;
    private Cellule sud;
    private Cellule ouest;
    private Cellule est;
    private boolean visit;
    
    public Cellule (){
        occupantCellule=null;
        nord=null;
        sud=null;
        est=null;
        visit=false;
    }
    
    public boolean estLibre(){
        if(occupantCellule.toString().equals("-")){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void prendreOccupant(Occupant occupant){
        occupantCellule=occupant;
        if(occupant!=null) {
            occupant.setCellule(this);
        }
    }
    
    public String toString() {
        String aspect;
        if(estLibre()) {
            aspect="-";
        }
        else {
            aspect=occupantCellule.toString();
        }

        return aspect;
    }
    
    
    public void setOccupant(Occupant occupant) {
        occupantCellule=occupant;
    }
    
    public void setVoisins(Cellule nord, Cellule sud, Cellule est, Cellule ouest){
        this.nord=nord;
        this.sud=sud;
        this.est=est;
        this.ouest=ouest;
    }
}
