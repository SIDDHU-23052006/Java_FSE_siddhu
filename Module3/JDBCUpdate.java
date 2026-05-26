import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {

    Connection con;

    StudentDAO() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentdb",
                    "root",
                    "root"
            );
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }

    void insertStudent(int id, String name) {

        try {

            String q = "insert into students values(?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            System.out.println("Record Inserted");
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }

    void updateStudent(int id, String name) {

        try {

            String q = "update students set name=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Record Updated");
        }
        catch (Exception e) {

            System.out.println(e);
        }
    }
}

public class JDBCUpdate {
    public static void main(String[] args) {

        StudentDAO s = new StudentDAO();

        s.insertStudent(1, "Rio");

        s.updateStudent(1, "Siddharth");
    }
}