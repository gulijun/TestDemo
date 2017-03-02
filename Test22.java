import java.util.Scanner;

public class Test22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
		String str = scan.next();
		boolean flag = str.matches("^[ADWS]\\d{1,2}$");
		System.out.println(flag);
		}
	}
} 
