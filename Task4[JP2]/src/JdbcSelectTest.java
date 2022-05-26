import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
            Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select title, price, qty from books";
            System.out.println("SQL statement: "+ strSelect +"\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            System.out.println("the records selected: ");
            int rowCount = 0;
            while (rset.next()) {
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + ", "+price+", "+qty);
                ++rowCount;
            }
            System.out.println("total number of record= "+ rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
