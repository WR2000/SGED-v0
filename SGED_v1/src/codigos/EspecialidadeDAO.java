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
public class EspecialidadeDAO {
    Connection conexao;
    
    //método guadrar para guardar os dados dos funcionarios
    public void guardar(Especialidade especialidade){
        
        try {
            //variael que vai receber a instrução para inserir um novo funcionario na base de dados
            //String sql = "INSERT INTO endereco(idendereco, rua, casaNum, municipio) VALUES(null,?,?,?)";
            String sql = "INSERT INTO especialidade(nomeespecialidade, descricao) VALUES(?,?)";
            
            //recupaerar a conexao estabelecida
            conexao = Conexao.abrirConexao();
                        
            //
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,especialidade.getNome());
            ps.setString(2,especialidade.getDescricao());
            ps.executeUpdate();
            //System.out.println("Especialidade inserida com sucesso!");
            JOptionPane.showMessageDialog(null,"Especialidade inserida com sucesso!");
            conexao.close();
        } catch (SQLException ex) {
            //System.out.println("Erro ao inserir Especialidade");
            JOptionPane.showMessageDialog(null,"Erro ao inserir Especialidade");
        }
    }
    
    public void eliminar(int numero){
        try {
            String sql = "DELETE FROM especialidade WHERE idespecialidade = ?";
            
            conexao = Conexao.abrirConexao();
            
            PreparedStatement ps = conexao.prepareStatement(sql);            
            ps.setInt(1, numero);
            ps.executeUpdate();
            //System.out.println("Especialidade eliminada com sucesso!");
            JOptionPane.showMessageDialog(null,"Especialidade eliminada com sucesso!");
            conexao.close();
       
        } catch (SQLException ex) {
            //System.out.println("Erro ao eliminar especialidade");
            JOptionPane.showMessageDialog(null,"Erro ao eliminar Especialidade");
        }
    }
    
    public void alterar(String nomeNovo, int id){
        try {
            String sql = "update especialidade set nomeespecialidade = ? where idespecialidade = ?";
            
            conexao = Conexao.abrirConexao();
            
            PreparedStatement ps = conexao.prepareStatement(sql);            
            ps.setString(1, nomeNovo);
            ps.setInt(2, id);
            ps.executeUpdate();
            //System.out.println("Especialidade alterarda com sucesso!");
            JOptionPane.showMessageDialog(null,"Especialidade alterarda com sucesso!");
            conexao.close();
       
        } catch (SQLException ex) {
            //System.out.println("Erro ao alterar especialidade");
            JOptionPane.showMessageDialog(null,"Erro ao alterar Especialidade");
        }
    }
    
    public ArrayList<Especialidade> listarTudo() {
       
       ArrayList<Especialidade> especialidades = new ArrayList<>();
       try {
          
           
           String listar = "SELECT * from especialidade";
           Connection conexao = Conexao.abrirConexao();
           PreparedStatement ps = conexao.prepareStatement(listar);
           ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               Especialidade especialidade = new Especialidade();              
               especialidade.setNome(rs.getString("nomeespecialidade"));
               especialidades.add(especialidade);
           }
           rs.close();
           ps.close();
           conexao.close();
       } catch (SQLException ex) {
           System.out.println("erro ao listar");
       }
       
      return  especialidades;
   }
}
