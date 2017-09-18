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
public class Casa {
    
    //ArrayList<Integer> arlq = new ArrayList<Integer>();
    
    private int id;
    private Cliente cliente;
    private Endereco endereco;
    
    public Casa(){
        
    }

    public Casa(int id, Cliente cliente, Endereco endereco) {
        this.cliente = cliente;
        this.endereco = endereco;
        this.id = id;
    }
    
          

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEnderecos(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Endereco getEnderecos() {
        return endereco;
    }

    public int getId() {
        return id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    

     
    
}