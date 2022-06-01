import java.sql.*;
import java.util.Scanner;

public class UpdateByScanner {
    public static void main(String[] args) {
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/food", "root", ""
                );
                Statement statement = connection.createStatement();
                ){
            //delete
//            Scanner ip = new Scanner(System.in);
//            System.out.println("Enter code delete: ");
//            String noichuoi = ip.nextLine();
//
//            String sqlDelete = "delete from sanpham where "+ noichuoi;
//            int count = statement.executeUpdate(sqlDelete);
//            System.out.println("sql statement: " + sqlDelete + "\n");

            //insert
//            Scanner ip2 = new Scanner(System.in);
//            System.out.println("Enter code insert: ");
//            String noichuoi2 = ip2.nextLine();
//
//            String sqlInsert = "insert into sanpham values " + noichuoi2;
//            int count2 = statement.executeUpdate(sqlInsert);
//            System.out.println("sql statement: " + sqlInsert + "\n");

            //update
//            Scanner ip3 = new Scanner(System.in);
//            System.out.println("Enter code: ");
//            String noichuoi3 = ip3.nextLine();
//            Scanner ip4 = new Scanner(System.in);
//            System.out.println("Enter code: ");
//            String noichuoi4 = ip4.nextLine();
//
//            String sqlUpdate = "update sanpham set " + noichuoi3 + " where "+ noichuoi4;
//            int count3 = statement.executeUpdate(sqlUpdate);
//            int count4 = statement.executeUpdate(sqlUpdate);
//            System.out.println("sql statement: " + sqlUpdate + "\n");

            //search....
//            Scanner ip5 = new Scanner(System.in);
//            System.out.println("Enter code: ");
//            String noichuoi5 = ip5.nextLine();
//
//            String sqlSearch = "select * from sanpham where id like '%"+noichuoi5+"'";
//            int count5 = statement.executeUpdate(sqlSearch);
            Scanner ip5 = new Scanner(System.in);
            System.out.println("Enter code: ");
            String noichuoi5 = ip5.nextLine();

            String sqlSearchName = "select * from sanpham where name like '%"+noichuoi5+"'";
            System.out.println("ka: "+sqlSearchName);

            Scanner ip6 = new Scanner(System.in);
            System.out.println("Enter code: ");
            String noichuoi6 = ip6.nextLine();

            String sqlSearchId = "select * from sanpham where id like '%"+noichuoi6+"'";
            System.out.println("ka: "+sqlSearchId);

            String[] arr = {sqlSearchName, sqlSearchId};
            for (String as : arr)  {
                System.out.println(as);
            }


            String strSelect = "select * from sanpham";
            System.out.println("\n\nsql statement:"+ strSelect);
            ResultSet resultSet = statement.executeQuery(strSelect);
            while (resultSet.next()){
                System.out.println(resultSet.getInt("id")+","
                        +resultSet.getString("name")+","
                        +resultSet.getInt("qty")+","
                        +resultSet.getFloat("price"));
            }

        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
}
