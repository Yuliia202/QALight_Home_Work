package aqa_hw_10.db_practise;

import java.util.Map;

public class LocalStorage {

    public static Map<String, String> getUSerInfo() {
        return Map.of(
                "anton@example.com", "Password3",
                "ivan@example.com", "Password4",
                "bogdan@example.com", "Password5",
                "artem@example.com", "Password6",
                "semen@example.com", "Password7"
        );
    }

}