/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Dani
 */
public class I_MenuClientes extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministrador
     */
    public I_MenuClientes() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        menubar = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        item1 = new javax.swing.JMenu();
        itempeliculas = new javax.swing.JMenuItem();
        itemseries = new javax.swing.JMenuItem();
        item2 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        item3 = new javax.swing.JMenuItem();
        item9 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        item4 = new javax.swing.JMenuItem();
        item5 = new javax.swing.JMenuItem();
        item6 = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenu();
        item7 = new javax.swing.JMenuItem();
        item8 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        menu1.setText("Productos");

        item1.setText("Comprar Productos");

        itempeliculas.setText("peliculas");
        itempeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itempeliculasActionPerformed(evt);
            }
        });
        item1.add(itempeliculas);

        itemseries.setText("series");
        item1.add(itemseries);

        menu1.add(item1);

        item2.setText("Ver Productos");
        menu1.add(item2);

        menubar.add(menu1);

        menu2.setText("Usuario");

        item3.setText("Ver historial");
        menu2.add(item3);

        item9.setText("Darse de baja");
        item9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item9ActionPerformed(evt);
            }
        });
        menu2.add(item9);

        menubar.add(menu2);

        menu3.setText("Cambiar Fondo");

        item4.setText("Fondo 1");
        menu3.add(item4);

        item5.setText("Fondo 2");
        menu3.add(item5);

        item6.setText("Fondo 3");
        menu3.add(item6);

        menubar.add(menu3);

        menu4.setText("Opciones");

        item7.setText("Volver Al Menu Principal");
        menu4.add(item7);

        item8.setText("Salir");
        menu4.add(item8);

        menubar.add(menu4);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item9ActionPerformed

    private void itempeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itempeliculasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itempeliculasActionPerformed

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
            java.util.logging.Logger.getLogger(I_MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_MenuClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_MenuClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu item1;
    private javax.swing.JMenuItem item2;
    private javax.swing.JMenuItem item3;
    private javax.swing.JMenuItem item4;
    private javax.swing.JMenuItem item5;
    private javax.swing.JMenuItem item6;
    private javax.swing.JMenuItem item7;
    private javax.swing.JMenuItem item8;
    private javax.swing.JMenuItem item9;
    private javax.swing.JMenuItem itempeliculas;
    private javax.swing.JMenuItem itemseries;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menu4;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
