import java.sql.*;

public class DBConnection {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "12345";

    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //VERİ ÇEKME
            getResults(connection);
//            //Statement ile veri ekleme
//            addTableWithStatement(connection);
//            //Prepared Statement ile veri ekleme
//            addTableWithPreparedStatement(connection);
//            //Prepared statement ile update etme
//            updateWithPreparedSatement(connection);
            //Prepared Statement ile Delete işlemi
            deleteWithPreparedStatement(connection);
            deleteWithStatement(connection);
            getResults(connection);
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getResults(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM student";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.print("ID: " + resultSet.getInt("student_id") + " ");
            System.out.print("Name: " + resultSet.getString("student_name") + " ");
            System.out.println("Class: " + resultSet.getString("student_class"));
            System.out.println("########################################");
        }
        resultSet.close();
        statement.close();
    }

    public static void addTableWithStatement(Connection connection) throws SQLException {
        String sql = "INSERT INTO student (student_name,student_class) VALUES('ERAY',4)";
        Statement statement = connection.createStatement();
        System.out.println(statement.executeUpdate(sql));
        statement.close();
    }

    public static void addTableWithPreparedStatement(Connection connection) throws SQLException {
        String sql = "INSERT INTO student (student_name,student_class) VALUES(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Buğra");
        preparedStatement.setInt(2, 4);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void updateWithSatement(Connection connection) throws SQLException {
        String sql = "UPDATE student SET student_name='HAKAN' WHERE student_id=5";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
    }

    public static void updateWithPreparedSatement(Connection connection) throws SQLException {
        String sql = "UPDATE student SET student_name=? WHERE student_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Erdal");
        preparedStatement.setInt(2, 4);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    public static void deleteWithStatement(Connection connection) throws SQLException {
        String sql = "DELETE FROM student WHERE student_id=4";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        statement.close();
    }

    public static void deleteWithPreparedStatement(Connection connection) throws SQLException {
        String sql = "DELETE FROM student WHERE student_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 5);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
}
