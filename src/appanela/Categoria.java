
package appanela;

import java.util.ArrayList;
import java.util.List;


public class Categoria {
    
    private char nomeCategoria;
    private static List<Categoria> categorias = new ArrayList<>();   

    public Categoria(char nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public char getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(char nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public static List<Categoria> getCategorias() {
        return categorias;
    }

    public static void setCategorias(List<Categoria> categorias) {
        Categoria.categorias = categorias;
    }
    
}
