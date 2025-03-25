public class Demo{

public static void main(String [] args){

Student s1[]={new Student("Ali",11,54),new Student("Ahmed",14,50),new Student("Aslam",13,55),new Student("Azlan",8,57),new Student("Ahmar",18,44)};

Student s2[]={new Student("Zainab",20,23),new Student("Amna",22,25),new Student("Fatima",19,26),new Student("Ayesha",18,29),new Student("Zainab",21,115)};

for(int i =0;i<s1.length;i++){
for(int j=i+1;j<s1.length;j++){
if(s1[i].equals(s1[j])){
System.out.println(s1[i]+" is equal to "+s1[j]);
         }
    } 
}



Classroom classroom1[]={new Classroom("\nGrade 10","\nG10",checkStudentLimit(s1),new Teacher("Shahid khan",56,"Persian","T123")),new Classroom("\nGrade 8","\nG08",checkStudentLimit(s2),new Teacher("Saman Hussian",30,"Programing","A129"))};

for(int i =0;i<classroom1.length;i++){
for(int j=i+1;j<classroom1.length;j++){
if(classroom1[i].equals(classroom1[j])){
System.out.println(classroom1[i]+" is equal to "+classroom1[j]);
         }
    } 
}

School s=new School("\nSchool Details:\n \nZainab Public School","\n\nPCSIR society Lahore",classroom1,new Principal("Amjad khan",60,15));

System.out.println(s);
     }

    public static Student[] checkStudentLimit(Student[] students) {
        if (students.length > 5) {
            System.out.println("Error: A classroom cannot have more than 5 students!");
            return new Student[5];
        }
        return students;
    }

}