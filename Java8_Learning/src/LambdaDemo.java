import java.util.Arrays;
import java.util.Comparator;


public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names ={"Justin","caterpillar","Bush"};
		
		
		/*
		 * 
		 * 
		 * 
		Comparator<String> byLength = new Comparator<String>(){

			@Override
			public int compare(String name1, String name2) {
				// TODO Auto-generated method stub
				return name1.length()-name2.length();
			}
			
		};
		Arrays.sort(names,byLength);
		*/
		
		//Lambda ªí¥Ü
		Arrays.sort(names,(name1,name2)-> name1.length() -name2.length());
		System.out.println(Arrays.toString(names));
	}

}
