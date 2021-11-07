import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;


public class DBTable {
public static void main(String args[])
{
try
{
  Connection con = null;

  Driver d = new com.mysql.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");

  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Mulesoft","radha","root");
  
  Statement smt = con.createStatement();
  String sql = "CREATE TABLE Movies " +
            "(Name VARCHAR(255), " + " Actor VARCHAR(255), " + " producer VARCHAR(255), " + " Director VARCHAR(255), "+ " year_of_release INTEGER, " + " PRIMARY KEY (Name ))"; 
    smt.executeUpdate(sql);
    System.out.println("Table Created Successfully...");
  con.close();



  con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}