/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package es.torredelrey.gestorfacturas.vista;

import es.torredelrey.gestorfacturas.controlador.UsuarioJpaController;
import es.torredelrey.gestorfacturas.modelo.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RegistrarCuenta extends javax.swing.JFrame {

    private EntityManagerFactory emf;
    private UsuarioJpaController ujc;
    
    public RegistrarCuenta() {
        initComponents();
        
        setTitle("Registrar nueva cuenta");
        
        //BD
        emf = Persistence.createEntityManagerFactory("persistence");
        ujc = new UsuarioJpaController(emf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        lblContrasena = new javax.swing.JLabel();
        txfContrasena = new javax.swing.JTextField();
        btnCrearCuenta = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("es/torredelrey/gestorfacturas/vista/Bundle"); // NOI18N
        lblUsuario.setText(bundle.getString("RegistrarCuenta.lblUsuario.text")); // NOI18N

        txfUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfUsuarioFocusGained(evt);
            }
        });

        lblContrasena.setForeground(new java.awt.Color(102, 102, 102));
        lblContrasena.setText(bundle.getString("RegistrarCuenta.lblContrasena.text")); // NOI18N

        txfContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfContrasenaFocusGained(evt);
            }
        });

        btnCrearCuenta.setBackground(new java.awt.Color(0, 102, 204));
        btnCrearCuenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText(bundle.getString("RegistrarCuenta.btnCrearCuenta.text")); // NOI18N
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setText(bundle.getString("RegistrarCuenta.btnCancelar.text")); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContrasena)
                            .addComponent(lblUsuario)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txfContrasena)
                            .addComponent(txfUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        boolean salir = false;
        if(txfUsuario.getText().isBlank() || txfUsuario.getText().isEmpty() || txfUsuario.getForeground()==Color.red){
            salir=true;
            txfUsuario.setForeground(Color.red);
            txfUsuario.setText("Introduce un usuario");
        }
        
        if(txfContrasena.getText().isBlank() || txfContrasena.getText().isEmpty() || txfContrasena.getForeground()==Color.red){
            salir=true;
            txfContrasena.setForeground(Color.red);
            txfContrasena.setText("Introduce una contraseña");
        }
        
        if(salir) return;
        
        ArrayList<Usuario> usuarios = new ArrayList<>(ujc.findUsuarioEntities());
        for(Usuario u : usuarios){
            if(u.getUsuario().equals(txfUsuario.getText())){
                JOptionPane.showMessageDialog(this,"Nombre de usuario no disponible");
                return;
            }
        }

        Usuario nuevo = new Usuario();
        nuevo.setUsuario(txfUsuario.getText());
        nuevo.setPassword(txfContrasena.getText());
        ujc.create(nuevo);
        
        JOptionPane.showMessageDialog(this,"Usuario creado con éxito\nPuedes iniciar sesión");
        this.dispose();
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void txfUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfUsuarioFocusGained
        if(txfUsuario.getForeground()==Color.red){
            Color og = new Color(51,51,51);
            txfUsuario.setForeground(og);
            txfUsuario.setText("");
        }
    }//GEN-LAST:event_txfUsuarioFocusGained

    private void txfContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfContrasenaFocusGained
        if(txfContrasena.getForeground()==Color.red){
            Color og = new Color(51,51,51);
            txfContrasena.setForeground(og);
            txfContrasena.setText("");
        }
    }//GEN-LAST:event_txfContrasenaFocusGained

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JLabel lblContrasena;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txfContrasena;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
