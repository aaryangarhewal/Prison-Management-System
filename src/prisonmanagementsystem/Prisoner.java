/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonmanagementsystem;

/**
 *
 * @author 91758
 */
public class Prisoner extends javax.swing.JFrame {

    /**
     * Creates new form Prisoner
     */
    public Prisoner() {
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

        addprisoner = new javax.swing.JButton();
        removeprisoner = new javax.swing.JButton();
        updateprisoner = new javax.swing.JButton();
        searchprisoner = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addprisoner.setText("Add Prisoner");
        addprisoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addprisonerActionPerformed(evt);
            }
        });

        removeprisoner.setText("Remove Prisoner");
        removeprisoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeprisonerActionPerformed(evt);
            }
        });

        updateprisoner.setText("Update Prisoner Info");
        updateprisoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateprisonerActionPerformed(evt);
            }
        });

        searchprisoner.setText("Search Prisoner Info");
        searchprisoner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchprisonerActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchprisoner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateprisoner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addprisoner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeprisoner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(addprisoner)
                .addGap(41, 41, 41)
                .addComponent(updateprisoner)
                .addGap(44, 44, 44)
                .addComponent(searchprisoner)
                .addGap(35, 35, 35)
                .addComponent(removeprisoner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addprisonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addprisonerActionPerformed
        // TODO add your handling code here:
        new prisonentry().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_addprisonerActionPerformed

    private void removeprisonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeprisonerActionPerformed
        // TODO add your handling code here:
        new removeprisoner().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_removeprisonerActionPerformed

    private void updateprisonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateprisonerActionPerformed
        // TODO add your handling code here:
        new updateprisoner().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateprisonerActionPerformed

    private void searchprisonerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchprisonerActionPerformed
        // TODO add your handling code here:
        new searchprisoner().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_searchprisonerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FrontPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prisoner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prisoner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addprisoner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton removeprisoner;
    private javax.swing.JButton searchprisoner;
    private javax.swing.JButton updateprisoner;
    // End of variables declaration//GEN-END:variables
}
