package org.vitorrenansd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public Connection getConnection() {
        Connection  connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/sistema_orcamento",
                    "postgres", "password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}