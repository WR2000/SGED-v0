/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.ArrayList;

/**
 *
 * @author William Ramos
 */
public class Cliente extends Pessoa{
    
    private int numeroCli;
    
    ArrayList<Casa> casas = new ArrayList<>();
    
    public Cliente(){
        
    }

    public Cliente(int numero, String nome, String BI, String sexo, int telefone, Endereco endereco) {
        super(nome, BI, sexo, telefone, endereco);
        this.numeroCli = numero;
        
    }

    public int getNumeroCli() {
        return numeroCli;
    }

    public ArrayList<Casa> getCasas() {
        return casas;
    }

    public void setNumeroCli(int numeroCli) {
        this.numeroCli = numeroCli;
    }

    public void setCasas(ArrayList<Casa> casas) {
        this.casas = casas;
    }
    
    
    
    
    
}
