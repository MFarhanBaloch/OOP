import java.util.Scanner;

class InputDemo{

public static void main (String[] args){

Scanner input=new Scanner(System.in);

Scanner scan=new Scanner(System.in);
Scanner scan1=new Scanner(System.in);

//for integer
int i;
byte b;
short s;
long l;

//for decimal
float f;
double d;

//for word or string
char letter;
String word;
String line;

//For boolean
boolean bool;

System.out.print("Enter integer value : ");
i=input.nextInt();

System.out.print("Enter Byte value : ");
b=input.nextByte();

System.out.print("Enter Short value : ");
s=input.nextShort();

System.out.print("Enter Long value : ");
l=input.nextLong();

System.out.print("Enter Float value : ");
f=input.nextFloat();

System.out.print("Enter Double value: ");
d=input.nextDouble();

System.out.print("Enter String Word : ");
word=scan.next();

System.out.print("Enter String line : ");
line=scan1.nextLine();

System.out.print("Enter Character : ");        
letter=scan.next().charAt(0);

System.out.print("Enter Boolean value : ");
bool=input.nextBoolean();





System.out.printf("Integer value is : %04d /n" + i);

System.out.printf("Byte value is : %d /n" + b);

System.out.printf("Short value is : %d /n" + s);

System.out.printf("Long value is : %d /n" + l);

System.out.printf("Float value is %.2f: /n" + f);

System.out.printf("Double value is : %.4f /n" + d);

System.out.printf("Word is : %s /n" + word);

System.out.printf("Line is : %s /n" + line);

System.out.printf("Character is : /n" + letter);

System.out.printf("Boolean is : /n" + bool);


   }

}
