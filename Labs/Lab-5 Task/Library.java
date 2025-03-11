public class Library{

private String name;
private Book book;
private Person incharge;
private Person staff;

public Library(String name,Book book,Person incharge,Person staff){
this.name=name;
this.book=book;
this.incharge=incharge;
this.staff=staff;

}

public Library(Library other){
this.name=other.name;
this.book=other.book;
this.incharge=other.incharge;
this.staff=other.staff;

}

public void showLibraryDetails(){
System.out.println("*****************************************");
System.out.println("Library name : "+ name);
System.out.println("*****************************************");

System.out.println("          Book Details  "); 
book.showBookDetails();
System.out.println("*****************************************");

System.out.println("          Incharge Details  "); 
incharge.showPersonDetails();
System.out.println("*****************************************");

System.out.println("          Staff Details  "); 
staff.showPersonDetails();
}
//@override
public boolean equals(Object obj){
Library a=(Library)obj;
return true;
}


public String getName(){
return name;
}
public void setName(String name){
this.name=name;
}



}