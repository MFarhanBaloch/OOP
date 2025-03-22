public class Main{

public static void main(String[] args){

SystemUnit system1[] ={new SystemUnit("Core i7",16,1028,"FA24","Dell2025"),
new SystemUnit("Core i5",8,256,"FA20","Dell2022")};
SystemUnit system2[] ={new SystemUnit("Core i7",16,1028,"Lf45","Dell2023"),
new SystemUnit("Core i3",4,512,"FS80","Dell2022")};



Lab l1[]={new Lab("\nCS lab",new Employee("Zainab","Incharge"),system1,true),new Lab("\n\nSE lab",new Employee("Wahab","Incharge"),system2,true)};

Department d1[]={new Department(new Employee("Ahmed Hussain","HOD"),"\nComputer Science",l1,new Employee("Arslan Khan","Lab Supervisor"))};

Campus c1=new Campus("\nLahore Campus",d1);

System.out.println(c1);

    } 
}