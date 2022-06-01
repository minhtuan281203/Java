import java.sql.*;

public class PreparedStmt {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop", "root", ""
                );
                PreparedStatement pstmt  = connection.prepareStatement("insert into books values(?,?,?,?,?)");
                PreparedStatement pstmtSelect = connection.prepareStatement("select * from books ");
                ){
            pstmt.setInt(1, 7001);
            pstmt.setString(2,"Mahjong 101");
            pstmt.setString(3, "Kumar");
            pstmt.setDouble(4, 88.8);
            pstmt.setInt(5, 88);

            int rowInserted = pstmt.executeUpdate();
            System.out.println(rowInserted + " rows inserted.");

            pstmt.setInt(1, 7002);
            pstmt.setString(2, "Mahjong 102");
            //no change value for parameter 3 to 5
            rowInserted = pstmt.executeUpdate();
            System.out.println(rowInserted+ " rows inserted.");

            ResultSet resultSet = pstmtSelect.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id") +","
                + resultSet.getString("name") +","
                + resultSet.getString("author") +","
                + resultSet.getDouble("price") +","
                + resultSet.getInt("qty") +",");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
