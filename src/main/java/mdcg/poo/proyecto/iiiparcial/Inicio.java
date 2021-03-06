
package mdcg.poo.proyecto.iiiparcial;

import mdcg.poo.proyecto.iiiparcial.Compra;

/**
 *
 * @author Heiby
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
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

        bnInventario = new javax.swing.JButton();
        bnBitacora = new javax.swing.JButton();
        bnCompra = new javax.swing.JButton();
        bnVenta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bnInventario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bnInventario.setText("Inventario");
        bnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnInventarioMouseClicked(evt);
            }
        });

        bnBitacora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bnBitacora.setText("Bitacora");
        bnBitacora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnBitacoraMouseClicked(evt);
            }
        });

        bnCompra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bnCompra.setText("Compra");
        bnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnCompraMouseClicked(evt);
            }
        });

        bnVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bnVenta.setText("Venta");
        bnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnVentaMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnBitacora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(bnInventario)
                .addGap(18, 18, 18)
                .addComponent(bnBitacora)
                .addGap(18, 18, 18)
                .addComponent(bnCompra)
                .addGap(18, 18, 18)
                .addComponent(bnVenta)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1MouseClicked

    private void bnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnInventarioMouseClicked
        // TODO add your handling code here:
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnInventarioMouseClicked

    private void bnVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnVentaMouseClicked
        // TODO add your handling code here:
        Venta venta = new Venta();
        venta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnVentaMouseClicked

    private void bnBitacoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnBitacoraMouseClicked
        // TODO add your handling code here:
        Bitacoras bitacora = new Bitacoras();
        bitacora.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_bnBitacoraMouseClicked

    private void bnCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnCompraMouseClicked
        // TODO add your handling code here:
        Compra compra = new Compra();
        compra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnCompraMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</edibnInventario>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnBitacora;
    private javax.swing.JButton bnCompra;
    private javax.swing.JButton bnInventario;
    private javax.swing.JButton bnVenta;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
