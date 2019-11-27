package Lab11;

import java.io.*;
import java.util.zip.*;

class MyZip{
	void zip(String zipFileName, File inputFile) throws Exception{
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
		zip(out, inputFile, inputFile.getName());
		System.out.println("压缩中……");
		out.close();
	}
	void zip(ZipOutputStream out, File f, String base) throws Exception{
		if(f.isDirectory()) {
			File[] fl = f.listFiles();
			base += "/";
			out.putNextEntry(new ZipEntry(base));
			for (int i = 0; i < fl.length; i++) {
				zip(out, fl[i], base + fl[i].getName());
			}
		}else {
			out.putNextEntry(new ZipEntry(base));
			FileInputStream in = new FileInputStream(f);
			int b;
			System.out.println(base);
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
		}
	}
}

public class Lab11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fs = new FileOutputStream("./src/Lab11/MyText.txt");
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("使用writeUTF方法写入数据");
			ds.writeChars("使用writeChars方法写入数据");
			ds.writeBytes("使用writeBytes方法写入数据");
			FileInputStream fis = new FileInputStream("./src/Lab11/MyText.txt");
			DataInputStream dis = new DataInputStream(fis);
			System.out.println(dis.readUTF());
			System.out.println(dis.readChar());
			System.out.println(dis.readByte());
			ds.close();
			dis.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		MyZip book = new MyZip();
		File file = new File("./src/Lab11/MyText.txt");
		try {
			FileOutputStream fs = new FileOutputStream(file);
			DataOutputStream ds = new DataOutputStream(fs);
			ds.writeUTF("使用writeUTF方法写入数据");
			book.zip("./src/Lab11/MyText.zip",file);
			System.out.println("压缩完成");
			ds.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		File file1 = new File("./src/Lab11/MyText.zip");
		ZipInputStream zin;
		try {
			ZipFile zipFile = new ZipFile(file1);
			zin = new ZipInputStream(new FileInputStream(file1));
			ZipEntry entry;
			while (((entry = zin.getNextEntry()) != null)) {
				File tmp = new File("./src/Lab11/unzip/" + entry.getName());
				if(entry.isDirectory()) {
					tmp.mkdirs();
				}
				else {
					tmp.getParentFile().mkdirs();
					OutputStream os = new FileOutputStream(tmp);
					InputStream in = zipFile.getInputStream(entry);
					int count = 0;
					while ((count = in.read()) != -1) {
						os.write(count);
					}
					os.close();
					in.close();
				}
				zin.closeEntry();
				System.out.println(entry.getName() + "解压成功");
			}
			zipFile.close();
			zin.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
