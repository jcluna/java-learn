package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    Connection connection;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "");
        } catch (Exception e) {
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
