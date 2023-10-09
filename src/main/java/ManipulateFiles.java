
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public void ReorganizeFile(String rutaBinnacle, String rutaArchivo) {
        List<String> lineasOrdenadas = EnListFile(rutaBinnacle);
        
        try{
            FileWriter fileWriter = new FileWriter(rutaBinnacle);
            // Cierra el FileWriter sin escribir nada
            fileWriter.close();
            for (int i = 0; i < lineasOrdenadas.size(); i++) {
            WriteAFile(lineasOrdenadas.get(i),true,rutaArchivo);
        }
        }
        catch(IOException e){            
        }
        
        
    }
    
     public static List<String> EnListFile(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try {
            // Abre el archivo para lectura
            FileReader fileReader = new FileReader(nombreArchivo);

            // Crea un BufferedReader para leer líneas
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;

            // Lee y agrega cada línea del archivo a la lista
            while ((linea = bufferedReader.readLine()) != null) {
                lineas.add(linea);
            }

            // Cierra el BufferedReader
            bufferedReader.close();

            // Ordena las líneas según el primer split con el delimitador "|"
            Collections.sort(lineas, (linea1, linea2) -> {
                String[] partes1 = linea1.split("\\|");
                String[] partes2 = linea2.split("\\|");
                return partes1[0].compareTo(partes2[0]);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineas;
    }
   
    
}
