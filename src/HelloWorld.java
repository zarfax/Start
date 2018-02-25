import java.util.Arrays;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years = getYears();
		int[] myIntArray = {1,2,3};
		double total =0;
		for (int i = 0;i < myIntArray.length; i++) {
			total=total+myIntArray[i];
		}
		double mean=total/myIntArray.length;
			
System.out.println("Gjennomsnitt "+mean);
	}

	public static int getYears()
	{
		return 20;
	}
}
