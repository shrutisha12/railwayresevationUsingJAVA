package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UtilityMethod {
  public static Connection createconnection(String url, String username, String password){
      Connection connection= null;
      try {
         CustomVariable.connection = DriverManager.getConnection(url,username,password);
      } catch (SQLException e) {
          throw new RuntimeException(e);
      }
      System.out.println("DB Connected");
        return CustomVariable.connection;

    }
}
