import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModifyTable {
    String datasoureName = " ";
    String SQL, message = " ";

    public ModifyTable() {
        Connection com = null;
        Statement sql = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (Exception e) {

        }

    }

    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    public void setDatasoureName(String s) {
        datasoureName = s.trim();
    }

    public String modify() {
        Connection con = null;
        Statement sql = null;
        try {
            String uri = "jdbc:sqlserver://localhost:1433;DatabaseName=Hotel";
            String id = "sa";
            String psword = "123123";
            con = DriverManager.getConnection(uri, id, psword);
            sql=con.createStatement();
            sql.execute(SQL);
            message = "操作成功";
            con.close();
        } catch (SQLException ee) {
            message = ee.toString();
        }
        return message;
    }
}
