package org.vitorrenansd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import io.github.cdimascio.dotenv.Dotenv;

public class ConnectionDB {
     // Carrega o .env automaticamente
    private static final Dotenv dotenv = Dotenv.load();

    // Tenta a conexao ao banco
    public Connection getConnection() {
        Connection connection = null;

        try {
            String url = dotenv.get("DB_URL");
            String user = dotenv.get("DB_USER");
            String password = dotenv.get("DB_PASSWORD");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
}