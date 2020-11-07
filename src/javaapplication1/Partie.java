/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner ;
import java.util.Random ; 
/**
 *
 * @author bsoulie
 */
public class Partie {
    Joueur [] ListeJoueurs = new Joueur[2] ;
    Joueur joueurCourant ;
    Grille gdj = new Grille() ;
    

    
    public void attribuerCouleursAuxJoueurs() {
        ListeJoueurs[0].affecterCouleur("jaune");
        ListeJoueurs[1].affecterCouleur("rouge");
    }
    
    public void initialiserPartie() {        
        gdj.viderGrille() ;
        double nbaleatoire = Math.random() ;
        if (nbaleatoire > 0.5 ){
            joueurCourant = ListeJoueurs[0] ;
        }
        else {
            joueurCourant = ListeJoueurs[1] ;
        }
                
        int nbt = 0 ; 
        int nbd = 0 ;
        while (nbt < 6 ) {
            int i = (int) Math.random() * ( 6 - 1 ) ;
            int j = ( int ) Math.random() * ( 7 - 1 ) ;
            gdj.placerTrouNoir (i , j ) ; 
            nbt ++ ;
        }
        while (nbd < 6 ) {
            int i = (int) Math.random() * ( 6 - 1 ) ;
            int j = ( int ) Math.random() * ( 7 - 1 ) ;
            gdj.placerDesintegrateur (i , j ) ;
            nbd ++ ;
        }
        for (int i = 0;  i <= 20 ; i++ ){
            ListeJoueurs[0].ajouterJeton(new Jeton(ListeJoueurs[0].Couleur));
            ListeJoueurs[1].ajouterJeton(new Jeton(ListeJoueurs[1].Couleur));  
        }
    }
    
    public void debuterPartie() {
        
        int select ;
        int coll ; 
        int ligne ;
        Joueur J1 = new Joueur("Joueur1");
        Joueur J2 = new Joueur("Joueur2");
        ListeJoueurs[0]=J1;
        ListeJoueurs[1]=J2;
        initialiserPartie() ;
        Scanner sc = new Scanner ( System.in) ;
        while ( gdj.etreGagnantePourJoueur(ListeJoueurs[0]) != true || gdj.etreGagnantePourJoueur(ListeJoueurs[1])!= true|| gdj.etreRemplie() != true ) {
        gdj.afficherGrilleSurConsole();
        System.out.println("Que Voulez vous faire ? \n1 : jouer un jeton \n2 : utiliser un désintegrateur\n3 : Recuperer un jeton  " );
            select = sc.nextInt() ;
            while ( select >= 4 || select < 1 ){
                
                System.out.println("choix pas valide");
                select = sc.nextInt() ;
            }
            if (select == 1 ) {
                System.out.println("dans quelle colonne voulez vous ajouter");
                Scanner scc = new Scanner ( System.in) ;
                coll = scc.nextInt() ;               
                gdj.ajouterJetonDansColonne(joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestant-1],coll);
                joueurCourant.nombreJetonsRestant-=1 ;
            }
            if (select == 2 && joueurCourant.nombreDesintegrateurs != 0 ) {
                System.out.println("dans quelle colonne voulez vous désintégrer ?");
                Scanner scc = new Scanner ( System.in) ;
                coll = scc.nextInt() ; 
                System.out.println("dans quelle colonne voulez vous désintégrer ?");
                Scanner sccc = new Scanner ( System.in) ;
                ligne = sccc.nextInt() ;
                if ( gdj.Cellules[ligne][coll] != null ){
                    gdj.supprimerJeton(ligne,coll) ;
                    gdj.tasserGrille(ligne,coll) ;
                    joueurCourant.utiliserDesintegrateur();
                    joueurCourant.nombreDesintegrateurs = joueurCourant.nombreDesintegrateurs=-1 ;
                }
                else {
                System.out.println("Bravo petit malin vous venez de supprimer ... Quelque chose .... AHAHAHAHA, non.\n En réalité la case etait déja vide cette étourderie vous coutera quand meme un désintégrateur ^^ ");   
                joueurCourant.nombreDesintegrateurs = joueurCourant.nombreDesintegrateurs=-1 ; 
                }               
            }
            if (select == 2 && joueurCourant.nombreDesintegrateurs == 0 ) {
                System.out.println("Tu n'as plus de désintégrateur !!!!! OUUUUUUUUUU, tiens pour la peine tu ne joue pas a ce tour ");
            }
            if (select == 3 ) {
                System.out.println("dans quelle colonne voulez vous récuperer ?");
                Scanner scc = new Scanner ( System.in) ;
                coll = scc.nextInt() ; 
                System.out.println("dans quelle ligne voulez vous récuperer ?");
                Scanner sccc = new Scanner ( System.in) ;
                ligne = sccc.nextInt() ;
                if ( gdj.Cellules[ligne][coll] != null ){
                    gdj.recupererJeton(ligne,coll) ;
                    gdj.tasserGrille(ligne,coll) ;}
                else {
                System.out.println("Bravo petit malin vous voulez récuperer ... Quelque chose ....QUI N'EXISTE PAS ? AHAHAHAHA, non.\n Vous passez votre tout pour la peine ");   
                }
            }
            if ( joueurCourant == ListeJoueurs[1] ){
                joueurCourant = ListeJoueurs[0] ;
            }
            if ( joueurCourant == ListeJoueurs[0] ){
                joueurCourant = ListeJoueurs[1] ;
            }
        }    
    }
            
}    