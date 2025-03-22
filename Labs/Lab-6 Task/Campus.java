public class Campus{

String name;
Department department[];

public Campus(String name, Department department[]){
this.name=name;
this.department=department;

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
for(int i=0;i<department.length;i++){
sb.append(department[i]);
}
return sb.toString();

}



}