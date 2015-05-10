import java.util.Arrays;


public class StringOrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Justin","caterpillar","Bush"};
		Arrays.sort(names,StringOrder::byLength);	
		System.out.println(Arrays.toString(names));
	}

}
