package projetoDSI;

import java.sql.*;

public abstract class DBConnection {

    //conexão MySQL
    final private String driver = "com.mysql.jdbc.Driver";
    final private String url = "jdbc:mysql://localhost:3306/bd_dsi";
    final private String user = "admin"; //usuario root do MYSQL
    final private String password = "123"; //senha root do MYSQL

    // ClassNotFoundException: verifica se a biblioteca foi importada
    public Connection getMyDBConnection() throws ClassNotFoundException, SQLException {

        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }
}
    
// DriverManager: Gerenciador de driver
