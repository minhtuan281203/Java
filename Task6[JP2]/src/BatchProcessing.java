import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", ""
                );
                Statement statement = connection.createStatement();
                ){
            connection.setAutoCommit(false);

            statement.addBatch("insert into books values (8001,'Java abc', 'Kevin', 1.1, 99)");
            statement.addBatch("insert into books values (8002,'Java xyz', 'Kevin', 1.1, 99)");
            statement.addBatch("update books set price =11.11 where id= 8001 or id= 8002");

            int[] returnCode = statement.executeBatch();
            System.out.println("Return code: ");

            for (int code: returnCode) {
                System.out.println(code);
            }
            System.out.println();
            connection.commit();

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
