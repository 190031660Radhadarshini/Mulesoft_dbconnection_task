
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertRecords {
public static void main(String args[])
{
try
{
  Connection con = null;
  Driver c = new com.mysql.jdbc.Driver();
  DriverManager.registerDriver(c);
  System.out.println("Driver Class Loaded");

  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/Mulesoft","geethika","root");
  
  Statement smt1 = con.createStatement();
  Statement smt2 = con.createStatement();
  Statement smt3 = con.createStatement();
  String sql1 = "insert into Movies values('car gold','hershes','slevag','Michael Radford',2007)";
  String sql2 = "insert into Movies values('knight life',' johnos', sweden','Stephen Frears',2008)";
  String sql3 = "insert into Movies values('Tale of nine tailed','kurchules','yella','David Frankel',2019)";
    smt1.executeUpdate(sql1);
    smt2.executeUpdate(sql2);
    smt3.executeUpdate(sql3);
    System.out.println("Records Inserted successfully...");
  con.close();

}
catch(Exception e)
{
	System.out.println(e);
}
}
}