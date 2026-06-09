package aqa_hw_10;

import org.apache.commons.lang3.tuple.Pair;
import java.sql.*;
import java.util.Map;

public class DbDataProvider {

    public static Pair<String, String> getUserInfo() {
        String url = "";
        String user = "";
        String password = "";
        String sql = "SELECT login, password FROM palchyk_usersDataTable";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet result = statement.executeQuery(sql)) {

            if (result.next()) {
                String userEmail = result.getString("login");
                String userPassword = result.getString("password");
                return Pair.of(userEmail, userPassword);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null; // Повертаємо null, якщо дані не знайдено або сталася помилка
    }
}