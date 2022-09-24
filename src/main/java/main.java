import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    public static void main (String [] args){
        Connection connection = null;
        String jdbc = "jdbc:mysql://localhost:3306/nacimientos";
        try {//Database logical
            connection = DriverManager.getConnection(jdbc,"root","Solvd2022");
            System.out.println("i`m in");

/*Except*/  } catch (SQLException sql){
            sql.printStackTrace();
        }

    }
}
