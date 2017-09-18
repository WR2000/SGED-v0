/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author William Ramos
 */
public class Conexao {
    
    //Tem conexão?? apenas teste
    /*
    public static void main(String []args){
        if(abrirConexao() != null){
            System.out.println("Temos conexão e não te esqueças de fecha-la!");
        }
        else{
            System.out.println("Não temos conexão!");
        }
    }
    
    */
    
    //Ou nao??? fim do teste
    
    public static Connection abrirConexao() 
    {
        Connection con = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://127.0.0.1/sgedomesticas?";
            url += "user=root&password=";
            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
        
    }
    
    public static void fecharConexao(Connection con) 
    {
        try {
            con.close();
            System.out.println("Conexão fechada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
