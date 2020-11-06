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
public class Joueur {
    String Nom ;  
    String Couleur; 
    Jeton [] ListeJetons = new Jeton[21]  ;
    int nombreDesintegrateurs;
    int nombreJetonsRestant ;
    
    public Joueur ( String a  ){
       Nom = a ; 
    }   

    public void affecterCouleur( String color ){
        Couleur = color ;
    }
    public boolean ajouterJeton (Jeton Jeton_a_mettre){
        ListeJetons[nombreJetonsRestant] = Jeton_a_mettre ;
        if (nombreJetonsRestant <= 21 ){
            return true ;
        }
        else {
            return false ; 
        }
    }
    public void obtenirDesintegrateur() {
        nombreDesintegrateurs++;        
    }
    public boolean utiliserDesintegrateur() {
        if (nombreDesintegrateurs > 0){
            nombreDesintegrateurs = nombreDesintegrateurs -1 ;
            return true ;
        }
        else {
            return false ;
        }  
    }   
}

