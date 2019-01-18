/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

import java.util.ArrayList;
import java.util.Collections;

public class OperacionData {

    ArrayList<Profesor> informacion = new ArrayList<>();

    public void agregarInformacion(ArrayList<Profesor> info) {
        //informacion = new ArrayList<Profesor>(info.subList(1, 4)); //solo para sacar d la data del 1 al 4
        //para sacar toda la data
        informacion = info; 
    }

    public ArrayList<Profesor> obtenerInformacion() {
        return informacion;
    }

    public double obtenerPromedioCapacidad() {
        double suma = 0;
        return suma;
    }
    
    // proceso de ordenar, a través del uso de Collections
    public void ordenarPorCanton(){
        ArrayList<Profesor> dataPorCantones = new ArrayList<>();
        dataPorCantones.addAll(informacion);
        Collections.sort(dataPorCantones, 
                        (o1, o2) -> o1.canton.compareTo(o2.canton));
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.println(dataPorCantones.get(i));
        }
    }
    // para ordenar por nombres
    public ArrayList<Profesor> ordenarPorNombres(){
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();
        dataPorNombres.addAll(informacion);
        Collections.sort(dataPorNombres, 
                        (o1, o2) -> o1.nombres.compareTo(o2.nombres));
        return dataPorNombres;
        
    }
    
    public void lecturaData() {
        for (int i = 0; i<obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));
            
        }
        
    }
    
    //Obtener cuantos Participantes de acuerdo a la característica personalidad
    public void contarPorPersonalidad(){
        //se declara e inicia variables para contadores para adecuado y por convocar
        int adecuado = 0;
        int convocar = 0;
        for (Profesor profe : informacion) {
            if (profe.getPersonalidad().equalsIgnoreCase("Adecuado")) {
                adecuado = adecuado +1;
            } else if(profe.getPersonalidad().equalsIgnoreCase("por convocar")){
                convocar = convocar +1;
            }
        }
        String cadena = String.format(" Adecuado:%d\n Por convocar:%d\n", adecuado, convocar);
        System.out.println(cadena);
    }

    public void contarPorDictamen(){
        //se declara e inicia variables para contadores para idoneo y no idoneo
        int idoneo = 0;
        int no_idoneo = 0;
        for (Profesor profe : informacion) {
            if (profe.getDictamen().equalsIgnoreCase("Idoneo")) {
                idoneo = idoneo +1;
            } else if (profe.getDictamen().equalsIgnoreCase("No Idoneo")){
                no_idoneo = no_idoneo + 1;
            }
        }
        String cadena = String.format(" Idoneo:%d\n No idoneo :%d\n", idoneo, no_idoneo);
        System.out.println(cadena);        
    }
}
