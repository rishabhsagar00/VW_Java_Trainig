package jdbc;
import java.sql.*;
//import javax.sql.*;
//import java.io.*;
class SResultsetDemo
{
    public static void main(String[] args) 
    {
         try{
//             Class.forName("com.mysql.cj.jdbc.Driver");
          Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            }
            catch(ClassNotFoundException e)
            {
               e.printStackTrace();
            }

         try (Connection con=DriverManager.getConnection("jdbc:derby:namadb;create=true;user=nama;password=nama");)   
//        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi?useSSL=false","root","namrata");)
        {

            System.out.println("The connection is successful.");

            try(Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);)
            {


                ResultSet rs= stmt.executeQuery("select * from student");
                //     while(rs.next())
                //     System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getInt(3));
                rs.last(); 
                System.out.println(rs.getString(2));
                rs.first();
                System.out.println(rs.getString(2)); 
 
                rs.absolute(2);
                System.out.println(rs.getString(2)); 

            }
            catch(Exception ce)
            {
                ce.printStackTrace();
             }
          }
         catch(SQLException e)
         {
              e.printStackTrace();
         }
      }

    }