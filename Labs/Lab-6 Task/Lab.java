public class Lab{
String name;
Employee labStaff;
SystemUnit system[]=new SystemUnit[50];
boolean hasMultimedia;

Lab(String name, Employee labStaff, SystemUnit system[],boolean hasMultimedia){
this.name=name;
this.labStaff=labStaff;
this.system=system;
this.hasMultimedia=hasMultimedia;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public boolean gethasMultimedia(){
return hasMultimedia;
}

public void sethasMultimedia(boolean hasMultimedia){
this.hasMultimedia=hasMultimedia;
}


public String toString(){
StringBuilder sb=new StringBuilder();
sb.append(name);
sb.append(labStaff);
for(int i=0;i<system.length;i++){
sb.append(system[i]);
}
sb.append(hasMultimedia);
return sb.toString();
}

}