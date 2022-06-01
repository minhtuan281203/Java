import java.sql.*;
import java.util.Scanner;

public class JdbcSelect2 {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root","");
                Statement statement = connection.createStatement();
                )
        {
//            String strSelect = "select * from customer";
//            System.out.println("_______________\n");
            String name;
            Scanner ip = new Scanner(System.in);
            System.out.println("Enter name: ");

            name = ip.nextLine();

            String sqlSelectbyIdx = "select * from customer where TenKH like '%" + name + "%'";
            System.out.println("sql search by name:" + sqlSelectbyIdx+ "\n");

            ResultSet resultSet = statement.executeQuery(sqlSelectbyIdx);
            while (resultSet.next()){
                String MaKH = resultSet.getString("MaKH");
                String TenKH = resultSet.getString("TenKH");
                String Adress= resultSet.getString("Address");
                System.out.println(MaKH +", "+ TenKH + ", " + Adress);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
