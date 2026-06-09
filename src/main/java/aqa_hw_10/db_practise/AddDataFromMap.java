package aqa_hw_10.db_practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class AddDataFromMap {

    public static void main(String[] args) {
        Map<String, String> usersData = LocalStorage.getUSerInfo();

        String url = "";
        String user = "";
        String password = "";

        String sql = "INSERT INTO palchyk_usersDataTable (login, password) VALUES (?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            for(Map.Entry<String, String> userData : usersData.entrySet()) {
                preparedStatement.setString(1, userData.getKey());
                preparedStatement.setString(2, userData.getValue());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
