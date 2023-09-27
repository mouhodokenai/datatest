package com.example.datatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StockExchangeDB {
    // Блок объявления констант
    public static final String NAME_USER = "root";
    public static final String PASSWORD = "парольчик";
    public static final String URL = "jdbc:mysql://localhost:3306/hospital?serverTimezone=UTC";
    public static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    public static Connection connection;
    public static Statement statement;

    static {
        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(URL, NAME_USER, PASSWORD);
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException throwable) {
            throwable.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try {
            // Ваш код работы с базой данных

            // Пример запроса
            String query = "insert into должности values (5567, 'ннн', 9300)";

            statement.execute(query);

            // Обработка результата

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
