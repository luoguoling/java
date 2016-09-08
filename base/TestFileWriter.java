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
		
		}catch(Exception e){
			e.printStackTrace();
		}
}
}
