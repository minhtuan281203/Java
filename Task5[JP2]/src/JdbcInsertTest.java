import java.sql.*;

public class JdbcInsertTest {
    public static void main(String[] args) {
        try (
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", ""
                );
                Statement stmt = connection.createStatement();
        ){
            //delete
          String sqlDelete = "delete from books where id>=1000 and id<2000";
            System.out.println("1. sql statement:"+ sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted+" record deleted.\n");
          //insert a record
            String sqlInsert = "insert into books values(1001,'December','Tuan', 10000, 3)";
            System.out.println("2. sql statement:"+ sqlInsert+"\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " record inserted.");
            // insert records
            sqlInsert = "insert into books values "
                    + "(1002,'tieu thuyet','John men', 1000,2),"
                    + "(1003,'alat','Madam jun', 5000,1)";
            System.out.println("3. sql statement:"+ sqlInsert+"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " record inserted.");

            //insert a partial record
            sqlInsert = "insert  into books(id, name, author) values (1004,'titanic','Telanas')";
            countInserted = stmt.executeUpdate(sqlInsert);
            //select to check the changes
            String strSelect = "select * from books";
            System.out.println("sql statement:"+ strSelect+"\n");
            ResultSet resultSet = stmt.executeQuery(strSelect);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+","
                        +resultSet.getString("name")+","
                        +resultSet.getString("author")+","
                        +resultSet.getFloat("price")+","
                        +resultSet.getInt("qty"));
            }
        } catch(SQLException ex){
            ex.printStackTrace();
        }
    }
}
