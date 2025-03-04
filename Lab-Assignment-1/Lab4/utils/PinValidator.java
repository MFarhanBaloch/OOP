package utils;

public class PinValidator{

public class InnerClass{


public boolean isValid(String pin){ 

if(pin.length() == 4 && pin.matches("\\d+")){
return true;
}
else
{
System.out.println("Must Enter valid Pin");
return false;
}


}




}



}