/*
    Autor:ArtaiRG
    Fecha:
    Ejercicio:


 */
package Controlador;

import Modelo.Carta;
import Modelo.Plato;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Artai
 */
public class Gestion {
    
    public static ArrayList<Plato> CargarLista(String nomF) throws JAXBException {
        /*Creamos una lista,cogemos el fichero que le pasamos y a partir de dicho fichero extraemos los platos del mismo*/
        ArrayList<Plato> ListaPlatos;
        File fichero = new File("./src/Datos/" + nomF);
        if (fichero.exists() && fichero.isFile()) {/*Comprobamos que el fichero existe y que es un archivo*/
            JAXBContext contexto = JAXBContext.newInstance(Carta.class);
            Unmarshaller u = contexto.createUnmarshaller();
            Carta e=(Carta) u.unmarshal(fichero);
            ListaPlatos=(ArrayList<Plato>) e.getPlato(); 
        }else{/*Si el fichero no existe creamos una lista vacia para poder trabajar con ella*/
            ListaPlatos=new ArrayList<Plato>();
        }
        return ListaPlatos;
    }
    
    public static Plato BuscarPlato(ArrayList<Plato> ListaPlatos,String Nombre){
        /*Buscamos el plasto en una lista con el foreach,si lo encuentra devuelve 
        el plato sino lo encuentra devuelve null,que lo gestionaremos desde donde fue llamado*/
        for (Plato ListaPlato : ListaPlatos) {
            if(ListaPlato.getNombre().toLowerCase().equals(Nombre.toLowerCase())){
                return ListaPlato;
            }
        }
        return null;
    }
    
    public static void GuardarLista(ArrayList<Plato> ListaPlatos,String nomF) throws JAXBException{
        /*Creamos una carta,a esta le añadimos el array de platos,
        "creamos" el fichero,si existe lo borramos para poder sobreescribirlo,sino guardamos la informacion*/
        Carta carta=new Carta();
        carta.setPlato(ListaPlatos);
        File fichero = new File("./src/Datos/" + nomF);
        if(fichero.exists()){
            fichero.delete();
        }
        JAXBContext contexto=JAXBContext.newInstance(Carta.class);
        Marshaller marshallerObj = contexto.createMarshaller();
        marshallerObj.marshal(carta, fichero);
    }
    
    public static String ListaPlatos(ArrayList<Plato> ListaPlatosTemporal) throws JAXBException{
        /*Cojemos la lista y la mostramos*/
        String ListaPlatos="";
        if(!ListaPlatosTemporal.isEmpty()){
            for (Plato plato : ListaPlatosTemporal) {
                ListaPlatos=ListaPlatos+"\t"+plato.getNombre()+"\n";
            }
        }else{
           ListaPlatos="Vacia!"; 
        }
        return ListaPlatos;
    }
    
    public static void AñadirPlato(ArrayList<Plato> ListaPlatos,Plato platoTemporal){
        /*Metodo muy sencillo,tal vez no perfecto*/
        ListaPlatos.add(platoTemporal);
    }
    
}
