
/**
 * Write a description of class Divisble here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Divisble
{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println(" Enter a number please ");
int a = sc.nextInt();
if(a%5==0){
    System.out.println( +a+ " is divisible by 5 " );
}
else{
System.out.println( +a+ " is not divisble by 5 ");
}
}
}