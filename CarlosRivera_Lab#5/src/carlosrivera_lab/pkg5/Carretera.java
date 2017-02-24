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
public class Carretera {

    Lugares inicio;
    int numero;
    double kilimetros;
    Lugares finall;

    public Carretera() {
    }

    public Carretera(Lugares inicio, int numero, double kilimetros, Lugares finall) {
        this.inicio = inicio;
        this.numero = numero;
        this.kilimetros = kilimetros;
        this.finall = finall;
    }

    public Lugares getInicio() {
        return inicio;
    }

    public void setInicio(Lugares inicio) {
        this.inicio = inicio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getKilimetros() {
        return kilimetros;
    }

    public void setKilimetros(double kilimetros) {
        this.kilimetros = kilimetros;
    }

    public Lugares getFinall() {
        return finall;
    }

    public void setFinall(Lugares finall) {
        this.finall = finall;
    }

    @Override
    public String toString() {
        return "Carretera{" + "inicio=" + inicio + ", numero=" + numero + ", kilimetros=" + kilimetros + ", finall=" + finall + '}';
    }
    
}
