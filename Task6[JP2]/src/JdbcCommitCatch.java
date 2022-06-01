import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCommitCatch {
    public static void main(String[] args) throws SQLException {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement statement = connection.createStatement();
                ){
            try{
                connection.setAutoCommit(false);

                statement.executeUpdate("insert into books values(4001,'amatrap', 'maroc11', 4.4, 4)");

                statement.executeUpdate("insert into books values(4001,'Peter boo', 'maroc12', 4.4, 4)");
                connection.commit();
            }catch (SQLException ex){
                System.out.println("---Rolling back changes---");
                connection.rollback();
                ex.printStackTrace();
            }
        }
    }
}
