
package appanela;

import java.util.Date;

public class Historico {
    
    private String tipoConsulta;
    private Date dataConsulta;

    public Historico(String tipoConsulta, Date dataConsulta) {
        this.tipoConsulta = tipoConsulta;
        this.dataConsulta = dataConsulta;
    }
    
    public void gravar(String tipoConsulta){
        
    }
    
    public void exibir (String tipoConsulta){
        
    }
    
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    
    
    
}
