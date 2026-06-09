package aqa_hw_10.db_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddData {

    public static void main(String[] args) {
        String url = "jdbc:mysql://109.197.216.90:13306/ATAM_db";
        String user = "root";
        String password = "6Ztz3rsrVNeWfbCH";

        String userEmail = "palchikgyy@gmail.com";
        String userPassword = "Password2";

        String sql = "INSERT INTO palchyk_usersDataTable (login, password) VALUES (?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userEmail);
            preparedStatement.setString(2, userPassword);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
