package Hybrid.ATM;
import java.sql.*;
public class Connn {
    Connection connection;
    Statement statement;
    public Connn() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HybridAtm","root","vamsi@30");
            statement = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
