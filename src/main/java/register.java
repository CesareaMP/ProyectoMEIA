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
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    String rutabitUsuario = "C:/MEIA/bitusuario.txt";
    String rutadescbitUsuario = "C:/MEIA/desc_bitusuario.txt";
    String rutadescUsuario = "C:/MEIA/desc_usuario.txt";
    ManipulateFiles archi=new ManipulateFiles();
    char rol;
    String path_fotografia="";
    String mensaje="";
    Users whoEdit=null;
    Users adminU=null;
    public register(char usu, Users a, Users admin) throws ParseException {
        initComponents();
        rol=usu;
        whoEdit=a;
        adminU=admin;
        dateChooser = new JDateChooser();
        dateChooser.setDate(new Date()); // Establecer la fecha actual como valor inicial
        dateChooser.setBounds(180, 310, 227, 50); // Establecer la posición y el tamaño
        getContentPane().add(dateChooser);
        
        if (rol=='3' || rol=='4') {
            txtUsuario.setText(a.getUsuario());
            txtNombre.setText(a.getNombre());
            txtApellido.setText(a.getApellido());
            txtPassword.setText("Password, no cambie para conservar");
            txtUsuario.disable();

            txtCorreo.setText(a.getCorreoElectronico());
            txtTelefono.setText(String.valueOf(a.getTelefono()));
            Date asd=new SimpleDateFormat("dd/MM/yyyy").parse(a.getFechaNacimiento());
            dateChooser.setDate(asd);
            path_fotografia=a.getPathFotografia();
            ImageIcon imagenIcon = new ImageIcon(path_fotografia);
            Image imagenOriginal = imagenIcon.getImage();
            Image imagenRedimensionada = imagenOriginal.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);
            lblImagen.setIcon(imagenRedimensionadaIcon);
            
        }
        
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
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnFoto = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        lblUsuario5 = new javax.swing.JLabel();
        lblUsuario6 = new javax.swing.JLabel();
        lblUsuario7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnFoto.setBackground(new java.awt.Color(255, 204, 112));
        btnFoto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 0, 0));
        btnFoto.setText("SELECCIONAR IMAGEN");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(255, 204, 112));
        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("ENVIAR");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        lblUsuario.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("USUARIO");
        lblUsuario.setOpaque(true);

        lblUsuario2.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario2.setText("NOMBRE");
        lblUsuario2.setOpaque(true);

        lblUsuario3.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario3.setText("APELLIDO");
        lblUsuario3.setOpaque(true);

        lblUsuario4.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario4.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario4.setText("PASSWORD");
        lblUsuario4.setOpaque(true);

        lblUsuario5.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario5.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario5.setText("FECHA DE NACIMIENTO");
        lblUsuario5.setOpaque(true);

        lblUsuario6.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario6.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario6.setText("CORREO ELECTRONICO");
        lblUsuario6.setOpaque(true);

        lblUsuario7.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario7.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario7.setText("TELEFONO");
        lblUsuario7.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtUsuario)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(lblUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtPassword)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCorreo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(lblUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblUsuario6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");//darle formato a la fecha
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
                int score=4;
                String encrypt=null;
                if (!password.equals("Password, no cambie para conservar")) {
                Strength asd=zxcvbn.measure(password);
                score = asd.getScore();
                encrypt=DigestUtils.sha256Hex(password);
                }
                else{
                    encrypt=whoEdit.getPassword();
                }
                    if (score<=2) {
                        mensaje+="Su contrasenia es demasiado debil, trate usar mayusculas y/o caracteres especiales\n";
                    }
                    if (mensaje.equals("")) {
                        Users persona=new Users(usuario,nombre,apellido,encrypt,rol,Datef,correo_electronico,telefono,path_fotografia,estatus);
                        String linearch=persona.UserToString();
                        try {
                            if (rol=='1') {
                                archi.WriteABinnacle(linearch,rutabitUsuario,rutaUsuario);
                                archi.ReorganizeFile(rutabitUsuario,rutaUsuario);
                                String lineabit = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                                archi.WriteADescriptor(persona,rutadescbitUsuario,lineabit,0,0);
                                String lineadesc = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "1" + "|" + "1" + "|" + "0" + "|" + "3";
                                archi.WriteADescriptor(persona,rutadescUsuario,lineadesc,1,0);
                            }
                            else if(rol=='0'){
                                archi.WriteABinnacle(linearch,rutabitUsuario,rutaUsuario);
                                archi.ReorganizeFile(rutaUsuario,rutaUsuario);
                                String lineaEnvio = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                                archi.WriteADescriptor(persona,rutadescbitUsuario,lineaEnvio,1,0);
                                if (archi.LargeOfFile(rutabitUsuario)==3) {
                                    archi.ReorganizeFile(rutabitUsuario,rutaUsuario);
                                    String lineadesc = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                                    archi.WriteADescriptor(persona,rutadescbitUsuario,lineadesc,0,0);
                                    archi.WriteADescriptor(persona,rutadescUsuario,lineadesc,2,0);
                                }                               
                            }
                            else if(rol=='2'){//admin crea
                                persona.setRol('0');
                                archi.WriteABinnacle(linearch,rutabitUsuario,rutaUsuario);
                                archi.ReorganizeFile(rutaUsuario,rutaUsuario);
                                String lineaEnvio = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + persona.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                                archi.WriteADescriptor(whoEdit,rutadescbitUsuario,lineaEnvio,1,0);
                                if (archi.LargeOfFile(rutabitUsuario)==3) {
                                    archi.ReorganizeFile(rutabitUsuario,rutaUsuario);
                                    String lineadesc = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                                    archi.WriteADescriptor(whoEdit,rutadescbitUsuario,lineadesc,0,0);
                                    archi.WriteADescriptor(whoEdit,rutadescUsuario,lineadesc,2,0);
                                }                               
                            }
                            else if(rol=='3'){//usuario edita                 
                                persona.setRol('0');
                                archi.EditUser(persona, rutaUsuario,rutadescUsuario,adminU);
                            }
                            else if(rol=='4'){
                                persona.setRol('0');
                                archi.EditUser(persona,rutaUsuario,rutadescUsuario,persona);//Users edit,String rutaArchivo, String rutaDescUsuario, String rutaBinnacle, String rutaDescBinnacle
                                archi.EditUser(persona,rutabitUsuario,rutadescbitUsuario,persona);//Users edit,String rutaArchivo, String rutaDescUsuario, String rutaBinnacle, String rutaDescBinnacle
                            
                            }
                        
                        } catch (IOException e) {}
                        if (rol=='0' || rol=='1') {
                        JOptionPane.showMessageDialog(this, "Usuario creado con exito");
                        login loginFrame = new login();
                        loginFrame.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
                        loginFrame.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
                        loginFrame.setVisible(true);
                        this.dispose();
                        }
                        else if (rol=='2' || rol=='3'){
                             try
                                {
                        ManipulateFiles archi = new ManipulateFiles();
                        try{
                        archi.ReorganizeFile(rutabitUsuario,rutaUsuario);
                        String lineabit = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                        archi.WriteADescriptor(whoEdit,rutadescbitUsuario,lineabit,0,0);
                        String lineadesc = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + "1" + "|" + "1" + "|" + "0" + "|" + "3";
                        archi.WriteADescriptor(whoEdit,rutadescUsuario,lineadesc,-2,archi.countLines(rutadescUsuario));
                        }
                        catch(IOException e){ 
                        }
            
                        registrosMenu registrosMenu = new registrosMenu(whoEdit);
                        registrosMenu.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
                        registrosMenu.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
                        registrosMenu.setVisible(true);
                        this.dispose();
                        } catch (IOException ex)
                        {
                         Logger.getLogger(menuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        }// admin actualizo
                        
                        else if(rol=='4'){
                        String lineabit = "usuario" + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + archi.ObtenerHoraActual() + "|" + whoEdit.getUsuario() + "|" + "0" + "|" + "0" + "|" + "0" + "|" + "3";
                        
                        menuUsuario menuUser = new menuUsuario(persona);
                        menuUser.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
                        menuUser.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
                        menuUser.setVisible(true);
                        this.dispose();
                        
                        }//admin edito
                        
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

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
        String rutaImagen = obtenerRutaImagen();
        if (rutaImagen != null) {
            ImageIcon imagenIcon = new ImageIcon(rutaImagen);
            Image imagenOriginal = imagenIcon.getImage();
            Image imagenRedimensionada = imagenOriginal.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);
            lblImagen.setIcon(imagenRedimensionadaIcon);
            path_fotografia = rutaImagen;
        }
    }//GEN-LAST:event_btnFotoActionPerformed
private String obtenerRutaImagen() {
    JFileChooser fileChooser = new JFileChooser();
    
    // Filtra solo los archivos con extensiones JPEG y PNG
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg", "png");
    fileChooser.setFileFilter(filter);
    
    int result = fileChooser.showOpenDialog(this); // Abre el dialogo de selección de archivo
    
    if (result == JFileChooser.APPROVE_OPTION) {
        // El usuario ha seleccionado un archivo
        java.io.File selectedFile = fileChooser.getSelectedFile();
        String nuevaRuta=archi.copyImage(selectedFile.getAbsolutePath(), "C:/MEIA/Pictures");
        return nuevaRuta;
// Retorna la ruta del archivo
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
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JLabel lblUsuario5;
    private javax.swing.JLabel lblUsuario6;
    private javax.swing.JLabel lblUsuario7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
