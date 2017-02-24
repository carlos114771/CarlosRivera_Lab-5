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
public class Canchas extends Lugares {

    String categoria;
    String estado;

    public Canchas() {
        super();
    }

    public Canchas(String categoria, String estado, String nombre, String direccion,
            int nivel_seguridad, Carretera entrada, Carretera salida) {
        super(nombre, direccion, nivel_seguridad, entrada, salida);
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + "Canchas{" + "categoria=" + categoria + ", estado=" + estado + '}';
    }

}
