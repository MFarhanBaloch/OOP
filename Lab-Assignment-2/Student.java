public class Student extends Person{
int rollNumber;

public Student(String name,int age,int rollNumber){
super(name,age);
this.rollNumber=rollNumber;

}
public void setRollNumber(int rollNumber){
this.rollNumber=rollNumber;
}
public int getRollNumber(){
return rollNumber;
}

@Override
public boolean equals(Object obj){
Student student=(Student)obj;
return (this.rollNumber==student.rollNumber)?true : false;
}


@Override
public String toString(){
return String.format("\n\nStudents Details: \nName:%s \nAge:%d \nRoll Number:%d",name,age,rollNumber);

}
}