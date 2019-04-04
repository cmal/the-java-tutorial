import java.net.*;
import java.io.*;

public class INetSocketAddressTest {

    public static void main(String... args) {
        InetSocketAddress ad = new InetSocketAddress("::", 7066);

        try {
            ServerSocket ss = new ServerSocket();
            System.out.println("after new...");
            ss.setReuseAddress(true);
            System.out.println("after setReuseAddress");
            ss.bind(ad);
            System.out.println("after bind");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("DONE!");
    }
}
