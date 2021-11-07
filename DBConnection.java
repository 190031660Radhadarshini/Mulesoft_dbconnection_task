import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {

public static void main(String args[])
{
try
{
  Connection con = null;
  Driver d = new com.mysql.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");

  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/","radha","root");
  
  Statement stmt = con.createStatement();
  String sql = "create database Mulesoft";
    stmt.executeUpdate(sql);
    System.out.println("successfully Database created");
  con.close();

}
catch(Exception e)
{
System.out.println(e);
}
}
}