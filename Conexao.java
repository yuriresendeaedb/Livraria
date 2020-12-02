package Conexao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    
    public Statement stmt;
    public Connection con;

    public void Conectar(){
        try{
            Class.forName ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url ="jdbc:sqlserver://DESKTOP-6146KCV\\SQLEXPRESS:1433;"
                    + "databaseName=LIVRARIA";
            
            Connection con = DriverManager.getConnection(url, "Yuri", "yUri321");
            
            this.stmt = con.createStatement();
            
            }catch(HeadlessException | ClassNotFoundException | SQLException e){
                
                JOptionPane.showMessageDialog(null, e);
                
            }
    }
}