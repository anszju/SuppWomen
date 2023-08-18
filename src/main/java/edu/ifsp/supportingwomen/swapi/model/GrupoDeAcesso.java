package edu.ifsp.supportingwomen.swapi.model;

public interface GrupoDeAcesso {
    String TEMAGRUPO1 = "Dependencia";
    String TEMAGRUPO2 = "Violencia fisica";
    String TEMAGRUPO3 = "Violencia moral";
    String TEMAGRUPO4 = "Violencia pscologica";
    String TEMAGRUPO5 = "Assedio";
    
    
    public String recupera();
    public void adiciona(String grupo);
}
