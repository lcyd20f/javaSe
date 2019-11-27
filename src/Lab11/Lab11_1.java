package Lab11;

import java.io.*;

public class Lab11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./src/Lab11/MyFile.txt");
		try {
			FileOutputStream out = new FileOutputStream(file);
			byte[] w_in = "Java≥Ã–Ú…Ëº∆".getBytes();
			out.write(w_in);
			out.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			FileInputStream in = new FileInputStream(file);
			byte[] byt = new byte[1024];
			int len = in.read(byt);
			System.out.println(new String(byt,0,len));
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
