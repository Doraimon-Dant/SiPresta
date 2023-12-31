/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Entidades.Variables;
import MenuAD.MenuAD;
import MenuAD.MenuAD;
import MenuUS.MenuUS;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author CHRISTOPHERURIELTAFO
 */
public class Fondo extends javax.swing.JFrame {

    private boolean valido;

    /**
     * Creates new form Fondo
     */
    public Fondo() {
        setLocationRelativeTo(this);
        setIconImage(getIconImage());
        setTitle("Fondo");
        initComponents();
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/SiPresta2.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtFondo = new javax.swing.JTextField();
        LlbLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnAcceso = new javax.swing.JButton();
        LblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 181, 254));

        TxtFondo.setBackground(new java.awt.Color(102, 255, 255));
        TxtFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtFondoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtFondoKeyTyped(evt);
            }
        });

        LlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SiPresta2.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fondo:");

        BtnAcceso.setBackground(new java.awt.Color(51, 255, 255));
        BtnAcceso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtnAcceso.setText("Ingresar");
        BtnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAccesoActionPerformed(evt);
            }
        });

        LblMensaje.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(LlbLogo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(BtnAcceso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(LlbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnAcceso)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFondoKeyTyped
        char n = evt.getKeyChar();
        if (n < '0' || n > '9') {
            evt.consume();

        }
    }//GEN-LAST:event_TxtFondoKeyTyped

    private void TxtFondoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtFondoKeyReleased

        if (TxtFondo.getText().length() > 0) {
            LblMensaje.setText("");
            this.valido = true;
        } else {
            LblMensaje.setText("Por favor ingresa una cantidad");
            LblMensaje.setForeground(Color.red);
            this.valido = false;
        }
    }//GEN-LAST:event_TxtFondoKeyReleased

    private void BtnAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAccesoActionPerformed

        String mensaje = "";
        int RolId = Variables.rolId;
        switch (RolId) {
            case 1:
                Variables.fondoAD = Double.parseDouble(TxtFondo.getText());
                this.dispose();
                MenuAD MAD = new MenuAD();
                MAD.toFront();
                MAD.setVisible(true);
                break;
            case 2:
                Variables.fondo = Double.parseDouble(TxtFondo.getText());
                this.dispose();
                MenuUS MUS = new MenuUS();
                MUS.toFront();
                MUS.setVisible(true);
                break;
            default:
                mensaje = "El Rol de empleado no existe";
                JOptionPane.showMessageDialog(this, mensaje, "Acceso", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
          if (this.valido == true) {
            this.dispose();
        } else {
            LblMensaje.setText("No has ingresado una cantidad");
            LblMensaje.setForeground(Color.red);
            return;
        }
    }//GEN-LAST:event_BtnAccesoActionPerformed

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
            java.util.logging.Logger.getLogger(Fondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fondo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcceso;
    private javax.swing.JLabel LblMensaje;
    private javax.swing.JLabel LlbLogo;
    private javax.swing.JTextField TxtFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
