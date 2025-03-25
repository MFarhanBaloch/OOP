public class Principal extends Person{
int experience;

public Principal(String name,int age,int experience){
super(name,age);
this.experience=experience;
}

public void setExperience(int experience){
this.experience=experience;
}
public int getExperience(){
return experience;
}
@Override
public String toString(){
return String.format("\n\nPrincipal Details: \nName:%s \nAge:%d \nExperience:%d\n",name,age,experience);

}

}