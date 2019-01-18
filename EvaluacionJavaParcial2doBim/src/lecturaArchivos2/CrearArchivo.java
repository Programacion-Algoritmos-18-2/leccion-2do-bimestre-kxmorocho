/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author TOSHIBA
 */
public class CrearArchivo {

    private PrintWriter dataFinal;

    //metodo para crear el nuevo archivo con la data final
    public void crearDataFinal() {
        try {
            // creacion de objeto para la salida de la data final
            dataFinal = new PrintWriter("data/dataFinal.csv", "UTF-8");
        } catch (FileNotFoundException error) {
            System.err.println("No está el archivo");
            System.exit(1);
        } // fin de catch
        catch (UnsupportedEncodingException error) {
            System.out.println("Codificación incorrecta");
            System.exit(1);
        }
    } // fin del m�todo abrirArchivo
    //metodo para agragar los registros

    public void agregarData(ArrayList<Profesor> list) {
        //for para recorrer la lista Profesor
        for (int i = 0; i < list.size(); i++) {
            Profesor profesor = list.get(i);
            //agregamos en una variable la salida de ladata
            String data = String.format(" %s,%s,%s,%s,%s,%s,%s,%s", profesor.getCedula(), profesor.getNombres(), profesor.getZona(), profesor.getProvincia(), profesor.getCanton(), profesor.getPersonalidad(), profesor.getRazonamiento(), profesor.getDictamen());
            dataFinal.println(data);
        }
    }

    public void cerrarArchivo() {
        if (dataFinal != null) {
            dataFinal.close(); // cierra el archivo
        }
    }
 }