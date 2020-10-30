/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appanela;

import java.util.Date;
import java.util.List;

public class Visitante extends Usuario {

   private char email;


    public Visitante(char email,char nome) {
        super(nome);
        this.email = email;
      }
   
    public static List<Receita> consultarReceitas(){
       return null;
        
    }    
    
    public static List<Ingrediente> consultarIngredientes(){
    return null;
        
    } 
    
    public static List<Categoria> consultarCategorias(){
       return null;        
    }
    
    public void consultarTop10(){
        
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }
    
    

}

  
   
   
   
