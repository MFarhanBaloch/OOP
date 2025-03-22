public class Department{

Employee hod;
String name;
Lab lab[]=new Lab[2];
Employee labSupervisor;

public Department(Employee hod,String name,Lab lab[],Employee labSupervisor){
this.hod=hod;
this.name=name;
this.lab=lab;
this.labSupervisor=labSupervisor;
}

public String getName(){
return name;
}
public void setName(String name){
this.name = name;
}

public String toString(){
StringBuilder sb=new StringBuilder();
sb.append(name);
sb.append(hod);
for(int i=0;i<lab.length;i++){
sb.append(lab[i]);
}
sb.append(labSupervisor);
return sb.toString();

}
}
