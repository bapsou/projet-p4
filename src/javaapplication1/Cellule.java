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
public class Cellule {
    Jeton jetonCourant ;
    boolean trouNoir ;
    boolean desintegrateur ;
    
    public Cellule(){
        jetonCourant = null ;
        trouNoir = false ;
        desintegrateur = false ; 
    }  
    public boolean affecterJeton (Jeton Jeton_en_cours) {
        if (jetonCourant == null ){
            jetonCourant = Jeton_en_cours ;
            return true ;
        }
        else {
            return false ;
        }
    }
    public Jeton recupererJeton ( ){
        return jetonCourant ;
    }
    public boolean supprimerJeton(){
        if (jetonCourant != null ) {
            jetonCourant = null ;
            return true ;
        }
        else {
            return false ;
        }                 
    }
    public boolean placerTrouNoir() {
        if (trouNoir == false ){
            trouNoir = true ;
            return true ;
        }
        else {
            return false ;
        }
    }
    public boolean placerDesintegrateur() {
        if (desintegrateur == false ){
            desintegrateur = true ;
            return true ;
        }
        else {
            return false ;
        }
    }
    public boolean presenceTrouNoir() {
        return trouNoir ;
    }
    public boolean presenceDesintegrateur() {
        return desintegrateur ;
    } 
    public String lireCouleurDuJeton() {
        return jetonCourant.Couleur ;
    }
    public boolean recupererDesintegrateur(){
        if (desintegrateur != false ) {
            desintegrateur = false ;
            return true ;
        }
        else {
            return false ;
        }                 
    }
    public boolean activerTrouNoir(){
        if (trouNoir == true ) {
            jetonCourant = null ;
            trouNoir = false ;
            return true ;
        }
        else {
            return false ;
        }                 
    }
    
}
