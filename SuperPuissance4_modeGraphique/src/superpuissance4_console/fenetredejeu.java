package superpuissance4_console;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vsalles
 */
public class fenetredejeu extends javax.swing.JFrame {

    /**
     * Creates new form fenetredejeu
     */
    public fenetredejeu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panneauGrille = new javax.swing.JPanel();
        panneauinfopartie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LblJ2Desint1 = new javax.swing.JLabel();
        Lbljcourant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        panneaucreationpartie = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomJoueur1 = new javax.swing.JTextField();
        nomJoueur2 = new javax.swing.JTextField();
        btnStart = new javax.swing.JButton();
        panneauinfojoueur = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LblJ1Couleur = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LblJ1Nom = new javax.swing.JLabel();
        LblJ1Desint = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        LblJ2Couleur = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LblJ2Nom = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        LblJ2Desint2 = new javax.swing.JLabel();
        btn0 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("nombre désintégrateur:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("nombre désintégrateur:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panneauGrille.setBackground(new java.awt.Color(153, 153, 153));
        panneauGrille.setLayout(new java.awt.GridLayout(6, 7));
        getContentPane().add(panneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 672, 576));
        panneauGrille.getAccessibleContext().setAccessibleName("1");

        panneauinfopartie.setBackground(new java.awt.Color(51, 255, 0));
        panneauinfopartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("infos jeu");
        panneauinfopartie.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("joueur courant :");
        panneauinfopartie.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 30));

        LblJ2Desint1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ2Desint1.setText("nb desint");
        panneauinfopartie.add(LblJ2Desint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 30));

        Lbljcourant.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Lbljcourant.setText("nom joueur");
        panneauinfopartie.add(Lbljcourant, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, 30));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane1.setViewportView(message);

        panneauinfopartie.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 50));

        getContentPane().add(panneauinfopartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 210, 130));

        panneaucreationpartie.setBackground(new java.awt.Color(51, 255, 0));
        panneaucreationpartie.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("nom joueur 2 :");
        panneaucreationpartie.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 10));

        jLabel2.setText("nom joueur 1 :");
        panneaucreationpartie.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 10));

        nomJoueur1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomJoueur1ActionPerformed(evt);
            }
        });
        panneaucreationpartie.add(nomJoueur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 60, -1));

        nomJoueur2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomJoueur2ActionPerformed(evt);
            }
        });
        panneaucreationpartie.add(nomJoueur2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 60, -1));

        btnStart.setLabel("demarrer partie");
        panneaucreationpartie.add(btnStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        getContentPane().add(panneaucreationpartie, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, 200, 150));

        panneauinfojoueur.setBackground(new java.awt.Color(51, 255, 0));
        panneauinfojoueur.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("couleur:");
        panneauinfojoueur.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        LblJ1Couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ1Couleur.setText("couleur joueur 1");
        panneauinfojoueur.add(LblJ1Couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("joueur 1");
        panneauinfojoueur.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        LblJ1Nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ1Nom.setText("nom joueur 1");
        panneauinfojoueur.add(LblJ1Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        LblJ1Desint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ1Desint.setText("nb desint");
        panneauinfojoueur.add(LblJ1Desint, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("nombre désintégrateur:");
        panneauinfojoueur.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 30));
        panneauinfojoueur.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 138, 190, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("couleur:");
        panneauinfojoueur.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));

        LblJ2Couleur.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ2Couleur.setText("couleur joueur 2");
        panneauinfojoueur.add(LblJ2Couleur, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("joueur 2");
        panneauinfojoueur.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        LblJ2Nom.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ2Nom.setText("nom joueur 2");
        panneauinfojoueur.add(LblJ2Nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("infos joueurs");
        panneauinfojoueur.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("nombre désintégrateur:");
        panneauinfojoueur.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 30));

        LblJ2Desint2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LblJ2Desint2.setText("nb desint");
        panneauinfojoueur.add(LblJ2Desint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, 30));

        getContentPane().add(panneauinfojoueur, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 210, 250));

        btn0.setText("2");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        btn1.setText("3");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        btn2.setText("4");
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        btn3.setText("5");
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, -1, -1));

        btn4.setText("6");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        btn5.setText("7");
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        btn6.setText("1");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));
        btn6.getAccessibleContext().setAccessibleName("1");

        setBounds(0, 0, 1135, 745);
    }// </editor-fold>//GEN-END:initComponents

    private void nomJoueur2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomJoueur2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomJoueur2ActionPerformed

    private void nomJoueur1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomJoueur1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomJoueur1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetredejeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetredejeu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblJ1Couleur;
    private javax.swing.JLabel LblJ1Desint;
    private javax.swing.JLabel LblJ1Nom;
    private javax.swing.JLabel LblJ2Couleur;
    private javax.swing.JLabel LblJ2Desint1;
    private javax.swing.JLabel LblJ2Desint2;
    private javax.swing.JLabel LblJ2Nom;
    private javax.swing.JLabel Lbljcourant;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField nomJoueur1;
    private javax.swing.JTextField nomJoueur2;
    private javax.swing.JPanel panneauGrille;
    private javax.swing.JPanel panneaucreationpartie;
    private javax.swing.JPanel panneauinfojoueur;
    private javax.swing.JPanel panneauinfopartie;
    // End of variables declaration//GEN-END:variables
}
