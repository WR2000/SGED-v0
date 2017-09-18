/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.util.Date;

/**
 *
 * @author William Ramos
 */
public class Empregado extends Funcionario{
    private Date dataNasc;
    private Especialidade especialidade;
    
    public Empregado(){        
    }

    public Empregado(int numero, String nome, String BI, String sexo, int telefone, Endereco endereco, Date dataNasc, Especialidade especialidade) {
        super(numero, nome, BI, sexo, telefone, endereco);
        this.dataNasc = dataNasc;
        this.especialidade = especialidade;
    }

   

    public Date getDataNasc() {
        return dataNasc;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
//    @Override
//    public int getNumero(){
//        return n
//    }
    
    
}
