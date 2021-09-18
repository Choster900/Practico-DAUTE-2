/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

/**
 *
 * @author 16ado
 */
public class ClsComboBoxModel {
    private int indice;
    private String valor;

    public ClsComboBoxModel() {
    }

    public ClsComboBoxModel(int indice, String valor) {
        this.indice = indice;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return valor;
    }
    
    
}
