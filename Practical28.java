import java.sql.*;

class DBConnectivity {

  public Connection CO;

  void makeConnection() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection CO =DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/house",
          "root",
          "Ravgm@321"
        );
    } catch (Exception Ee) {
      System.out.println("System fail to connect");
    }
  }

  void displayFirst() {
    try {
      ResultSet RS;
      Statement SMT;
      SMT = CO.createStatement();
      String QU = "SELECT * FROM house";
      RS = SMT.executeQuery(QU);
      RS.first();
      System.out.println(
        RS.getInt("H_NO") +
        RS.getString("H_LOCALITY") +
        RS.getInt("H_ROOMS") +
        RS.getString("H_OWNER")
      );

      RS.close();
      SMT.close();
    } catch (Exception Ee) {
      System.out.println(Ee);
    }
  }

  void displayThird() {
    try {
      ResultSet RS;
      Statement SMT;
      SMT = CO.createStatement();
      String QU = "SELECT * FROM house";
      RS = SMT.executeQuery(QU);
      RS.absolute(3);
      System.out.println(
        RS.getInt("H_NO") +
        RS.getString("H_LOCALITY") +
        RS.getInt("H_ROOMS") +
        RS.getString("H_OWNER")
      );
      RS.close();
      SMT.close();
    } catch (Exception Ee) {
      System.out.println(Ee);
    }
  }

  void displayLast() {
    try {
      ResultSet RS;
      Statement SMT;
      SMT = CO.createStatement();
      String QU = "SELECT * FROM house";
      RS = SMT.executeQuery(QU);
      RS.last();
      System.out.println(
        RS.getInt("H_NO") +
        RS.getString("H_LOCALITY") +
        RS.getInt("H_ROOMS") +
        RS.getString("H_OWNER")
      );

      RS.close();
      SMT.close();
    } catch (Exception Ee) {
      System.out.println(Ee);
    }
  }

  void closeConnection() {
    try {
      CO.close();
    } catch (Exception Ee) {
      System.out.println(Ee);
    }
  }

  void displayNextAll() {
    try {
      Statement SMT;
      ResultSet RS;
      SMT = CO.createStatement();
      String QU = "SELECT * FROM house";
      RS = SMT.executeQuery(QU);
      RS.first();
      System.out.println(
        RS.getInt("H_NO") +
        RS.getString("H_LOCALITY") +
        RS.getInt("H_ROOMS") +
        RS.getString("H_OWNER")
      );
      while (RS.next()) {
        System.out.println(
          RS.getInt("H_NO") +
          RS.getString("H_LOCALITY") +
          RS.getInt("H_ROOMS") +
          RS.getString("H_OWNER")
        );
      }

      RS.close();
      SMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught for Next.....");
    }
  }

  void displayPreviousAll() {
    try {
      Statement SMT;
      ResultSet RS;
      SMT = CO.createStatement();
      String QU = "SELECT * FROM HOUSE";
      RS = SMT.executeQuery(QU);
      RS.last();
      System.out.println(
        RS.getInt("H_NO") +
        RS.getString("H_LOCALITY") +
        RS.getInt("H_ROOMS") +
        RS.getString("H_OWNER")
      );
      while (RS.previous()) {
        System.out.println(
          RS.getInt("H_NO") +
          RS.getString("H_LOCALITY") +
          RS.getInt("H_ROOMS") +
          RS.getString("H_OWNER")
        );
      }

      RS.close();
      SMT.close();
    } catch (Exception Ee) {
      System.out.println("Exception Caught for Next.....");
    }
  }
}

public class Practical28 {

  public static void main(String args[]) {
    DBConnectivity Obj = new DBConnectivity();
    Obj.makeConnection();
    System.out.println("DIPSLAYING FIRST RECORD ");
    Obj.displayFirst();
    System.out.println("DIPSLAYING THIRD RECORD ");
    Obj.displayThird();
    System.out.println("DIPSLAYING LAST RECORD ");
    Obj.displayLast();
    System.out.println("DIPSLAYING ALL RECORDS ");
    Obj.displayNextAll();
    System.out.println("DIPSLAYING ALL RECORDS ");
    Obj.displayPreviousAll();
    Obj.closeConnection();
  }
}