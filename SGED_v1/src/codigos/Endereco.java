/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

/**
 *
 * @author William Ramos
 */
public class Endereco {
    
    private int id;
    private String rua;
    private int casaNum;
    private String municipio;
    
    public Endereco(){
        
    }

    public Endereco(int id, String rua, int casaNum, String municipio) {
        this.id = id;
        this.rua = rua;
        this.casaNum = casaNum;
        this.municipio = municipio;
    }

    

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCasaNum(int casaNum) {
        this.casaNum = casaNum;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getRua() {
        return rua;
    }

    public int getCasaNum() {
        return casaNum;
    }

    public String getMunicipio() {
        return municipio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return municipio;
    }
    
    
}
