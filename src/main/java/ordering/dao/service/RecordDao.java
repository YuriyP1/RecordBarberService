package ordering.dao.service;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class RecordDao {

    private final static String URL = "jdbc:postgresql://localhost:5432/record_test";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "777";

    private static Connection connection;

    private int id;
    static {
        try {
            Class.forName("org.postgresql.Driver"); //подгружаем класс в ОЗУ
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void createRecord (String name, String phone, String email, String data, String time){

        try {
            Statement statement = connection.createStatement();
            String SQL = "INSERT INTO record VALUES (" + ++id + ",'"+name+"','"+phone+"','"+email+"','"
                    +data+"','"+time+"')";
            statement.executeUpdate(SQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
