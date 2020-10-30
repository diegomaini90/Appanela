
package appanela;

public class Parceiro {
    
    private char nomeParceiro;
    private int CNPJ;
    private char endereco;
    private int telefone;
    private char preposto;
    private int numContrato;
    

    public Parceiro(char nomeParceiro, int CNPJ, char Endereco, int telefone, char preposto, int numContrato) {
        this.nomeParceiro = nomeParceiro;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.telefone = telefone;
        this.preposto = preposto;
        this.numContrato = numContrato;
        
    }

    public char getNomeParceiro() {
        return nomeParceiro;
    }

    public void setNomeParceiro(char nomeParceiro) {
        this.nomeParceiro = nomeParceiro;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public char getEndereco() {
        return endereco;
    }

    public void setEndereco(char Endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public char getPreposto() {
        return preposto;
    }

    public void setPreposto(char preposto) {
        this.preposto = preposto;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    
    
    
}
