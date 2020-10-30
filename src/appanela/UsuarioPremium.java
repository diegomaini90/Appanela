/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appanela;

import java.util.Date;
import java.util.List;

public class UsuarioPremium extends Usuario {

   private char email;
   private char genero;
   private Date dataNascimento;
   private int telefone;
   private int CPF;

    public UsuarioPremium(char email, char genero, Date dataNascimento, int telefone, int CPF, char nome) {
        super(nome);
        this.email = email;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.CPF = CPF;
    }
   
    public void cadastrar(){
        
    }
    
    //public static List<Tarefa> listar(
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
    
    public void favoritar(){
        
    }
    
    public void enviarReceitas(){
        
    }
    
    public void comentar(){
        
    }
       

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
 


}

  
   
   
   
