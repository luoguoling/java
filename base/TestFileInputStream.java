import java.io.*;
public class TestFileInputStream{
	public static void main(String[] args){
		int b = 0;
		FileInputStream in = null;
	//	FileReader cin = null;
		try{
			in = new FileInputStream("Animal.java");
		//	cin = new FileReader("Animal.java");

		}catch (FileNotFoundException e){
			System.out.println("文件不能找到!!!");
			System.exit(-1);
		}
		int num = 0;
		try{
			while((b = in.read())!= -1){
				System.out.print((char)b);
				num ++;
			}
			in.close();
		//	System.out.println();
			System.out.println("总共读取了" + num + "个字节数");
		}catch(IOException e){
			System.out.println("文件读取错误!!");
		}
	}
}
