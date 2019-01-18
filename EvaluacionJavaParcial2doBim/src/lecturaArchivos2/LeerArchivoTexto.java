package lecturaArchivos2;

// Fig. 14.11: LeerArchivoTexto.java
// Este programa lee un archivo de texto y muestra cada registro.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;

public class LeerArchivoTexto {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo(String nomArch) {
        try {
            entrada = new Scanner(new File(nomArch));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo abrirArchivo

    // lee registro del archivo txt
    public ArrayList<Profesor> leerRegistrosData2() {

        OperacionData operacion = new OperacionData();
        ArrayList<Profesor> lista = new ArrayList<>();

        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                // se crea el objeto para leer Json
                Gson g = new Gson();
                String linea = entrada.nextLine();
                // se hace el proceso de transformación
                Profesor p = g.fromJson(linea, Profesor.class);
                lista.add(p);
                //System.out.println(p);

            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;
    } // fin del m�todo leerRegistrosData2
    // cierra el archivo y termina la aplicaci�n
    
    //lee registro de data1 archivo csv
    public ArrayList<Profesor> leerRegistrosData1() {
        OperacionData operacion = new OperacionData();
        ArrayList<Profesor> lista2 = new ArrayList<>();

        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                // realiza la lectura linea por linea
                String linea2 = entrada.nextLine();
                // se hace el proceso de transformación
                String[] lista_info = linea2.split(",");
                Profesor p = new Profesor(lista_info[0], lista_info[1], lista_info[2], lista_info[3], lista_info[4], lista_info[5], lista_info[6], lista_info[7]);
                lista2.add(p);
                //System.out.println(p);

            } // fin de while

        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista2;
    } // fin del m�todo leerRegistrosData2
    // cierra el archivo y termina la aplicaci�n

public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin de la clase LeerArchivoTexto

/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/
