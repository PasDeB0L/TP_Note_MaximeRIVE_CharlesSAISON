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
public class Explorateur extends Mobile{

    public Explorateur(Cellule cellule) {
        super(cellule);
    }

    @Override
    public String toString(){
        return "O";
    } 
}