
package appanela;

import java.util.ArrayList;
import java.util.List;



public class Receita {
    
    private char nomeReceita;
    private char categoria;
    private char ingrediente;
    private char complexidade;
    private final List<Receita> receitas = new ArrayList<>();

    public Receita(char nomeReceita, char categoria, char ingrediente, char complexidade) {
        this.nomeReceita = nomeReceita;
        this.categoria = categoria;
        this.ingrediente = ingrediente;
        this.complexidade = complexidade;
    }
        
    public static List<Receita> buscarReceitas(){
       return null;
        
    }    
    
    public static List<Ingrediente> buscarIngredientes(){
    return null;
        
    } 
    
    public static List<Categoria> buscarCategorias(){
       return null;        
    }
    
    public void buscarComplexidade(){
        
    }    
    
    public void incluirReceitas(){
        
    }
    
    public char getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(char nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public char getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(char ingrediente) {
        this.ingrediente = ingrediente;
    }

    public char getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(char complexidade) {
        this.complexidade = complexidade;
    }
    
    
    

    
    
}
