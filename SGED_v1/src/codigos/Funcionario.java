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
public class Funcionario extends Pessoa{
    private int numero;
    
    public Funcionario(){
        
    }

    public Funcionario(int numero, String nome, String BI, String sexo, int telefone, Endereco endereco) {
        super(nome, BI, sexo, telefone, endereco);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
