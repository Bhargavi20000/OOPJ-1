import java.util.Scanner;
class Grade{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter the numberic grade :");
int Grade =sc.nextInt();
if(Grade>=80)
{
   System.out.println("Grade A:");
}
else if(Grade>=70)
{
   System.out.println("Grade B:");
}
else if(Grade>=70)
{
   System.out.println("Grade C:");
}
else if(Grade>=60)
{
   System.out.println("Grade E:");
}
else
{
   System.out.println("Grade F:");
}
}
}