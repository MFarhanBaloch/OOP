package banking;

public class BankingSystem{

static final String storedAccountNumber="abc";
static final String storedPin="1234";


public static class LoginProcessor{

public static boolean authenticate(String accountNumber, String pin){

      if(storedAccountNumber.equals(accountNumber) && storedPin.equals(pin)){
           System.out.println("Access Granted....");
           return true;
      }  
       return false;
    }


}

}