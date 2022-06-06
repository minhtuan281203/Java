import java.sql.*;
import java.util.Scanner;

public class QuanLyFilm {
    public static void main(String[] args) throws SQLException {
        Scanner ip = new Scanner(System.in);
        int luachon;
        int maphim, timeV;
        String Name, timeCC, Director;
        String valueU ;
        int conditionU, conditionD;
        String valueS;
        try(
                Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Phim", "root", ""
                );
                PreparedStatement pstmt = connection.prepareStatement(
                        "insert into film(MaPhim,Name,timeCC,Director,timeV) values (?,?,?,?,?)");
                PreparedStatement pstmt2 = connection.prepareStatement(
                        "update film set name=? where maphim=?");
                PreparedStatement pstmt21 = connection.prepareStatement(
                        "update film set timeCC=? where maphim=?");
                PreparedStatement pstmt22 = connection.prepareStatement(
                        "update film set Director=? where maphim=?");
                PreparedStatement pstmt23 = connection.prepareStatement(
                        "update film set timeV=? where maphim=?");
                PreparedStatement pstmt3 = connection.prepareStatement(
                        "delete from film where maphim=?");
                PreparedStatement pstmt4 = connection.prepareStatement(
                        "select * from film where Name like ?");
//                PreparedStatement pstmtSelect = connection.prepareStatement("select * from film");
        ){
            connection.setAutoCommit(false);
            try{
                do{
                    System.out.println("Lua chon: ");
                    System.out.println("1. Add\t   2. Update\t   3.Delete\t   4.Search\t   5. Continue\t   6. Exit");
                    luachon = ip.nextInt();
                    if (luachon==1){
                        System.out.println("chon add");
                        ip.nextLine();
                        System.out.println("Nhap maphim: ");
                        maphim = ip.nextInt();
                        System.out.println("Nhap tenphim: ");
                        Name = ip.next();
                        System.out.println("Nhap tgian cong chieu: ");
                        timeCC = ip.next();
                        System.out.println("Nhap dao dien: ");
                        Director = ip.next();
                        System.out.println("Nhap tgian phim: ");
                        timeV = ip.nextInt();

                        pstmt.setInt(1, maphim);
                        pstmt.setString(2, Name);
                        pstmt.setString(3, timeCC);
                        pstmt.setString(4, Director);
                        pstmt.setInt(5, timeV);
                        pstmt.executeUpdate();
                        System.out.println("Insert successful");

                    }else if(luachon==2){
                        System.out.println("chon update");
                        ip.nextLine();
                        int luachon2;
                        String tenU, direcU, timeCCU;
                        int maU, timeVU;
                        do{
                            System.out.println("Lua chon update: ");
                            System.out.println("1. Ten\t   2. TimeCC\t   3.Director\t   4.TimeV\t   5.Exit");
                            luachon2 = ip.nextInt();
                            if (luachon2==1){
                                System.out.println("nhap ten update:");
                                tenU = ip.next();
                                System.out.println("nhap maphim dk:");
                                maU = ip.nextInt();
                                pstmt2.setString(1, tenU);
                                pstmt2.setInt(2, maU);
                                pstmt2.executeUpdate();
                                System.out.println("update name successful");
                            }
                            if (luachon2==2){
                                System.out.println("nhap tgian cong chieu update:");
                                timeCCU = ip.next();
                                System.out.println("nhap maphim dk:");
                                maU = ip.nextInt();
                                pstmt21.setString(1, timeCCU);
                                pstmt21.setInt(2, maU);
                                pstmt21.executeUpdate();
                                System.out.println("update tgian cong chieu successful");
                            }
                            if (luachon2==3){
                                System.out.println("nhap tac gia update:");
                                direcU = ip.next();
                                System.out.println("nhap maphim dk:");
                                maU = ip.nextInt();
                                pstmt22.setString(1, direcU);
                                pstmt22.setInt(2, maU);
                                pstmt22.executeUpdate();
                                System.out.println("update tac gia successful");
                            }
                            if (luachon2==4){
                                System.out.println("nhap tgian phim update:");
                                timeVU = ip.nextInt();
                                System.out.println("nhap maphim dk:");
                                maU = ip.nextInt();
                                pstmt23.setInt(1, timeVU);
                                pstmt23.setInt(2, maU);
                                pstmt23.executeUpdate();
                                System.out.println("update tgian phim successful");
                            }

                            connection.commit();
                        }while (luachon2!=1 || luachon2!=2 || luachon2!=3 || luachon2!=4);
//                        System.out.println("nhap gtri update:");
//                        valueU = ip.next();
//                        System.out.println("nhap dieu kien update:");
//                        conditionU = ip.nextInt();
//                        pstmt2.setString(1, valueU);
//                        pstmt2.setInt(2, conditionU);
                        pstmt2.executeUpdate();
                        System.out.println("Update successful");
                    }else if (luachon==3){
                        System.out.println("chon delete");
                        ip.nextLine();
                        System.out.println("nhap dieu kien delete:");
                        conditionD = ip.nextInt();
                        pstmt3.setInt(1, conditionD);
                        pstmt3.executeUpdate();
                        System.out.println("Delete successful");
                    }
                    if (luachon==4){
                        System.out.println("chon search");
                        ip.nextLine();
                        System.out.println("nhap ten phim can tim kiem:");
                        valueS = ip.next();
                        pstmt4.setString(1, "%"+valueS+"%");
                        ResultSet resultSet = pstmt4.executeQuery();
                        while (resultSet.next()){
                        System.out.println(resultSet.getInt("MaPhim")+", "
                            + resultSet.getString("Name")+ ", "
                            + resultSet.getString("timeCC")+ ", "
                            + resultSet.getString("Director")+ ", "
                            + resultSet.getInt("timeV"));
                        }

                    }
                    connection.commit();
                    System.out.println("Are you want to continue?");
                    System.out.println("5. Yes\t   6. No");
                    luachon = ip.nextInt();
                    if (luachon==5){
                        continue;
                    }
                    if (luachon==6){
                        break;
                    }
                }while (luachon!=1 || luachon!=2 || luachon!=3 || luachon!=4 || luachon!=5);
            }catch (SQLException exception){
                exception.printStackTrace();
            }
        }
    }
}
