package jdbc;
 
import java.sql.*;
import java.util.Scanner;
 

public class PreparedStatementDmlEx {
 
    public static void main(String[] args) {


        //step 1: register Driver class with DriverManager

        try
        {
    //    Class.forName("com.mysql.jdbc.Driver"); //deprecated
        Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }

        //step 2: ask SQL Connection from Driver Manager class, providing connction url,username,password
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restapi?useSSL=false","root","namrata");)
        {
            con.setAutoCommit(false);

            //step 3: get PreparedStatement object from Connection and pass sql statement to it for pre-compilation
    PreparedStatement pst = 
            con.prepareStatement("update student1 "
                    + "set studsurname=? "
                    + "where studid=?"); //pre-compiled  //insert into student1 values(?,?,?);


            int ct=2;
            Scanner sc = new Scanner(System.in);


            while(ct>0)
            {

              System.out.println("Enter student id:");
              int id = sc.nextInt();

              System.out.println("Enter student surname tht u wish to update for studid:"+id);
              String sn = sc.next();

              pst.setString(1,sn);
              pst.setInt(2,id);

              //step 4: fire/execute query on PreparedStatement object and collect the ResultSet object 
               int rowsupdated = pst.executeUpdate();

                 System.out.println("no of rows updated:"+rowsupdated);

              ct--;
            }                  

            if(!con.getAutoCommit())
            { con.commit(); }

              sc.close();
              pst.close();


             //after work is done all dml done set autocommit back to true 
              con.setAutoCommit(true);

             //fetch all rows and check if row is updated

            Statement st = con.createStatement();



              ResultSet rs = st.executeQuery("Select studid,studname,studsurname from student1");


              while(rs.next())
              {
                  //Use Resultset- getxxxx(column no) tpo fetch particular column value
                  int id = rs.getInt(1);

                  String name = rs.getString(2);

                  String surname = rs.getString(3);

                  System.out.println("id="+id+", name="+name+", surname="+surname);
              }

              rs.close();
              st.close();



              //connection is auto closed as u r using try with resource.
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }


 
    }
 
}