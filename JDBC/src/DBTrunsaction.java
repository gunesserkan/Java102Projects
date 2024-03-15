import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBTrunsaction {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "12345";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connection.setAutoCommit(false);
            addTableWithPreparedStatement(connection);
            connection.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addTableWithPreparedStatement(Connection connection) {
        String sql = "INSERT INTO student (student_name,student_class) VALUES(?,?)";
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Bedri");
            preparedStatement.setInt(2, 4);
            preparedStatement.executeUpdate();

            if (true) {
                throw new SQLException();
            }

            preparedStatement.setString(1, "İlhan");
            preparedStatement.setInt(2, 4);
            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
