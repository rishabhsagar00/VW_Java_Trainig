package jdbc;
import java.sql.*;
 

public class  Derbyjdbc
{
 

    public static void main(String[] args) 
    {
        Connection con=null;
        Statement stat=null;
        String s;
        try
        {
 


        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");



     con=DriverManager.getConnection("jdbc:derby:namadbx;create=true;user=nama;password=nama");        



      System.out.println("The connection is successful.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
 

        try
        {
         stat=con.createStatement();
         s="create table student(Rollno int,Name varchar(50),serName varchar(50))";
         stat.executeUpdate(s);
        }
        catch(SQLException e)
        {   
            e.printStackTrace();
        }
 
         try
        {
         stat=con.createStatement();
         s="insert into student values(1,'Namrata','Marathe')";
         stat.executeUpdate(s);
          s="insert into student values(2,'Arjun','Marathe')";
         stat.executeUpdate(s);
          s="insert into student values(3,'Rahul','Marathe')";
         stat.executeUpdate(s);
 
        }
        catch(SQLException e)
        {   
            e.printStackTrace();
        }
 

        try
        {
          stat.close();
        }
        catch(SQLException e)
        {}
 
        System.out.println("create is successful:");
 
        try
        {
         stat=con.createStatement();
         s= "select * from student";
        ResultSet rset=stat.executeQuery(s);

        while(rset.next())
            System.out.println(rset.getInt(1)+" "+rset.getString(2)+"    "+rset.getString(3));
        }
        catch(SQLException e)
        {   
            e.printStackTrace();
        }

        try
        {
          stat.close();
        }
        catch(SQLException se)
        {

        }
 

    }
}