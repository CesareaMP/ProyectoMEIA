

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class Users {
    private String usuario;
    private String nombre;
    private String apellido;
    private String password;
    private char rol;
    private String fecha_nacimiento;
    private String correo_electronico;
    private int telefono;
    private String path_fotografia;
    private char estatus;
    
    // Cesar no borres esto, si funciona para algo XD
    public Users()
    {
        
    }
    
    public Users(String usuario, String nombre, String apellido, String password, char rol, String fechaNacimiento, String correoElectronico,int telefono, String pathFotografia, char estatus) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.rol = rol;
        this.fecha_nacimiento = fechaNacimiento;
        this.correo_electronico = correoElectronico;
        this.telefono = telefono;
        this.path_fotografia = pathFotografia;
        this.estatus = estatus;
    }
    
    public String UserToString(){
        return this.usuario+"|"+this.nombre+"|"+this.apellido+"|"+this.password+"|"+String.valueOf(this.rol)+"|"+this.fecha_nacimiento+"|"+this.correo_electronico+"|"+String.valueOf(telefono)+"|"+this.path_fotografia+"|"+String.valueOf(this.estatus);
    }
    public Users StringToUser(String linea){
            Users retusuario = new Users();
            String[] tokens = linea.split("\\|");
            
            retusuario.setUsuario(tokens[0]);
            retusuario.setNombre(tokens[1]);
            retusuario.setApellido(tokens[2]);
            retusuario.setPassword(tokens[3]);
            retusuario.setRol(tokens[4].charAt(0));
            retusuario.setFechaNacimiento(tokens[5]);
            retusuario.setCorreoElectronico(tokens[6]);
            retusuario.setTelefono(Integer.parseInt(tokens[7]));
            retusuario.setPathFotografia(tokens[8]);
            retusuario.setEstatus(tokens[9].charAt(0));
        return retusuario;
    }
    
    public String UserPrint(){
        return this.usuario+"|"+this.nombre+"|"+this.apellido+"|"+String.valueOf(this.rol)+"|"+this.fecha_nacimiento+"|"+this.correo_electronico+"|"+String.valueOf(telefono)+"|";
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getRol() {
        return rol;
    }

    public void setRol(char rol) {
        this.rol = rol;
    }

    public String getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fecha_nacimiento = fechaNacimiento;
    }

    public String getCorreoElectronico() {
        return correo_electronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correo_electronico = correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPathFotografia() {
        return path_fotografia;
    }

    public void setPathFotografia(String pathFotografia) {
        this.path_fotografia = pathFotografia;
    }

    public char getEstatus() {
        return estatus;
    }

    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
}
