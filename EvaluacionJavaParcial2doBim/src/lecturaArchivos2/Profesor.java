/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;

/**
 *
 * @author reroes
 */
/*
{"cedula":"1803742806","nombres":"MULLO ROMERO ESTHER DEL CARMEN", 
"zona":"ZONA 3","provincia":"TUNGURAHUA", 
"canton":"AMBATO", "personalidad": "POR CONVOCAR", 
"razonamiento":"POR CONVOCAR", 
"dictamenIdoniedad":"NO IDONEO"}
*/

public class Profesor {
    String cedula;
    String nombres;
    String zona;
    String provincia;
    String canton;
    String personalidad;
    String razonamiento;
    String dictamenIdoniedad;

    //contructor de los atributos de la clase porfesor
    public Profesor(String cedu, String nomb, String zona, String provin, String canton, String pers, String razonam, String dictamen){
        cedula = cedu;
        nombres = nomb;
        this.zona = zona;
        provincia = provin;
        this.canton = canton;
        personalidad = pers;
        razonamiento = razonam;
        dictamenIdoniedad = dictamen;      
    }
    //Metodos geet y set para cada uno de los atributos
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedu) {
        cedula = cedu;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nomb) {
        nombres = nomb;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        zona = zona;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provin) {
        provincia = provin;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        canton = canton;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String pers) {
        personalidad = pers;
    }

    public String getRazonamiento() {
        return razonamiento;
    }

    public void setRazonamiento(String razonam) {
        razonamiento = razonam;
    }

    public String getDictamen() {
        return dictamenIdoniedad;
    }

    public void setDictamen(String dictamen) {
        dictamenIdoniedad = dictamen;
    }
    
    //metodo para presentar los datos
    public String toString(){
        return String.format("%s - %s - %s - %s \n", cedula, nombres, zona, canton);
    }
}







