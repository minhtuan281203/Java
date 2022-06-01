import java.sql.*;
import java.util.Scanner;

public class BT1Test {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/listbook", "root",""
                );
                Statement stmt = connection.createStatement();
        ){
        String sqlDelete = "delete from books where id>8000";
            System.out.println("sql statement: "+ sqlDelete);
        int countDeleted = stmt.executeUpdate(sqlDelete);

        String sqlInsert = "insert into books values "
                + "(8001,'Java Code','Dang kim thi', 15.55, 55),"
                + "(8002,'Java Advanced', 'James Gosling', 25.55, 55)";
            System.out.println("sql statement: "+ sqlInsert);
        int countInserted = stmt.executeUpdate(sqlInsert);

        sqlInsert = "insert into books(id, title, author) values (2001,'Java JDBC MySQL','ThiDK')";
            System.out.println("sql statement: "+ sqlInsert);
        countInserted = stmt.executeUpdate(sqlInsert);

        sqlDelete = "delete from books where id=2001";
            System.out.println("sql statement: "+ sqlDelete);
        countDeleted = stmt.executeUpdate(sqlDelete);
//             //
            Scanner ip = new Scanner(System.in);
            System.out.println("enter sql: ");
            String ne = ip.nextLine();

            String iser = "insert into books values"+ne;
            int countUser = stmt.executeUpdate(iser);
            System.out.println("sql statement: " + iser +"\n");

            String strSelect = "select * from books";
            System.out.println("sql statement:"+ strSelect+"\n");
            ResultSet resultSet = stmt.executeQuery(strSelect);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+","
                        +resultSet.getString("title")+","
                        +resultSet.getString("author")+","
                        +resultSet.getFloat("price")+","
                        +resultSet.getInt("qty"));
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
