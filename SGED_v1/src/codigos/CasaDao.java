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
public class CasaDao {
    
    Connection conexao;
    
    //método guadrar para guardar os dados dos funcionarios
    public void guardar(Casa casa){
        
        try {
            //variael que vai receber a instrução para inserir um novo funcionario na base de dados
            //String sql = "INSERT INTO endereco(idendereco, rua, casaNum, municipio) VALUES(null,?,?,?)";
            String sql = "INSERT INTO casa(endereco_idendereco,cliente_idcliente) VALUES(?,?)";
            
            //recupaerar a conexao estabelecida
            conexao = Conexao.abrirConexao();
                        
            //
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,casa.getEndereco().getId());
            ps.setInt(2,casa.getCliente().getNumeroCli());
//            ps.setString(3,endereco.getMunicipio());
            ps.executeUpdate();
            //System.out.println("Endereço inserido com sucesso!");
            JOptionPane.showMessageDialog(null,"Casa inserida com sucesso!");
            conexao.close();
        } catch (SQLException ex) {
            //System.out.println("Erro ao inserir endereço");
            JOptionPane.showMessageDialog(null,"Erro ao inserir Casa" + ex.getMessage());
        }
    }
    
    public void eliminar(String rua, int casaN, String municipio){
        try {
            String sql = "DELETE FROM endereco WHERE rua = ? and casaNum = ? and municipio = ?";
            
            conexao = Conexao.abrirConexao();
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, rua);
            ps.setInt(2, casaN);
            ps.setString(3, municipio);
            //ps.setInt(1, numeroFuncionario);
            ps.executeUpdate();
            //System.out.println("Endereço eliminado com sucesso!");
            JOptionPane.showMessageDialog(null,"Endereço eliminado com sucesso!");
            conexao.close();
       
        } catch (SQLException ex) {
//            System.out.println("Erro ao eliminar endereço");
            JOptionPane.showMessageDialog(null,"Erro ao eliminar Endereço");
        }
    }
    
    
    }
