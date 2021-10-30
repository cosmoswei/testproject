import org.omg.CORBA.portable.UnknownException;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
//        WindowHTML windowHTML = new WindowHTML();
//        windowHTML.setTitle("普通网页");
//        WindowLink windowLink = new WindowLink();
//        windowLink.setTitle("超链接网页");
        try {
            InetAddress inetAddress1=InetAddress.getByName("www.sina.com.cn");
            System.out.println(inetAddress1.toString());
            InetAddress inetAddress2=InetAddress.getByName("202.108.22.5");
            System.out.println(inetAddress2.toString());
        }catch (UnknownException | UnknownHostException e){
            System.out.println("无法找到新浪网");
        }
        System.out.println("\n本机IP:"+InetAddress.getLocalHost());
    }
}
