import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BT1Test {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/listbook", "root",""
                );
                Statement stmt = connection.createStatement();
        ){
        String sqlDelete = "delete from books where id>8000";
        int countDeleted = stmt.executeUpdate(sqlDelete);

        String sqlInsert = "insert into books values "
                + "(8001,'Java Code','Dang kim thi', 15.55, 55),"
                + "(8002,'Java Advanced', 'James Gosling', 25.55, 55)";
        int countInserted = stmt.executeUpdate(sqlInsert);

        sqlInsert = "insert into books(id, title, author) values (2001,'Java JDBC MySQL','ThiDK')";
        countInserted = stmt.executeUpdate(sqlInsert);

        sqlDelete = "delete from books where id=2001";
        countDeleted = stmt.executeUpdate(sqlDelete);

        sqlInsert = "insert into books values(1000,'no name', 'no author', 12.2, 20)";
        countInserted = stmt.executeUpdate(sqlInsert);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
