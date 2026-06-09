package aqa_hw_10.db_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        String user = "root";
        String password = "6Ztz3rsrVNeWfbCH";

        String sql = "CREATE TABLE IF NOT EXISTS palchyk_usersDataTable (" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "login VARCHAR(255) NOT NULL, " +
                "password VARCHAR(255) NOT NULL" +
                ");";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
