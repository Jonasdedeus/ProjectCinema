/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcinema;

import view.LoginForm;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Jonas de Deus Guterres
 */
public class ProjectCinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginForm gui = new LoginForm();
        gui.setVisible(true);
    }
    
    

}
