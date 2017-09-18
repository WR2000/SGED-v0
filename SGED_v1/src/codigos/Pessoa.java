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
public class Pessoa {
    private String nome;
    private String BI;
    private String sexo;
    private int telefone;
    private Endereco endereco;
    
    public Pessoa(){
        
    }

    public Pessoa(String nome, String BI, String sexo, int telefone, Endereco endereco) {
        this.nome = nome;
        this.BI = BI;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getBI() {
        return BI;
    }

    public String getSexo() {
        return sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBI(String BI) {
        this.BI = BI;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    //serve para visualizar string na comobox da interface
    @Override
    public String toString() {
        return nome;
    }
    
    
}
