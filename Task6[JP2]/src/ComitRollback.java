import java.sql.*;

public class ComitRollback {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", ""
                );
                Statement statement = connection.createStatement();
                ){
            //
            connection.setAutoCommit(false);

            ResultSet resultSet = statement.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-----Before update-----");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+ ","+ resultSet.getInt("qty"));
            }
            //commit sel
            connection.commit();

            statement.executeUpdate("update books set qty = qty + 1 where id = 1001");
            statement.executeUpdate("update books set qty = qty + 1 where id = 1002");
            connection.commit();

            resultSet = statement.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-----After update commit-----");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+","+ resultSet.getInt("qty"));
            }
            connection.commit();

            //use rollback
            statement.executeUpdate("update books set qty = qty - 99 where id = 1001");
            statement.executeUpdate("update books set qty = qty - 99 where id = 1002");
            connection.commit();

            resultSet = statement.executeQuery("select id, qty from books where id in (1001, 1002)");
            System.out.println("-----After update rollback-----");
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+","+ resultSet.getInt("qty"));
            }
            connection.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
