/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import interfaces.Login;

/**
 *
 * @author William Ramos
 */
public class SGED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Login login = new Login(); //criando um objecto do tipo MenuPrincipal
                login.setVisible(true); //colocar visivel
      //        menuprincipal.setLocationRelativeTo(null); // esta linha de código serve para centralizar o menú principal
    }
    
}
