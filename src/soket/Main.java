package soket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Main {
	public static void main(String []args) throws IOException {
		
		Socket socket = new Socket("search.maven.org",80);
		
		InputStream responce = socket.getInputStream();
		OutputStream request = socket.getOutputStream();

		byte[]date = ("GET /search?q=g:org.wso2.orbit.re2j HTTP/1.1\n"
				+"Host:search.maven.org\n\n").getBytes();
		
		
		request.write(date);
		
		int i;
		
		while((i = responce.read())!= -1) {
			System.out.print((char)i);
		}
		socket.close();
	}

}
