package br.inf.ufg.atividadestestes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author João Pedro Salgado
 */
public class Leilao {
    
    private String descricao;
    private List<Lance> lances;
    
    public Leilao (String descricao){
       this.descricao = descricao;
       this.lances = new ArrayList<Lance>();
       
    }
    
    public void propoe(Lance lance){
    lances.add(lance); 
    }
    
    public String getDescricao(){
     return descricao;
    }
    
    public List<Lance> getLances(){
       return Collections.unmodifiableList(lances);
    }

}
