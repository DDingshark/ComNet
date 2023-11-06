import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
// 1 Week
//Simple Advice Client
/*
    1. Connect to the sever IP: 117.16.243.99 , port 5500
    2. sever sends a random message
    3. print client's console

 */

class Main{
    public static void main(String[] args) throws IOException {
        // Connection
        Socket socket = new Socket("117.16.243.99",5500);

        //Read Sever Message(Buffer Read ver)
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);

        /*
        //Read Sever Message(Stream ver)
        InputStream inputStream = socket.getInputStream(); //바이트 단위 데이타 수집
        InputStreamReader reader = new InputStreamReader(inputStream); // 바이트 -> 문자
        BufferedReader readerReader = new BufferedReader(reader); // 문자 ->문자열
        String str2 = readerReader.readLine();
        System.out.println(str2);
        */

        /*
        // 축양형
        BufferedReader bufferedReader =
                new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream()));
        */





        //close
        socket.close();
    }
}