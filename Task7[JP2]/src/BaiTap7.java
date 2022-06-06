import java.sql.*;
import java.util.Scanner;
import java.util.SortedMap;

public class BaiTap7 {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", ""
                );
                PreparedStatement pstmt = connection.prepareStatement(
                        "insert into vehicle values (?, ?, ?, ?)");
                PreparedStatement pstmtSelect = connection.prepareStatement("select * from vehicle");
                ){
            //insert
//                pstmt.setInt(1, 103);
//                pstmt.setString(2, "train");
//                pstmt.setDouble(3, 90000);
//                pstmt.setInt(4, 3);
//                pstmt.executeUpdate();
            System.out.println("Insert successful");
            //update
                String sqlUp = "update vehicle set name = 'bus' where id = 101";
//                String code = connection.prepareStatement(sqlUp);
                pstmt.executeUpdate(sqlUp);
            System.out.println("Update successful");
            //delete
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter code delete: ");
            String no = sc.nextLine();
                String sqlDel = "delete from vehicle where "+ no;
                pstmt.executeUpdate(sqlDel);
            System.out.println("Delete successful");

            ResultSet resultSet = pstmtSelect.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+", "
                + resultSet.getString("name")+ ", "
                + resultSet.getDouble("price")+ ". "
                + resultSet.getInt("qty"));
            }
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
