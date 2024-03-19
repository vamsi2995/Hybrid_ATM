package Hybrid.ATM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Con {
    Connection connection;
    Statement statement;
    Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HybridAtm","root","vamsi@30");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}