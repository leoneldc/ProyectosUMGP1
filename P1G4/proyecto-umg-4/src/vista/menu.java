/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Usuarios;

/**
 *
 */
public class menu extends javax.swing.JFrame {

    Usuarios mod;

    public menu() {
        initComponents();
    }

    menu(Usuarios mod) {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;

        if (mod.getIdTipo() == 1) {
            menuProductos.setVisible(true);
            menuProveedores.setVisible(true);
        } else {
            menuProveedores.setVisible(false);
           menuProductos.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        subMenuAddProducto = new javax.swing.JMenuItem();
        subMenuEditProducto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuProveedores = new javax.swing.JMenu();
        subMenuAddProvedor = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuProveedores1 = new javax.swing.JMenu();
        subMenuAddProvedor1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuProveedores2 = new javax.swing.JMenu();
        subMenuAddProvedor2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        menuProductos.setText("Informacion");

        subMenuAddProducto.setText("Facultades");
        subMenuAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuAddProductoActionPerformed(evt);
            }
        });
        menuProductos.add(subMenuAddProducto);

        subMenuEditProducto.setText("Carreras");
        subMenuEditProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuEditProductoActionPerformed(evt);
            }
        });
        menuProductos.add(subMenuEditProducto);

        jMenuItem1.setText("Cusos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuProductos.add(jMenuItem1);

        jMenuItem6.setText("Secciones");
        menuProductos.add(jMenuItem6);

        jMenuItem7.setText("Jornadas");
        menuProductos.add(jMenuItem7);

        jMenuItem8.setText("Sedes");
        menuProductos.add(jMenuItem8);

        jMenuItem9.setText("Aulas");
        menuProductos.add(jMenuItem9);

        jMenuBar1.add(menuProductos);

        menuProveedores.setText("Info Alumnos");

        subMenuAddProvedor.setText("Asignacion de alumnos");
        menuProveedores.add(subMenuAddProvedor);

        jMenuItem2.setText("Alumnos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuProveedores.add(jMenuItem2);

        jMenuBar1.add(menuProveedores);

        menuProveedores1.setText("Info Maestros");

        subMenuAddProvedor1.setText("Asignacion de Mestros");
        menuProveedores1.add(subMenuAddProvedor1);

        jMenuItem4.setText("Maestros");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuProveedores1.add(jMenuItem4);

        jMenuBar1.add(menuProveedores1);

        subMenuAddProvedor2.setText("Asignacion de Mestros");
        menuProveedores2.add(subMenuAddProvedor2);

        jMenuItem5.setText("Maestros");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        menuProveedores2.add(jMenuItem5);

        jMenuBar1.add(menuProveedores2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subMenuAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuAddProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuAddProductoActionPerformed

    private void subMenuEditProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuEditProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subMenuEditProductoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenu menuProductos;
    private javax.swing.JMenu menuProveedores;
    private javax.swing.JMenu menuProveedores1;
    private javax.swing.JMenu menuProveedores2;
    private javax.swing.JMenuItem subMenuAddProducto;
    private javax.swing.JMenuItem subMenuAddProvedor;
    private javax.swing.JMenuItem subMenuAddProvedor1;
    private javax.swing.JMenuItem subMenuAddProvedor2;
    private javax.swing.JMenuItem subMenuEditProducto;
    // End of variables declaration//GEN-END:variables
}
