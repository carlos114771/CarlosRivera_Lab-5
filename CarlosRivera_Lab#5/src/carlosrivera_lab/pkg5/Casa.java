/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg5;

/**
 *
 * @author Usuario Dell
 */
public class Casa extends Lugares {

    public Casa() {
        super();
    }

    public Casa(String nombre, String direccion, int nivel_seguridad, Carretera entrada, Carretera salida) {
        super(nombre, direccion, nivel_seguridad, entrada, salida);
    }

    @Override
    public String toString() {
        return "Casa{" + '}';
    }

}
