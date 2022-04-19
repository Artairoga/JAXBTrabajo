/*
    Autor:ArtaiRG
    Fecha:
    Ejercicio:


 */
package Vista;

import Modelo.Plato;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Artai
 */
public class VistaCarta {

    public static void main(String[] args) {
        int decision;
        String nomF = "Carta.xml";/*Nombre del xml*/
        String Precio, Desc, Kcal, Nombre, Tipo;
        try {
            ArrayList<Plato> ListaPlatos = Controlador.Gestion.CargarLista(nomF);/*Al inicio cargo la lista de platos guardada*/
            do {
                decision = Integer.parseInt(JOptionPane.showInputDialog("Que decision deseas tomar"
                        + "\n1.-Listar"
                        + "\n2.-Añadir"
                        + "\n3.-Modificar"
                        + "\n4.-Eliminar"
                        + "\n5.-Buscar"
                        + "\n0.-Salir"));
                switch (decision) {
                    case 1 -> {
                        /*Decision 1,listar*/
                        System.out.println("\n\n\n\n*****************************************");
                        System.out.println("Lista de platos:");
                        System.out.println(Controlador.Gestion.ListaPlatos(ListaPlatos));
                        System.out.println("*****************************************");
                    }
                    case 2 -> {
                        /*Decision 2,añadir*/
                        Nombre = JOptionPane.showInputDialog("Que Nombre tendra el plato*?");
                        Tipo = JOptionPane.showInputDialog("De que Tipo sera el plato?*");
                        Kcal = JOptionPane.showInputDialog("Que Kcal tendra el plato?");
                        Precio = JOptionPane.showInputDialog("Que precio tendra el plato*?");
                        Desc = JOptionPane.showInputDialog("Que Descripcion tendra el plato?");
                        if (Nombre.isEmpty() || Precio.isEmpty() || Tipo.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Error! Faltan datos necesarios(*)");
                        } else {
                            if (Objects.isNull(Controlador.Gestion.BuscarPlato(ListaPlatos, Nombre))) {
                                Plato PlatoTemporal = new Plato(Precio, Desc, Kcal, Nombre, Tipo);
                                Controlador.Gestion.AñadirPlato(ListaPlatos, PlatoTemporal);
                                System.out.println("\n\n\n\n*****************************************");
                                System.out.println("Nombre: " + PlatoTemporal.getNombre());
                                System.out.println("Tipo: " + PlatoTemporal.getTipo());
                                System.out.println("KCAL: " + PlatoTemporal.getCalorias());
                                System.out.println("Precio: " + PlatoTemporal.getPrecioeuros());
                                System.out.println("DESC: " + PlatoTemporal.getDescripcion());
                                System.out.println("*****************************************");
                            } else {
                                JOptionPane.showMessageDialog(null, "Error! PlatoDuplicado");
                            }
                        }
                    }
                    case 3 -> {
                        /*Decision 3,Modificar*/
                        Nombre = JOptionPane.showInputDialog("Que Nombre tiene el plato que deseas Modificar?");
                        Plato PlatoTemporal = Controlador.Gestion.BuscarPlato(ListaPlatos, Nombre);
                        if (Objects.isNull(PlatoTemporal)) {
                            System.out.println("No puedo modificar un plato que no existe!");
                        } else {
                            Nombre = JOptionPane.showInputDialog("Que Nombre tendra el plato*?");
                            Tipo = JOptionPane.showInputDialog("De que Tipo sera el plato?*");
                            Kcal = JOptionPane.showInputDialog("Que Kcal tendra el plato?");
                            Precio = JOptionPane.showInputDialog("Que precio tendra el plato*?");
                            Desc = JOptionPane.showInputDialog("Que Descripcion tendra el plato?");
                            if (Nombre.isEmpty() || Precio.isEmpty() || Tipo.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Error! Faltan datos necesarios(*)");
                            } else {
                                PlatoTemporal.setNombre(Nombre);
                                PlatoTemporal.setTipo(Tipo);
                                PlatoTemporal.setCalorias(Kcal);
                                PlatoTemporal.setPrecioeuros(Precio);
                                PlatoTemporal.setDescripcion(Desc);
                                System.out.println("\n\n\n\n*****************************************");
                                System.out.println("Nombre: " + PlatoTemporal.getNombre());
                                System.out.println("Tipo: " + PlatoTemporal.getTipo());
                                System.out.println("KCAL: " + PlatoTemporal.getCalorias());
                                System.out.println("Precio: " + PlatoTemporal.getPrecioeuros());
                                System.out.println("DESC: " + PlatoTemporal.getDescripcion());
                                System.out.println("*****************************************");
                            }
                        }
                    }

                    case 4 -> {
                        /*Decision 4,Eliminar*/
                        Nombre = JOptionPane.showInputDialog("Que Nombre tiene el plato que deseas eliminar?");
                        Plato PlatoTemporal = Controlador.Gestion.BuscarPlato(ListaPlatos, Nombre);
                        if (Objects.isNull(PlatoTemporal)) {
                            System.out.println("No puedo eliminar un plato que no existe!");
                        } else {
                            ListaPlatos.remove(PlatoTemporal);
                            System.out.println("Eliminado plato " + PlatoTemporal.getNombre());
                        }
                    }

                    case 5 -> {
                        Nombre = JOptionPane.showInputDialog("Que Nombre tiene el plato que  deseas buscar?");
                        Plato PlatoTemporal = Controlador.Gestion.BuscarPlato(ListaPlatos, Nombre);
                        if (Objects.isNull(PlatoTemporal)) {
                            System.out.println("No puedo mostrar un plato que no existe!");
                        } else {
                            System.out.println("\n\n\n\n*****************************************");
                            System.out.println("Nombre: " + PlatoTemporal.getNombre());
                            System.out.println("Tipo: " + PlatoTemporal.getTipo());
                            System.out.println("KCAL: " + PlatoTemporal.getCalorias());
                            System.out.println("Precio: " + PlatoTemporal.getPrecioeuros());
                            System.out.println("DESC: " + PlatoTemporal.getDescripcion());
                            System.out.println("*****************************************");
                        }
                    }
                    case 0 -> {
                        /*Decision 0,Salir*/
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Error La decision introducida no es valida");
                    }
                }

                if (decision == 2 || decision == 3 || decision == 0) {
                    /*Si la decision tomada es 2(añadir) o 3(eliminar) procedo a guardar los cambios,sino no es necesario*/
                    Controlador.Gestion.GuardarLista(ListaPlatos, nomF);
                }
            } while (decision != 0);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valores erroneos", "Dialog", JOptionPane.ERROR_MESSAGE);
            System.err.println(e);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error GENERAL", "Dialog", JOptionPane.ERROR_MESSAGE);
            System.err.println(e);
        }
    }
}
