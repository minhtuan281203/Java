import java.sql.*;

public class RsetMetaData {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", ""
                );
                Statement statement = connection.createStatement();
                ){
            ResultSet rset = statement.executeQuery("select * from books");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numCols = rsetMD.getColumnCount();

            for (int i=1; i<= numCols; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println("---------");

            for (int i=1; i<= numCols; i++){
                System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i)+ ")");
            }
            System.out.println("---------");

            while (rset.next()){
                for (int i=1; i<= numCols; i++){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println("---");
            }
        }catch(SQLException exception){
            exception.printStackTrace();
        }
    }
}
