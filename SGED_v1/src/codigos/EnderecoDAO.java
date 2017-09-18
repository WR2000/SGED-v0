/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author William Ramos
 */
public class EnderecoDAO {
    
     Connection conexao;
    
    //método guadrar para guardar os dados dos funcionarios
    public void guardar(Endereco endereco){
        
        try {
            //variael que vai receber a instrução para inserir um novo funcionario na base de dados
            //String sql = "INSERT INTO endereco(idendereco, rua, casaNum, municipio) VALUES(null,?,?,?)";
            String sql = "INSERT INTO endereco(rua, casaNum, municipio) VALUES(?,?,?)";
            
            //recupaerar a conexao estabelecida
            conexao = Conexao.abrirConexao();
                        
            //
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,endereco.getRua());
            ps.setInt(2,endereco.getCasaNum());
            ps.setString(3,endereco.getMunicipio());
            ps.executeUpdate();
            //System.out.println("Endereço inserido com sucesso!");
            JOptionPane.showMessageDialog(null,"Endereço inserido com sucesso!");
            conexao.close();
        } catch (SQLException ex) {
            //System.out.println("Erro ao inserir endereço");
            JOptionPane.showMessageDialog(null,"Erro ao inserir Endereço");
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
    
    public Endereco buscarUltEndereco(){
        
               Endereco endereco = null;
               try {
            String sql = "SELECT * FROM endereco order by idendereco desc limit 1";
            
            conexao = Conexao.abrirConexao();
            
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                endereco = new Endereco();
                endereco.setId(rs.getInt(1));
            }

            conexao.close();
       
        } catch (SQLException ex) {
//            System.out.println("Erro ao eliminar endereço");
            JOptionPane.showMessageDialog(null,"Erro ao eliminar Endereço");
        }
           
         return endereco;
               
    }
    
    
    //esta foi a 1º tentativa
    /*
    
        private Connection con;
        
        public EnderecoDAO(Connection con){
            setCon(con);
        }
        
        public void setCon(Connection con){
            this.con = con;
        }
        
        public Connection getCon(){
            return con;
        }
        
        public String inserir(EnderecoDAO endereco){
            String sql = "insert into endereco values(?,?,?)";
            
            try {
                PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1, endereco.getRua());
                ps.setString(2, endereco.getCasaNum());
                ps.setString(3, endereco.getMunicipio());
            
                if(ps.executeUpdate() > 0){
                    return "Inserido com sucesso";
                } else{
                    return "Erro ao inserir";
                }
        }catch (SQLException e){
            return e.getMessage();
        }
}
        */
}