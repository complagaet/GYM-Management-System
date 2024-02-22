import java.sql.*;

public class Database {
    private Connection connection;
    private final String url;
    private final String user;
    private final String password;

    public Database(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void init() throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void save(String tableName, String[] columns, String[] values) throws SQLException {
        StringBuilder queryBuilder = new StringBuilder("INSERT INTO ");
        queryBuilder.append(tableName).append(" (");
        for (String column : columns) {
            queryBuilder.append(column).append(",");
        }
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);
        queryBuilder.append(") VALUES (");
        for (String value : values) {
            queryBuilder.append("'").append(value).append("',");
        }
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);
        queryBuilder.append(")");

        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(queryBuilder.toString());
            System.out.println("[BD] Accepted!");
        }
    }

    public ResultSet load(String tableName, String[] columns) throws SQLException {
        StringBuilder queryBuilder = new StringBuilder("SELECT ");
        for (String column : columns) {
            queryBuilder.append(column).append(",");
        }
        queryBuilder.deleteCharAt(queryBuilder.length() - 1);
        queryBuilder.append(" FROM ").append(tableName);

        Statement statement = connection.createStatement();
        return statement.executeQuery(queryBuilder.toString());
    }

    public void displayResultSet(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i) + ": " + resultSet.getString(i) + "\t");
            }
            System.out.println();
        }
    }

    public void close() throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}
