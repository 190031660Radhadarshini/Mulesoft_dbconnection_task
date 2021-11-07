import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display 
{
public static void main(String args[])
{
try
{
  Connection con = null;

  Driver d = new com.mysql.jdbc.Driver();
  DriverManager.registerDriver(d);
  System.out.println("Driver Class Loaded");


  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Mulesoft","radha","root");
  Statement stmt1 = con.createStatement();
  
  String sql1 = "select * from Movies";
  ResultSet rs = stmt1.executeQuery(sql1);
    while(rs.next()){
        System.out.print("Name: " + rs.getString("name"));
        System.out.print(", Actoress: " + rs.getString("actor"));
        System.out.print(", producer: " + rs.getString("netgross"));
        System.out.println(", Director: " + rs.getString("director"));
        System.out.println(", Year of Release : " + rs.getInt("year_of_release"));
     }

  con.close();





}
catch(Exception e)
{
System.out.println(e);
}
}
}
