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
        Grille gdj = new Grille() ;
        int nbt = 0 ; 
        int nbd = 0 ;
        while (nbt < 6 ) {
            int i = (int) Math.random() * ( 6 - 1 ) ;
            int j = ( int ) Math.random() * ( 7 - 1 ) ;
            gdj.placerTrouNoir (i , j ) ; 
        }
        while (nbd < 6 ) {
            int i = (int) Math.random() * ( 6 - 1 ) ;
            int j = ( int ) Math.random() * ( 7 - 1 ) ;
            gdj.placerDesintegrateur (i , j ) ; 
        }
    }
    
    public void debuterPartie() {
        
    }
            
}    