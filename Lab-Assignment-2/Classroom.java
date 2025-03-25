public class Classroom{
String className;
String classCode;
Student students[]=new Student[5];
Teacher teacher;

public Classroom(String className,String classCode,Student students[],Teacher teacher){
this.className=className;
this.classCode=classCode;
this.students=students;
this.teacher=teacher;
}

public void setClassName(String name){
this.className=name;
}
public String getClassName(){
return className;
}

public void setClassCode(String code){
this.classCode=code;
}
public String getClassCode(){
return classCode;
}
@Override
public String toString(){
StringBuilder sb=new StringBuilder();
sb.append("\n\nClass Room details:");
sb.append(className);
sb.append(classCode);
for(int i=0;i<students.length;i++){
sb.append(students[i]);
}
sb.append(teacher);
return sb.toString();
}


}