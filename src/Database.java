import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:postgresql://localhost:5432/db_name";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private Connection connection;

    public void init() {
        try {
            // Установка соединения с базой данных
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    public void save(String data) {
        try {
            // Подготовка запроса на вставку данных
            String query = "INSERT INTO table_name(column_name) VALUES(?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, data);

            // Выполнение запроса
            statement.executeUpdate();
            System.out.println("Data saved successfully.");
        } catch (SQLException e) {
            System.out.println("Data save failure.");
            e.printStackTrace();
        }
    }

    public String load() {
        String result = null;
        try {
            // Подготовка запроса на выборку данных
            String query = "SELECT column_name FROM table_name";
            PreparedStatement statement = connection.prepareStatement(query);

            // Выполнение запроса и получение результата
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                result = resultSet.getString("column_name");
            }
        } catch (SQLException e) {
            System.out.println("Data load failure.");
            e.printStackTrace();
        }
        return result;
    }
}
