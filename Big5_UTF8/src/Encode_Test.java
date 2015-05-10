import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class Encode_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Test.txt"), "Big5"));
			StringBuilder str = new StringBuilder();
			
			FileReader fr = new FileReader("Test.txt");
			
			BufferedReader brr = new BufferedReader(fr);
			
			while (brr.ready()){
				
				str.append(brr.readLine());
				
			}
				
			fr.close();

			
			BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.toString().getBytes()))); //字串
			/*
			byte sbyte =(byte) br.read();
			while(sbyte>-1){
				System.out.println(sbyte);
				sbyte=(byte) br.read();
			}
			*/
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("Test2.txt"), "UTF8"));
		
			 String line = br.readLine();
			    while (line != null) {
			        System.out.println(line);
			        pw.write(line);
			        line = br.readLine();
			    }
			    pw.flush();
			    pw.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     //檔案
	    //BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes(), "Big5")); //字串
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
