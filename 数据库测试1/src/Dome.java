import javax.xml.crypto.Data;
import java.lang.reflect.Modifier;
import java.sql.*;
import javax.sql.DataSource;

class Dome {

    public static void main(String[] args) throws SQLException {
//        String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//        String dbURL = "jdbc:sqlserver://localhost:1433;DatabaseName=Hotel";
//        String userName = "sa";
//        String userPwd = "123123";
//        Connection con = null;
//        JDBCUtil jdbcUtil =new JDBCUtil();
        Connection con=null;
        con=JDBCUtil.getConnection();
        ModifyTable modifyTable = new ModifyTable();
        modifyTable.setDatasoureName("star");
        //modifyTable.setSQL("insert into tenants values('431081199912227778','黄旭伟','109','','')");
        modifyTable.setSQL("delete from tenants where roomNumber=103");
        String backMess = modifyTable.modify();
        System.out.println(backMess);
//        try {
//            Class.forName(driverName);
//            con = DriverManager.getConnection(dbURL, "sa", "123123");
//            if (!con.isClosed()) {
//                System.out.println("连接数据库成功");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.print("连接失败");
//        }
        User user1=new User("黄旭伟","431081","109","2020-12-18","2020-12-24");
        String n="106";
        User user2=new User(n);

        UserDao userDao=new UserDaoImpl() ;
        userDao.addUser(user1);
        userDao.deleteUser(user2);

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("Select *from tenants");
        while (resultSet.next()) {
            int nn=2;
            String name = resultSet.getString(nn);
            String number = resultSet.getString(1);
            String roomNumber = resultSet.getString(3);
            Timestamp timestamp1 = resultSet.getTimestamp(4);
            Timestamp timestamp2 = resultSet.getTimestamp(5);
            System.out.printf("姓名："+name + " 身份证号码：" + number + " 房间号码" + roomNumber +
                    " 入住时间：" + timestamp1 + "退房时间：" + timestamp2);
            System.out.println("");
        }
        con.close();
        if(con.isClosed()){
            System.out.println("YES");
        }else System.out.println("NO");

    }
}
