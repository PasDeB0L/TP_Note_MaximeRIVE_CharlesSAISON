/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_note;

import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author 33607
 */
public class Labyrinthe {
    private ArrayList<ArrayList<Cellule>> cellules = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> test ;
    private Explorateur explorateur;
    private int largeur;
    private int hauteur;
    private int colonneExplo;
    private int ligneexplo;
    private int ligneDepart;
    private int colonneDepart;
    private int ligneArrivee;
    private int colonneArrivee;
    
    public Labyrinthe(){
       
        
        
        
        
        
        
        largeur = 5 + (int)(Math.random() * ((10 - 5) + 1));
        hauteur = 5 + (int)(Math.random() * ((10 - 5) + 1));
        
        
        
        for (int i=0; i<largeur; i++){
            for (int j=0; j<hauteur; j++){
                test.get(i).get(j)=0;
            }
        }
        
        
        
        
        /*
        
               
        for (int i=0;i<hauteur; i++){
            cellules.get(0).add();
            
                
        }
        
        
        for (int i=0; i<largeur; i++){
            for (int j=0; j<hauteur;j++){
                
            }
        }
        
        boolean test=false;
        
        while (test==false){
            ligneDepart = 1 + (int)(Math.random() * ((10 - 1) + 1));
            colonneDepart= 1 + (int)(Math.random() * ((10 - 1) + 1));
            
            if ( cellules.get(ligneDepart).get(colonneDepart).estLibre() )
                test=true;
            
        }
       
        Explorateur explo= new Explorateur(cellules.get(ligneDepart).get(colonneDepart));
      cellules.get(ligneDepart).get(colonneDepart).prendreOccupant(explo);
*/
    }
    
}
