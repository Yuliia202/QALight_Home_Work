package aqa_hw_10.db_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RemoveTable {

    public static void main(String[] args) {
        String url = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        String user = "root";
        String password = "6Ztz3rsrVNeWfbCH";

        String sql = "DROP TABLE IF EXISTS palchyk_usersDataTable";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}