public class Teacher extends Person{
String subject;
String Id;
public Teacher(String name,int age,String subject,String Id){
super(name,age);
this.subject=subject;
this.Id=Id;
}

public void setSubject(String subject){
this.subject=subject;
}
public String getSubject(){
return subject;
}
public void setId(String Id){
this.Id=Id;
}
public String getId(){
return Id;
}

@Override
public boolean equals(Object obj){
Teacher teacher=(Teacher)obj;
return (this.Id==teacher.Id)?true : false;
}

@Override
public String toString(){
return String.format("\n\nTeacher Details: \nName:%s \nAge:%d \nTeaching Subject:%s \nTeacher ID:%s",name,age,subject,Id);

}

}