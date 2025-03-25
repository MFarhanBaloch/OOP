public class School{
String schoolName;
String address;
Classroom[] classroom=new Classroom[2];
Principal principal;

public School(String name,String address,Classroom classroom[],Principal principal){
this.schoolName=name;
this.address=address;
this.classroom=classroom;
this.principal=principal;

}

public void setSchoolName(String name){
this.schoolName=name;
}
public String getSchoolName(){
return schoolName;
}

public void setAddress(String address){
this.address=address;
}
public String getAddress(){
return address;
}
@Override
public String toString(){
StringBuilder sb=new StringBuilder();
sb.append(schoolName);
sb.append(address);
for(int i=0;i<classroom.length;i++){
sb.append(classroom[i]);
}
sb.append(principal);

return sb.toString();
}

}