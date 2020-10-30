
package appanela;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private char nome;
    private List<Receita> receitas = new ArrayList<>();
   

    public Usuario(char nome) {
        this.nome = nome;
    }

    public char getNome() {
        return nome;
    }

    public void setNome(char nome) {
        this.nome = nome;
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    

    
        
}
