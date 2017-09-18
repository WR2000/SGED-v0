/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author William Ramos
 */
public class ClienteDAO {
    Connection conexao;
    
    //método guadrar para guardar os dados dos funcionarios
    public void guardar(Cliente cliente){
        
        try {
            
            String sql = "INSERT INTO cliente(nomeCli, telefoneCli, biCli, sexoCli) VALUES(?,?,?,?)";
            
            
            //recupaerar a conexao estabelecida
            conexao = Conexao.abrirConexao();
                        
            
            //
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,cliente.getNome());
            ps.setInt(2,cliente.getTelefone());
            ps.setString(3,cliente.getBI());
            ps.setString(4,cliente.getSexo());
            
            
            ps.executeUpdate();
            //System.out.println("Empregado inserido com sucesso!");
            JOptionPane.showMessageDialog(null,"Cliente inserido com sucesso!");
            conexao.close();
        } catch (SQLException ex) {
            //System.out.println("Erro ao inserir Empregado");
            JOptionPane.showMessageDialog(null,"Erro ao inserir Cliente!");
        }
    }
    
    public ArrayList<Cliente> listarTudo() {
       
       ArrayList<Cliente> clientes = new ArrayList<>();
       try {
          
           
           String listar = "SELECT * from cliente";
           Connection conexao = Conexao.abrirConexao();
           PreparedStatement ps = conexao.prepareStatement(listar);
           ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               Cliente cliente = new Cliente();
               cliente.setNumeroCli(rs.getInt("idcliente"));
               cliente.setNome(rs.getString("nomeCli"));
               clientes.add(cliente);
           }
           rs.close();
           ps.close();
           conexao.close();
       } catch (SQLException ex) {
           System.out.println("erro ao listar");
       }
       
      return  clientes;
   }
    
//    public static void main(String[] args) {
//        for (Cliente c : new ClienteDAO().listarTudo()) {
//            System.out.println(c.getNumeroCli());   
//        }
//    }
    
}
