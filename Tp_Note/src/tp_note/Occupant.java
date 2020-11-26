/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_note;

/**
 *
 * @author Moplo
 */

public abstract class Occupant {
    protected Cellule celluleOccupee;


    public Occupant( Cellule cellule){
        celluleOccupee= cellule;
        celluleOccupee.prendreOccupant(this);
    }



    public Cellule getCellule()
    {
        return celluleOccupee;
    }

    public void setCellule(Cellule cellule){
        celluleOccupee=cellule;
    }


    @Override
    public abstract String toString();

}