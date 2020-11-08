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
public class Grille {
    Cellule[][] Cellules = new Cellule[6][7];
    
Grille () {
    for (int i = 0; i< 6 ; i++ ){
        for ( int j = 0 ; j < 7 ; j ++){
            Cellules [i][j] = new Cellule() ;
        }
    }
}    
    
    public boolean ajouterJetonDansColonne(Jeton abc , int ijk){
        if ( Cellules[0][ijk].jetonCourant != null){
            return false ;
        }
        else {
            if ( Cellules[5][ijk-1].jetonCourant == null){
                Cellules[5][ijk-1].jetonCourant = abc  ;
                return true ;
            }
            else {
                if ( Cellules[4][ijk-1].jetonCourant == null){
                    Cellules[4][ijk-1].jetonCourant = abc  ;
                    return true ;
                }
                else {
                    if ( Cellules[3][ijk-1].jetonCourant == null){
                        Cellules[3][ijk-1].jetonCourant = abc  ;
                        return true ;
                    }
                    else {
                        if ( Cellules[2][ijk-1].jetonCourant == null){
                            Cellules[2][ijk-1].jetonCourant = abc  ;
                            return true ;
                        }
                        else {
                            if ( Cellules[1][ijk-1].jetonCourant == null){
                            Cellules[1][ijk-1].jetonCourant = abc  ;
                            return true ;
                            }
                            else {
                                Cellules[0][ijk-1].jetonCourant = abc  ;
                                return true ;
                                    
                                   
                            }
                        }
                    }                     
                }       
            }
        }
    }
    public boolean etreRemplie() {
        int f = 0 ;
        for ( int i = 0 ; i <= 5 ; i++ ){
            for ( int j = 0 ; j <= 6 ; j++ ){
                if ( Cellules[i][j].jetonCourant == null ) {
                    return false ; 
                }       
            }
        }
        return true ;
    }
    public void viderGrille() {
        for ( int i = 0 ; i <= 5 ; i++ ){
            for ( int j = 0 ; j <= 6 ; j++ ){ 
                Cellules[i][j].jetonCourant = null ;
                Cellules[i][j].desintegrateur = false;
                Cellules[i][j].trouNoir = false; 
            }    
        }
    }
    public void afficherGrilleSurConsole() {
    for ( int i = 0 ; i <= 5 ; i++ ){
        for ( int j = 0 ; j <= 6 ; j++ ){
            if (Cellules[i][j].presenceTrouNoir() == true ){
                System.out.print("#") ;  
            } 
            else if (Cellules[i][j].presenceDesintegrateur() == true ){
                System.out.print("D") ;
            }
            else if (Cellules[i][j].jetonCourant == null ){
                 System.out.print("N");
            }
            else if (Cellules[i][j].jetonCourant !=  null ){
                if (Cellules[i][j].jetonCourant.Couleur == "rouge"){
                    System.out.print("R");
                }
                if (Cellules[i][j].jetonCourant.Couleur== "jaune"){
                    System.out.print("J");
                }
            }     
        }
        System.out.println( " " +( i + 1));

        }
    }
   
    public boolean celluleOccupee ( int x, int y) {
    if (Cellules[x][y] == null){
        return false ;    
    }
    else {
        return true ;
    }
    }
    public String lireCouleurDuJeton ( int x, int y) {
        if (Cellules[x][y].jetonCourant == null ){
            return " cellule vide " ;
        } 
        else {
            return Cellules[x][y].jetonCourant.Couleur ;
        }
    }
    
    public boolean etreGagnantePourJoueur ( Joueur az ) {
        boolean a = false ;
        for ( int i = 0 ; i <= 5 ; i++ ){
            for ( int j = 0 ; j <= 2 ; j++ ){    
                if (lireCouleurDuJeton (i, j) == (az.Couleur)&& lireCouleurDuJeton(i, j+1) == (az.Couleur) && lireCouleurDuJeton(i, j+2) == (az.Couleur) && lireCouleurDuJeton(i, j+3) ==(az.Couleur)){
                    a= true ;
                }        
            }    
        }
        for ( int i = 0 ; i <= 2 ; i++ ){
            for ( int j = 0 ; j <= 6 ; j++ ){ 
                if (lireCouleurDuJeton (i, j).equals(az.Couleur)&& lireCouleurDuJeton(i+1, j).equals(az.Couleur) && lireCouleurDuJeton(i+2, j).equals(az.Couleur) && lireCouleurDuJeton(i+3, j).equals(az.Couleur)){
                    a= true ;
                }    
            }
        }
         for ( int i = 0 ; i <= 3 ; i++ ){
            for ( int j = 0 ; j <= 2 ; j++ ){ 
                if (lireCouleurDuJeton (i, j).equals(az.Couleur)&& lireCouleurDuJeton(i+1, j+1).equals(az.Couleur) && lireCouleurDuJeton(i+2, j+2).equals(az.Couleur) && lireCouleurDuJeton(i+3, j+3).equals(az.Couleur)){
                    a= true ;
                }    
            }
        }
        for ( int i = 0 ; i <= 3 ; i++ ){
            for ( int j = 3 ; j <= 5 ; j++ ){ 
                if (lireCouleurDuJeton (i, j).equals(az.Couleur)&& lireCouleurDuJeton(i-1, j+1).equals(az.Couleur) && lireCouleurDuJeton(i-2, j+2).equals(az.Couleur) && lireCouleurDuJeton(i-3, j+3).equals(az.Couleur)){
                    a= true ;
                }    
            }
        }         
        return a;
    }
    public void tasserGrille ( int ui , int j) {
        for ( int i = 0 ; i < ui ; i++ ){  
            Cellules[i+1][j]= Cellules[i][j]; 
        }          
    }
    public boolean colonneRemplie ( ){
        boolean a = false ;
            for ( int j = 0 ; j <= 6 ; j++ ){ 
                if (celluleOccupee(0,j)==true){
                    a =true ;
            }        
        }
        return a ; 
    }
    public boolean placerTrouNoir ( int i , int j ){
        boolean a = false;
        if ( Cellules[i][j].trouNoir==false) {
            Cellules[i][j].trouNoir=true ;   
            a = true ;
        } 
        return a ;
    }
    public boolean placerDesintegrateur ( int i , int j ){
        boolean a = false;
        if ( Cellules[i][j].desintegrateur==false) {
            Cellules[i][j].desintegrateur=true ;   
            a = true ;
        } 
        return a ;
    }
    public boolean supprimerJeton ( int i , int j ){
        boolean a = false ;
        if ( Cellules[i][j].jetonCourant != null ){
            Cellules[i][j].jetonCourant = null ;
            a = true ;
        }
        return a ;
    }
    public Jeton recupererJeton ( int i , int j ){
        Jeton recupJ = null  ;
        if ( Cellules[i][j].jetonCourant != null ){
            recupJ = Cellules[i][j].jetonCourant ;
            Cellules[i][j].jetonCourant = null ;
        } 
        return recupJ ;
    }
    
    
}
