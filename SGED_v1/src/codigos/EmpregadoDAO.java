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
public class EmpregadoDAO {
    Connection conexao;
    
    //método guadrar para guardar os dados dos funcionarios
    public void guardar(Empregado empregado){
        
        try {
            //variael que vai receber a instrução para inserir um novo funcionario na base de dados
            String sql = "INSERT INTO empregado(numEmpregado, nomeempregado, telefone, bi, sexo) VALUES(?,?,?,?,?)";
            //String sql = "INSERT INTO empregado(numEmpregado, nomeempregado, telefone, bi, sexo, especialidade_idespecialidade, endereco_idendereco) VALUES(?,?,?,?,?,?,?)";
            //String sql = "INSERT INTO empregado(numEmpregado, nomeempregado, telefone, bi) VALUES(?,?,?,?)";
            //String last = "last_insert_id()";
//            String sql = "INSERT INTO empregado(numEmpregado, nomeempregado, telefone, bi, sexo, especialidade_idespecialidade) VALUES(?,?,?,?,?,?)";
            
            //recupaerar a conexao estabelecida
            conexao = Conexao.abrirConexao();
                        
            
            //
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,empregado.getNumero());
            ps.setString(2,empregado.getNome());
            ps.setInt(3,empregado.getTelefone());
            ps.setString(4,empregado.getBI());
            ps.setString(5,empregado.getSexo());
            //ps.setInt(6, empregado.getEspecialidade().getId());
            //ps.setInt(7, empregado.getEndereco().getId());
            
            //ps.setDate(6,empregado.getDataNasc());
            ps.executeUpdate();
            //System.out.println("Empregado inserido com sucesso!");
            JOptionPane.showMessageDialog(null,"Empregado inserido com sucesso!");
            conexao.close();
        } catch (SQLException ex) {
            //System.out.println("Erro ao inserir Empregado");
            JOptionPane.showMessageDialog(null,"Erro ao inserir Empregado");
        }
    }
    
    
    public void eliminar(int numero){
        try {
            String sql = "DELETE FROM empregado WHERE numEmpregado = ?";
            
            conexao = Conexao.abrirConexao();
            
            PreparedStatement ps = conexao.prepareStatement(sql);            
            ps.setInt(1, numero);
            ps.executeUpdate();
            //System.out.println("Funcionário eliminado com sucesso!");
            JOptionPane.showMessageDialog(null,"Empregado eliminado com sucesso!");
            conexao.close();
       
        } catch (SQLException ex) {
            //System.out.println("Erro ao eliminar Funcionário");
            JOptionPane.showMessageDialog(null,"Erro ao eliminar Empregado");
        }
    }
    
    public ArrayList<Empregado> listarTudo() {
       
       ArrayList<Empregado> empregados = new ArrayList<>();
       try {
          
           
           String listar = "SELECT * from empregado";
           Connection conexao = Conexao.abrirConexao();
           PreparedStatement ps = conexao.prepareStatement(listar);
           ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               Empregado empregado = new Empregado();
               empregado.setNumero(rs.getInt("numEmpregado"));
               empregado.setNome(rs.getString("nomeempregado"));
               empregados.add(empregado);
           }
           rs.close();
           ps.close();
           conexao.close();
       } catch (SQLException ex) {
           System.out.println("erro ao listar");
       }
       
      return  empregados;
   }
    
    
}
