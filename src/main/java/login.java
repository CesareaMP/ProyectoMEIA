/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author cesar carua
 */
public class login extends javax.swing.JFrame {
 ManipulateFiles archi=new ManipulateFiles();
    /**
     * Creates new form login
     */
    public login() {
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

        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        lblUsuario1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblUsuario.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("USUARIO");
        lblUsuario.setOpaque(true);

        btnLogin.setBackground(new java.awt.Color(255, 204, 112));
        btnLogin.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("INICIAR SESIÓN");
        btnLogin.setToolTipText("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(255, 204, 112));
        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("REGISTRARSE");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        lblUsuario1.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario1.setText("CONTRASEÑA");
        lblUsuario1.setToolTipText("");
        lblUsuario1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTACRACK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrarse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String rutaUsuario = "C:/MEIA/usuario.txt";
    String rutadescUsuario = "C:/MEIA/desc_usuario.txt";
    String rutabitUsuario = "C:/MEIA/bitusuario.txt";
    String rutadescbitUsuario = "C:/MEIA/desc_bitusuario.txt";
    String rutaBackup="C:/MEIA/backup.txt";
    String rutadescBackup="C:/MEIA/desc_backup.txt";
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        String login=txtUsuario.getText();
        String password=txtPassword.getText();
        if(!login.isEmpty() && !password.isEmpty()){
        
        password=DigestUtils.sha256Hex(password);
        Users usuario=null;
        List<Users> resultList = new ArrayList<>();
        resultList=archi.EnListTwoFiles(rutaUsuario,rutabitUsuario);
            for (int i = 0; i < resultList.size(); i++) {
                if (resultList.get(i).getUsuario().equals(login) && resultList.get(i).getPassword().equals(password)) {
                    usuario=resultList.get(i);
                }
            }
            if (usuario==null) {
                JOptionPane.showMessageDialog(null,"Usuario no encontrado");
            }
            else{                
                if (usuario.getRol()=='1') {//es admin
                    menuPrincipal menuPrincipal = new menuPrincipal(usuario);
                    menuPrincipal.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
                    menuPrincipal.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
                    menuPrincipal.setVisible(true);
                    this.dispose();
                    
                    ManipulateFiles archi = new ManipulateFiles();
        
                
                    
                }
                else{//no es admin
                    menuUsuario MenuUsuario = new menuUsuario(usuario);
                    MenuUsuario.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
                    MenuUsuario.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
                    MenuUsuario.setVisible(true);
                    this.dispose();
                    
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Ingrese todos los campos");
        }
        txtUsuario.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formMouseMoved

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        File archivoUsuario = new File(rutaUsuario);
        File archivodescUsuario = new File(rutadescUsuario);
        File archivobitUsuario = new File(rutabitUsuario);
        File archivodescbitUsuario = new File(rutadescbitUsuario);
        File archivoBackup = new File(rutaBackup);
        File archivodescBackup = new File(rutadescBackup);

    // Verifica si el archivo no existe y créalo si es necesario
    try{
        if (!archivoUsuario.exists()) {
        archivoUsuario.createNewFile();
    }

    if (!archivodescUsuario.exists()) {
        archivodescUsuario.createNewFile();
    }

    if (!archivobitUsuario.exists()) {
        archivobitUsuario.createNewFile();
    }

    if (!archivodescbitUsuario.exists()) {
        archivodescbitUsuario.createNewFile();
    }
    
    if (!archivoBackup.exists()) {
        archivoBackup.createNewFile();
    }
    
    if (!archivodescBackup.exists()) {
        archivodescBackup.createNewFile();
    }

    }
    catch (IOException ex){}
    

        if (archivoUsuario.length() == 0) {
           txtUsuario.disable();
           txtPassword.disable();
           btnLogin.disable();
           btnRegistrarse.disable();
           register registerFrame;
            try {
                registerFrame = new register('1',null,null);
                registerFrame.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
           registerFrame.setAlwaysOnTop(true); // Para que se muestre por encima del otro JFrame
           registerFrame.setVisible(true);
           this.dispose();
            } catch (ParseException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        register registerFrame;
     try {
         registerFrame = new register('0',null,null);
         registerFrame.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
        registerFrame.setAlwaysOnTop(true); // Para que se muestre por encima del otro JFrame
        registerFrame.setVisible(true);
        this.dispose();
     } catch (ParseException ex) {
         Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
