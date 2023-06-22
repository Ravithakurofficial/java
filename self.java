import java.sql.*;

class DBConnectivity {
  public Connection CO;

  void makeConnection() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      CO = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/house",
        "root",
        "Ravgm@321"
      );
      System.out.println("Connected to the database.");
    } catch (Exception e) {
      System.out.println("Failed to connect to the database.");
      e.printStackTrace();
    }
  }
}

public class self {
  public static void main(String args[]) {
    DBConnectivity obj = new DBConnectivity();
    obj.makeConnection();
  }
}
