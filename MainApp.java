package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num, sum = 0, i = 1;
System.out.println(" Nhap vao mot so:");
num = sc.nextInt();
while(i <= num)
{
	sum += i;
	i++;
}
 System.out.println (" Tong cac so tu nhien tu 1 den " + num +" la: "+sum);
	}

}
