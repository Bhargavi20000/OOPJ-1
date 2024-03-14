import java.util.Scanner;
class LeapYear{
  public static void main(String args[])
{
  System.out.println("Enter a year :");
  Scanner sc =new Scanner(System.in);
  int year = sc.nextInt();
if(( year % 4==0 && year %100 !=00)||( year % 400 ==0)){
         System.out.println("It is a year");
}
else
{
 System.out.println("It is not a year");
}
}
}