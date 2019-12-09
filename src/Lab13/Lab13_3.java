package Lab13;
import java.io.*;
import java.net.*;
public class Lab13_3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		try {
			URL page = new URL("http://www.scholat.com");
			BufferedReader in = new BufferedReader(new InputStreamReader(page.openStream(), "GBK"));
			String line;
			while ((line = in.readLine()) != null) {  
                sb.append(line+"\r\n"); 
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sb.toString());
	}

}