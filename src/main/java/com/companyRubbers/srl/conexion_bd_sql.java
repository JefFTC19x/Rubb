package com.companyRubbers.srl;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class conexion_bd_sql
{
    Connection link_up = null;
   public Connection getConect(String b, String u, char [] p)
    {        
        try {
            
            //String cadena ="jdbc:sqlserver://localhost:1433;databaseName=Rubbers;user=rubbers;password=123";
            String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
                                   "databaseName="+b+";user="+u+";password="+String.valueOf(p)+";integratedSecurity=false;" +
                                   "encrypt=true;trustServerCertificate=true";
            link_up=DriverManager.getConnection(connectionUrl);
            JOptionPane.showMessageDialog(null,"Conexión Exitosa \nConectado a:"+b);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña \nIncorrecta");
            System.out.println(e.toString());
        }
        return link_up;
    }  
}
