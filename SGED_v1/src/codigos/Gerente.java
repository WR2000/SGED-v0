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
public class Gerente extends Funcionario{
    
    private int senha;

    public Gerente(int senha, int numero, String nome, String BI, String sexo, int telefone, Endereco endereco) {
        super(numero, nome, BI, sexo, telefone, endereco);
        this.senha = senha;
    }
    
    
}
