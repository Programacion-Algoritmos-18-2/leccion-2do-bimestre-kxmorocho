package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {

    public static void main(String args[]) {
        //se crea un objeto de tipo aplicacion 
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        //con el objeto aplicacion abrims el metodo con el url dond se encuntra el archivo .csv
        aplicacion.abrirArchivo("data/data1.csv");
        //se crea otro objeto de tipo aplicacion2
        LeerArchivoTexto aplicacion2 = new LeerArchivoTexto();
        //con el objeto aplicacion abrims el metodo con el url dond se encuntra el archivo .txt
        aplicacion2.abrirArchivo("data/data2.txt");
        
        //se crea un objeto dew tipo operacion
        OperacionData operacion = new OperacionData();
        
        //se crea una lista para leer los registros de la data2 .txt
        ArrayList<Profesor> lista = aplicacion2.leerRegistrosData2();
        //se crea una lista para leer los registros de la data1 .csv
        ArrayList<Profesor> lista2 = aplicacion.leerRegistrosData1();
        
        //se crea una lista dond se almacenaran los datos de los dos archivos
        ArrayList<Profesor> list = new ArrayList<>();
        list.addAll(lista);
        list.addAll(lista2);
        
        //se agrega los registros a la data final
        operacion.agregarInformacion(list);
        // operacion.lecturaData();
        //se llama al metodo oedenar por canton 
        operacion.ordenarPorCanton();
        //se crea una nueva lista para ordenar por nombres
        ArrayList<Profesor> list1 = operacion.ordenarPorNombres();
        //se crea un objeto para crear el nuevo archivo con la data final
        CrearArchivo archivo_nuevo = new CrearArchivo();
        //se llama a los metodos dond esta la direccion, dond se agrega los datos d la data final
        archivo_nuevo.crearDataFinal();
        archivo_nuevo.agregarData(list);
        archivo_nuevo.cerrarArchivo();
        
        //se llama a los metodos para realizar el conteo segun las caracteristicas porsonalidad y dictamen respectivamente
        operacion.contarPorPersonalidad();
        operacion.contarPorDictamen();
        //System.out.println(lista2);
        // System.out.println("-------");
        // operacion.lecturaData();
        aplicacion.cerrarArchivo();
    } // fin de main
} // fin de la clase PruebaLeerArchivoTexto

