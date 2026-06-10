package aqa_hw_10.db_practise;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class GetDataAndUse {

    public static void main(String[] args) {
        Map<String, String> usersData = new HashMap<>();

        String url = "";
        String user = "";
        String password = "";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            String sql = "SELECT login, password FROM palchyk_usersDataTable";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                String userEmail = result.getString("login");
                String userPassword = result.getString("password");
                usersData.put(userEmail, userPassword);
            }

            System.out.println("-----Obtained users are: " + usersData);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
