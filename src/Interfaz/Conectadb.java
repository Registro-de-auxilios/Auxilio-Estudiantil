/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;



 

import java.sql.*;
import javax.swing.JOptionPane;


public class Conectadb{

    public String db = "db.sqlite";
    public String url = "jdbc:sqlite:"+db;
    public String user = "root";
    public String pass = "";

    Statement stmt;
    public Connection Conectar(){

       Connection link = null;

       try{

           Class.forName("org.sqlite.JDBC");

           link = DriverManager.getConnection(this.url, this.user, this.pass);
           stmt= link.createStatement();
       }catch(Exception ex){

           JOptionPane.showMessageDialog(null, ex);

       }

        return link;
        
        
   }
    

}