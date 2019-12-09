package Lab13;
import java.io.*;
import java.net.*;
public class Lab13_4 {

	public static void main(String[] args) throws IOException {
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
		String s = sb.toString();
		File fileDir = null;
		FileOutputStream fos = null;
        try{
            //创建文件目录
            fileDir = new File("./src/Lab13/HyperLink.txt");
            if (!fileDir.exists()) {
                fileDir.createNewFile();
            }  
        } catch (Exception e) {
            e.printStackTrace();
        }
        fos = new FileOutputStream("./src/Lab13/HyperLink.txt",true);
        String[] string = s.split("<a href=\"");
        for (int i = 0; i < string.length; i++) {
			String[] t = string[i].split("\"");
			if (t[0].indexOf(".htm") != -1) {
				System.out.println(t[0]);
				fos.write(t[0].getBytes());
				fos.write("\r\n".getBytes());// 写入一个换行
			}
		}
        fos.close();
	}

}