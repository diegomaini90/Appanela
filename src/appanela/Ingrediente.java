/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appanela;

import java.util.ArrayList;
import java.util.List;


public class Ingrediente {
    
    private char nomeIngrediente;
    private static List<Ingrediente> ingredientes = new ArrayList<>();

    public Ingrediente(char nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public char getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(char nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public static List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public static void setIngredientes(List<Ingrediente> ingredientes) {
        Ingrediente.ingredientes = ingredientes;
    }


    
    
    
}
