import java.io.*;
public class TestFileOutputStream{
	public static void main(String[] args){
		FileInputStream in = null;
		FileOutputStream out = null;
		int b = 0;
		try{
			in = new FileInputStream("Animal.java");
			out = new FileOutputStream("AnimalCopy.java");
			while((b = in.read())!= -1){
				out.write(b);
			}
			
		}catch (FileNotFoundException e){
			System.out.println("不能正常读取文件");
			System.exit(-1);
		}catch(IOException e1){
			System.out.println("文件复制失败");
			System.exit(-1);
		}
		System.out.println("文件复制成功");
	}
}
