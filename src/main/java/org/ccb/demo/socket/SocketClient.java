package org.ccb.demo.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by cuicb on 2019/12/2.
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        // 要连接的服务端IP地址和端口
        String host = "127.0.0.1";
        int port = 8080;
        // 与服务端建立连接
        Socket socket = new Socket(host, port);
        // 建立连接后获得输出流
        OutputStream outputStream = socket.getOutputStream();
        String message = "hello world";
        socket.getOutputStream().write(message.getBytes("UTF-8"));
        outputStream.close();
        socket.close();
    }
}
