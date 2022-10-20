package com.saojudas.aulabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String usuario="root";
    private String senha="mina";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "db_pessoas";
    
    public Connection obtemConexao(){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            // ou "jdbc:mysql://localhost:3306/db_pessoas"
            return c;
        }catch(SQLException e){
            return null;
        }
    }
}
