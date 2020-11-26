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
public class Labyrinthe {
    private ArrayList<ArrayList<Cellule>> cellules = new ArrayList<>();
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

        

    for(int i = 0; i < hauteur; i++)  {
        cellules.add(new ArrayList<Cellule>());
    }


        for (int i=0;i<largeur; i++){
            //Ligne du haut mur
            
            cellules.get(0).add(new Cellule());
            cellules.get(0).get(i).setOccupant(new Mur(cellules.get(0).get(i)));
            System.out.println("test 1");
            //Ligne du bas mur
            cellules.get(hauteur-1).add(new Cellule());
            cellules.get(hauteur-1).get(i).setOccupant(new Mur(cellules.get(hauteur-1).get(i)));
            System.out.println("test 2");
        }
        System.out.println("test 3");
        for (int i=1;i<hauteur-1; i++){
            cellules.get(1).add(new Cellule());
            cellules.get(1).get(i).setOccupant(new Mur(cellules.get(0).get(i)));
            System.out.println("test 4");
            cellules.get(largeur-1).add(new Cellule());
            cellules.get(largeur-1).get(i).setOccupant(new Mur(cellules.get(largeur-1).get(i)));
            System.out.println("test 5");
        }
        
        
   

        for (int i=1; i<largeur-1; i++){
            for (int j=1; j<hauteur-1;j++){
                if(cellules.get(i).get(j)!=null)    {
                System.out.print(cellules.get(i).get(j).toString());
                   
                
                }
                else {
                         System.out.println(" ");
                }
                
            } System.out.println("");
        }
        
        
        
        
        
    }
    
    

}