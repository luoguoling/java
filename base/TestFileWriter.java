import java.io.*;
public class TestFileWriter{
	public static void main(String[]args){
		FileWriter fw = null;
		FileReader fr = null;
		try{
			fw = new FileWriter("file.txt");
			for (int i=0;i<6000;i++){
				fw.write(i);
			}
			fr = new FileReader("file.txt");
			int j = 0;
			int num = 0;
			while((j=fr.read())!= -1){
				System.out.print((char)j + "\t");
				num++;
			}
			System.out.println(String.format("一共读取了{%d}个字符串", num));
		
		}catch(Exception e){
			e.printStackTrace();
		}
}
}
