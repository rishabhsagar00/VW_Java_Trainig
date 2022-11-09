package jdbc;
import java.sql.*;
 
class Ex5 
{
          public static void main(String args[])
          {                                     
            try
            {
            //load driver Type IV
          //  Class.forName("com.mysql.cj.jdbc.Driver");
              Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

            System.out.println("class loaded");
             }
            catch(ClassNotFoundException e)
            {
                   e.printStackTrace();
            }

        // Connection con=DriverManager.getConnection(""jdbc:derby:namadb;create=true;user=nama;password=nama"");    
        //try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi?useSSL=false","root","namrata");)
            try(Connection con=DriverManager.getConnection("jdbc:derby:namadbx;create=true;user=nama;password=nama");    )
            {

            DatabaseMetaData md=con.getMetaData();

            System.out.println(md.getDatabaseProductName());
            System.out.println(md.getDatabaseProductVersion());
            System.out.println(md.getDriverName()+":"+md.getDriverVersion());


            boolean supports=md.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE);
            if(supports)
                System.out.println("supports scroll sensitive");
            else
                System.out.println("do not supports scroll sensitive");
 
            System.out.println("product name:"+md.getDatabaseProductName()); 
            System.out.println("product version:"+md.getDatabaseProductVersion());
            int iso=md.getDefaultTransactionIsolation(); 
            switch(iso)
            {
                case Connection.TRANSACTION_READ_COMMITTED:
                    System.out.println("Transaction read commited");
                    break;
                case Connection.TRANSACTION_READ_UNCOMMITTED: 
                    System.out.println("Transaction read uncommited");
                    break;
                case Connection.TRANSACTION_REPEATABLE_READ:
                    System.out.println("Transaction repeatable read");
                    break;
                case Connection.TRANSACTION_SERIALIZABLE: 
                    System.out.println("Transaction Serializable");
                    break;
            }
 
            String DriverName=md.getDriverName();
            System.out.println("DriverName:"+DriverName);

            //Transaction_isolation_level  - set for a database
            con.setAutoCommit(false);


            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE );

            ResultSet rs;
        //    rs= stmt.executeQuery("select * from student1");
            rs= stmt.executeQuery("select * from student");
 
        

            while(rs.next())
            {
                System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
            }
 
            int type=rs.getType();
            switch(type)
            {
                case ResultSet.TYPE_FORWARD_ONLY:
                    System.out.println("Type forward only");
                    break;
                case ResultSet.TYPE_SCROLL_SENSITIVE:
                    System.out.println("Type scroll sensitive");
                    break;
                case ResultSet.TYPE_SCROLL_INSENSITIVE:
                    System.out.println("Type scroll insensitive");
                    break;
            }
 
            type=rs.getConcurrency();
            switch(type)
            {
                case ResultSet.CONCUR_READ_ONLY:
                    System.out.println("CONCUR READ ONLY");
                    break;
                case ResultSet.CONCUR_UPDATABLE:
                    System.out.println("CONCUR UPDATABLE");
                    break;
            }

 
 
            rs.first();
            rs.updateInt(1,130); // updates the 
            rs.updateString(2,"gggg");
              // NAME column of row 5 to be AINSWORTH
            rs.updateRow(); // updates the row in the data source*/

            System.out.println("Displaying first again");
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));

            rs.last();
            System.out.println("Displaying last again");
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
        //inserting

            rs.absolute(2);
            System.out.println("Displaying 2nd row");
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));
 

            rs.moveToInsertRow();
            rs.updateInt(1,26);
            rs.updateString(2,"abd");
            rs.updateString(3,"ccc");
            rs.insertRow();
            System.out.println ("record inserted");

            rs.last();
            System.out.println("Displaying last again");
            System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3));

            con.commit();
            con.setAutoCommit(true);
            con.close();
 
           // rs.beforeFirst();   

          }
          catch(SQLException ob)
          {int no=ob.getErrorCode();
            System.out.println("error code:"+no);
            ob.printStackTrace();
          }
          catch(Exception e)
          {System.out.println("not a sql exception");
          e.printStackTrace();
          }

              }
 
}