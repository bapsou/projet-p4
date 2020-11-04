/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author bsoulie
 */
public class Partie {
    Joueur [] ListeJoueurs = new Joueur[1] ;
    Joueur joueurCourant ;
    
    public Partie ( Joueur joueura , Joueur joueurb  ){
        ListeJoueurs[0] = joueura ;
        ListeJoueurs[1] = joueurb ;
    }
    public void attribuerCouleursAuxJoueurs() {
        ListeJoueurs[0].affecterCouleur("jaune");
        ListeJoueurs[1].affecterCouleur("rouge");
    }
    public void initialiserPartie() {
        
    }
    
    public void debuterPartie() {
        
    }
            
}    