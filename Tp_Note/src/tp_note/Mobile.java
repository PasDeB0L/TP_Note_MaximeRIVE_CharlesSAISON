/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_note;

/**
 *
 * @author 33607
 */
public abstract class Mobile extends Occupant{
    
    public Mobile(Cellule cellule) {
        super(cellule);
    }
    
    public void deplacerCellule(Cellule cellule){
        setCellule(cellule);
        
    }
    
    public void deplacerVers(Cellule cellule){
        
        if ( cellule.estLibre())
            deplaccerVers(cellule);
        else System.out.println("coup impossible");// crrer l'exception
    }
}
