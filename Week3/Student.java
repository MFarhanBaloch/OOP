public class Student{

private String name;
private double gpa;
private String address;
private String regNo;
private static int id=0;



Student(String name,double gpa,String address){
this.name=name;
this.gpa=gpa;
this.address=address;
regNo=String.format("Registration No : FA24-BCS-%03d", ++id);

}

public String getName(){
return this.name;
}

public void setName(String name){
this.name=name;
}



public double getGpa(){
return gpa;
}

public String getAddress(){
return address;
}

public void Display()
{
System.out.println(regNo);
System.out.println("Name : "+ name);
System.out.println("GPA : "+ gpa);
System.out.println("Address : "+ address);

}




}