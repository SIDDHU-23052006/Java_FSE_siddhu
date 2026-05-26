import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionHandling {
    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankdb",
                    "root",
                    "root"
            );

            con.setAutoCommit(false);

            String debit = "update accounts set balance = balance - ? where id = ?";
            String credit = "update accounts set balance = balance + ? where id = ?";

            PreparedStatement ps1 = con.prepareStatement(debit);
            PreparedStatement ps2 = con.prepareStatement(credit);

            ps1.setInt(1, 500);
            ps1.setInt(2, 1);

            ps2.setInt(1, 500);
            ps2.setInt(2, 2);

            ps1.executeUpdate();
            ps2.executeUpdate();

            con.commit();

            System.out.println("Transaction Success");

            con.close();
        }
        catch (Exception e) {

            System.out.println("Transaction Failed");
        }
    }
}