/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.nulabinc.zxcvbn.*;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.apache.commons.codec.digest.DigestUtils;
import java.io.IOException;

/**
  private JDateChooser dateChooser;
 * @author cesar
 */

public class register extends javax.swing.JFrame {
// Crear y configurar el JDateChooser
    private final JDateChooser dateChooser; // Declarar el JDateChooser
    /**
     * Creates new form register
     */
    String rutaUsuario = "C:/MEIA/usuario.txt";
    String rutadescUsuario = "C:/MEIA/desc_usuario.txt";
    String rutabitUsuario = "C:/MEIA/bitusuario.txt";
    String rutadescbitUsuario = "C:/MEIA/desc_bitusuario.txt";
    ManipulateFiles archi=new ManipulateFiles();
    char rol;
    String path_fotografia="";
    String mensaje="";
    public register(char usu) {
        initComponents();
        rol=usu;
        dateChooser = new JDateChooser();
        dateChooser.setDate(new Date()); // Establecer la fecha actual como valor inicial
        dateChooser.setBounds(210, 255, 130, 25); // Establecer la posición y el tamaño
        getContentPane().add(dateChooser);
    }

    private register() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        lblApellido1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnFoto = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsuario.setText("Usuario");

        lblNombre.setText("Nombre");

        lblPassword.setText("Password");

        lblApellido.setText("Apellido");

        lblNombre1.setText("Correo Electronico");

        lblUsuario1.setText("Fecha de Nacimiento");

        lblApellido1.setText("Telefono");

        btnFoto.setText("Seleccionar Fotografia");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellido)
                                    .addComponent(lblPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario)
                                    .addComponent(lblNombre))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtUsuario)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre1)
                                        .addComponent(lblUsuario1)
                                        .addComponent(lblApellido1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnFoto)
                                            .addGap(39, 39, 39)
                                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 46, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblUsuario1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido1)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
    String rutaImagen = obtenerRutaImagen();
    if (rutaImagen != null) {
    ImageIcon imagenIcon = new ImageIcon(rutaImagen);
    Image imagenOriginal = imagenIcon.getImage();
    Image imagenRedimensionada = imagenOriginal.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
    ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);
    lblImagen.setIcon(imagenRedimensionadaIcon);
    path_fotografia = rutaImagen;
}
    }//GEN-LAST:event_btnFotoActionPerformed

     public static boolean esCorreoValido(String correo) {
        try {
            InternetAddress internetAddress = new InternetAddress(correo);
            internetAddress.validate();
            return true;
        } catch (AddressException ex) {
            // La dirección de correo electrónico no es válida
            return false;
        }
    }
    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        String usuario=txtUsuario.getText();
        String nombre=txtNombre.getText();
        String apellido=txtApellido.getText();
        String password=txtPassword.getText();
        Date fecha_nacimiento = dateChooser.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//darle formato a la fecha
        String Datef = formato.format(fecha_nacimiento);//convertir la fecha en string con el formato de 
        String correo_electronico=txtCorreo.getText();
        int telefono=0;
        char estatus = '1';
        
        if (!usuario.equals("") && !nombre.equals("" ) && !apellido.equals("") && !password.equals("") 
        && !correo_electronico.equals("") && !path_fotografia.equals("")) {
            if(usuario.length()>20) mensaje+="El nombre de usuario no debe tener mas de 20 caracteres\n";
            if(nombre.length()>30) mensaje+="El nombre no debe tener mas de 30 caracteres\n";
            if(apellido.length()>30) mensaje+="El apellido no debe tener mas de 30 caracteres\n";
            if(password.length()>40) mensaje+="La contraseña no debe tener mas de 40 caracteres\n";
            if(correo_electronico.length()>40) mensaje+="El correo electronico no debe tener mas de 40 caracteres\n";
            if(esCorreoValido(correo_electronico)==false) mensaje+="El formato de correo electronico no es el correcto\n";
            try{
                 telefono=Integer.parseInt(txtTelefono.getText());
            }
            catch(NumberFormatException e){
                mensaje+="El numero de telefono no acepta letras\n";
            }
                if(path_fotografia.length()>200) mensaje+="La ruta de la fotografia es muy larga\n";
                if(txtTelefono.getText().length()!=8) mensaje+="El numero de telefono es invalido\n";
                Zxcvbn zxcvbn = new Zxcvbn();
                Strength asd=zxcvbn.measure(password);
                int score = asd.getScore();
                    if (score<=2) {
                        mensaje+="Su contrasenia es demasiado debil, trate usar mayusculas y/o caracteres especiales\n";
                    }
                    if (mensaje.equals("")) {
                        Users persona=new Users(usuario,nombre,apellido,DigestUtils.sha256Hex(password),rol,Datef,correo_electronico,telefono,path_fotografia,estatus);
                        String linearch=persona.UserToString();
                        try {
                            if (rol=='1') {
                                archi.WriteABinnacle(linearch,rutabitUsuario,rutaUsuario);
                                archi.ReorganizeFile(rutabitUsuario,rutaUsuario);
                                String lineaEnvio = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "1" + "|" + "1" + "|" + "0" + "|" + "3";
                                archi.WriteADescriptor(persona,rutadescbitUsuario,lineaEnvio,1);
                            }
                            else{ 
                                archi.WriteABinnacle(linearch,rutabitUsuario,rutaUsuario);
                                archi.ReorganizeFile(rutaUsuario,rutaUsuario);
                                String lineaEnvio = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "1" + "|" + "1" + "|" + "0" + "|" + "3";
                                archi.WriteADescriptor(persona,rutadescbitUsuario,lineaEnvio,1);
                            }
                        
                        } catch (IOException e) {}
                        JOptionPane.showMessageDialog(this, "Usuario creado con exito");
                        login loginFrame = new login();
                        loginFrame.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
                        loginFrame.setAlwaysOnTop(true); // Para que se muestre por encima del otro JFrame
                        loginFrame.setVisible(true);
                        this.dispose();
           this.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(this, mensaje);
                        mensaje="";
                    }               
        }
        else{
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        }
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed
private String obtenerRutaImagen() {
    JFileChooser fileChooser = new JFileChooser();
    
    // Filtra solo los archivos con extensiones JPEG y PNG
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png");
    fileChooser.setFileFilter(filter);
    
    int result = fileChooser.showOpenDialog(this); // Abre el dialogo de selección de archivo
    
    if (result == JFileChooser.APPROVE_OPTION) {
        // El usuario ha seleccionado un archivo
        java.io.File selectedFile = fileChooser.getSelectedFile();
        return selectedFile.getAbsolutePath(); // Retorna la ruta del archivo
    } else {
        // El usuario ha cancelado la selección o algo salió mal
        return null; // Retorna null en caso de cancelación o error
    }
}

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblApellido1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
