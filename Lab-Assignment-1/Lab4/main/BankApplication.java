package main;

import banking.BankingSystem;
import utils.PinValidator;

import java.io.Console;

public class BankApplication{

public static void main(String[] args){

Console console=System.console();
System.out.print("Enter Account Number: ");
String acc= new String(console.readLine()); 

System.out.print("Enter Account Pin : ");
String pin= new String(console.readPassword()); 


PinValidator pv=new PinValidator();
PinValidator.InnerClass in=pv.new InnerClass();
if(in.isValid(pin)){



BankingSystem bs=new BankingSystem();
BankingSystem.LoginProcessor lp=new BankingSystem.LoginProcessor();
//pl.authenticate(acc, pin);

if(BankingSystem.LoginProcessor.authenticate(acc, pin))
{
System.out.println("Welcome to the System.");
}
else
{
System.out.println("Invalid Credentials.");

}

                   }    
else
{
System.out.println("Must Enter valid Pin");
}


      }

}