
import java.util.Scanner;

public class Main{

public static void main(String [] args){

Student s1=new Student("Muhammad Farhan", 3.82, "Wapda Town, Lahore" );
Student s2=new Student("Zainab Hussain", 3.80, "PCSIR, Lahore" );

userInfo s3=new userInfo();


s1.Display();

s2.Display();

Scanner scan=new Scanner(System.in);

String userN;
String passW;

System.out.print("Enter Username: ");
userN=scan.nextLine();
System.out.print("Enter Password: ");
passW=scan.nextLine();

String a=s3.getUsername();
String b=s3.getPassword();

if(userN.equals(a) && passW.equals(b)){

System.out.println("Congratulation");

}
else
{
System.out.println("Incorrect");
}

   }
}