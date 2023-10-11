import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cesar
 */
public class ManipulateFiles {
    public void WriteAFile(String linea, boolean save, String rutaArchivo) throws IOException{
        FileWriter fileWriter = new FileWriter(rutaArchivo, save);// si sabe es true se agrega al final de la linea, false para eliminar y escribir
            // Crea un BufferedWriter para escribir líneas
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);            
            // Escribe líneas en el archivo
            bufferedWriter.write(linea+"\n");            
            // Cierra el BufferedWriter
            bufferedWriter.close();
    }
    public String ObtenerHoraActual(){
         Date fechaHoraActual = new Date();

        // Define un formato para la fecha y hora
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Formatea la fecha y hora actuales como una cadena
        return formato.format(fechaHoraActual);
    }
    private boolean WritedFile(String rutaArchivo){
        File archivo = new File(rutaArchivo);
        if (archivo.exists() && archivo.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
    public int LargeOfFile(String rutaArchivo){
        int lineCount = 0;    
    try {
        FileReader fileReader = new FileReader(rutaArchivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        while (bufferedReader.readLine() != null) {
            lineCount++;
        }
        
        bufferedReader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    return lineCount;
    }
    public void WriteADescriptor(Users usuario, String rutaArchivo, String lineaEnvio, int valor) throws IOException{
        if (WritedFile(rutaArchivo)==false) {
            File archivo = new File(rutaArchivo);
            try{                
                WriteAFile(lineaEnvio,false,rutaArchivo);
            }catch(IOException e){ 
                
            }
        }
        else{
            try {
            // Abre el archivo para lectura
            FileReader fileReader = new FileReader(rutaArchivo);

            // Crea un BufferedReader para leer líneas
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Lee la primera línea del archivo
            String primeraLinea = bufferedReader.readLine();

            // Cierra el BufferedReader
            bufferedReader.close();
            FileWriter fileWriter = new FileWriter(rutaArchivo);
            // Cierra el FileWriter sin escribir nada
            fileWriter.close();
            String[] partes = primeraLinea.split("\\|");
            partes[3] = ObtenerHoraActual();
            partes[4] = usuario.getUsuario();
            partes[5] = "0";

            int total = 0;
            if (valor == 1) {
                int canti = Integer.parseInt(partes[6]) + 1;
                total += canti;
                partes[6] = String.valueOf(canti);
            } else if(valor==-1) {
                int canti = Integer.parseInt(partes[7]) + 1;
                total += canti;
                partes[7] = String.valueOf(canti);
            }
            else if(valor==0){                
                total = 0;
                partes[6] = String.valueOf(0);
                partes[7] = String.valueOf(0);
            }
             else if(valor==2){                
               int canti = Integer.parseInt(partes[6]) + 3;
               total += canti;
               partes[6] = String.valueOf(canti);
            }
            partes[5] = String.valueOf(total);

            // Reemplaza la primera línea original con la línea actualizada
            StringBuilder nuevaLinea = new StringBuilder();
            for (String parte : partes) {
                nuevaLinea.append(parte).append("|");
            }

            // Elimina el último "|" agregado en el ciclo anterior
            nuevaLinea.deleteCharAt(nuevaLinea.length() - 1);
            WriteADescriptor(usuario,rutaArchivo,nuevaLinea.toString(), valor);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
    public void WriteABinnacle(String linea, String rutaBinnacle, String rutaArchivo){
        try {
            WriteAFile(linea,true,rutaBinnacle);
        } catch (IOException ex) {
            
        }
        
    }
    
    private void SortFile(String rutaArchivo) throws IOException {
    List<Users> allusers = EnListFile(rutaArchivo);
    DeleteFile(rutaArchivo);
    // Define un comparador personalizado para ordenar por el atributo "usuario"
    Comparator<Users> usuarioComparator = new Comparator<Users>() {
        @Override
        public int compare(Users u1, Users u2) {
            return u1.getUsuario().compareTo(u2.getUsuario());
        }
    };

    // Ordena la lista utilizando el comparador
    Collections.sort(allusers, usuarioComparator);
    
    // La lista "allusers" ahora estará ordenada por el atributo "usuario"
        for (int i = 0; i < allusers.size(); i++) {
            String lineaenvio=allusers.get(i).UserToString();
            WriteAFile(lineaenvio,true,rutaArchivo);
        }
}

    
    public void ReorganizeFile(String rutaBinnacle, String rutaArchivo) throws IOException {
        List<Users> lineasOrdenadas = EnListFile(rutaBinnacle);
            DeleteFile(rutaBinnacle);
            for (int i = 0; i < lineasOrdenadas.size(); i++) {
                if (lineasOrdenadas.get(i).getEstatus()=='1') {
                    String lineaimprimir=lineasOrdenadas.get(i).UserToString();
                    WriteAFile(lineaimprimir,true,rutaArchivo);
                }                
            }
        SortFile(rutaArchivo);        
    }
    
     public List<Users> EnListFile(String nombreArchivo) throws FileNotFoundException, IOException {
    FileReader leerFila = new FileReader(nombreArchivo);
    
    List<Users> resultList = new ArrayList<>();
    
    BufferedReader bufferedReader = new BufferedReader(leerFila);
    
    String linea = bufferedReader.readLine();
    while (linea != null) {
        Users usuario = new Users();
        usuario = usuario.StringToUser(linea);            
        resultList.add(usuario);  
        linea = bufferedReader.readLine();
    }
    
    // Define un Comparator para ordenar por el atributo "usuario"
    Comparator<Users> usuarioComparator = new Comparator<Users>() {
        @Override
        public int compare(Users u1, Users u2) {
            return u1.getUsuario().compareTo(u2.getUsuario());
        }
    };

    // Ordena la lista utilizando el Comparator
    Collections.sort(resultList, usuarioComparator);
    
    // Ahora resultList está ordenada por el atributo "usuario" de menor a mayor
    
    return resultList; // Devuelve la lista ordenada
}

     
     public List<Users> EnListTwoFiles(String arch1, String arch2){
         List<Users> lineas = new ArrayList<>();
         
         try (BufferedReader reader = new BufferedReader(new FileReader(arch1))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Users usutemp=new Users();
                usutemp=usutemp.StringToUser(linea);
                lineas.add(usutemp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(arch2))) {
            String linea;
             while ((linea = reader.readLine()) != null) {
                Users usutemp=new Users();
                usutemp=usutemp.StringToUser(linea);
                lineas.add(usutemp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
     }
     public Users FindAdmin(List<Users> allusers) throws IOException{
     Users admin=null;
     for (int i = 0; i < allusers.size(); i++) {
                if (allusers.get(i).getRol()=='1') {
                    admin=allusers.get(i);
                    break;
                }
            }
     return admin;
     }
     
    private void DeleteFile(String ruta) throws IOException{
         FileWriter fileWriter = new FileWriter(ruta);
            // Cierra el FileWriter sin escribir nada
            fileWriter.close();
    }
    
    public int FindUser(Users who,List<Users> users) throws IOException{
        Users admin=FindAdmin(users);
        for (int i = 0; i < users.size(); i++) {
        if (users.get(i).equals(who) && !users.get(i).equals(admin)) {
            return i; // Termina el bucle una vez que se elimina el objeto
        }        
    }
        return -1;
    }
    
    private void EditDescriptorByAdmin(String rutaUsuario, String rutaDescriptor, int action) throws IOException{
        Users admin=FindAdmin(EnListFile(rutaUsuario));
        String lineadesc = "usuario" + "|" + ObtenerHoraActual() + "|" + admin.getUsuario() + "|" + ObtenerHoraActual() + "|" + admin.getUsuario() + "|" + "1" + "|" + "1" + "|" + "0" + "|" + "3";
        WriteADescriptor(admin,rutaDescriptor,lineadesc,action);
    }
   
    public void DeleteFromFiles(Users delete, String rutaUsuario, String rutaBinnacle) throws IOException {
    List<Users> users = new ArrayList<>();
    List<Users> usersBinnacle = new ArrayList<>();
    users = EnListFile(rutaUsuario);
    usersBinnacle = EnListFile(rutaUsuario);
    DeleteFile(rutaUsuario);
    DeleteFile(rutaBinnacle);
    
    // Recorre la lista para encontrar y eliminar el objeto "delete"
    int indexuser=FindUser(delete, users);
    int indexbinnacle=FindUser(delete,usersBinnacle);
    
        if (indexuser!=-1) {
            users.get(indexuser).setEstatus('0');
        }
        if (indexbinnacle!=-1) {
            usersBinnacle.get(indexuser).setEstatus('0');

        }    
        for (int i = 0; i < users.size(); i++) {
            WriteAFile(users.get(i).UserToString(),true,rutaUsuario);
        }
        for (int i = 0; i < usersBinnacle.size(); i++) {
            WriteAFile(users.get(i).UserToString(),true,rutaBinnacle);
        }
}
    
}
