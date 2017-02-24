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
public class Restaurantes extends Lugares {

    String catergoria;
    int calificacion;

    public Restaurantes() {
        super();
    }

    public Restaurantes(String catergoria, int calificacion, String nombre,
            String direccion, int nivel_seguridad, Carretera entrada, Carretera salida) {
        super(nombre, direccion, nivel_seguridad, entrada, salida);
        this.catergoria = catergoria;
        this.calificacion = calificacion;
    }

    public String getCatergoria() {
        return catergoria;
    }

    public void setCatergoria(String catergoria) {
        this.catergoria = catergoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Restaurantes{" + "catergoria=" + catergoria + ", calificacion=" + calificacion + '}';
    }

}
