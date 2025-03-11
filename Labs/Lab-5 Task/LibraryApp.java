public class LibraryApp{

public static void main(String[] args){

Library l1=new Library("Comsats Library",new Book("Java Programing","23135",new Date(5,7,2025),new Person("John Dietal","Software Engineer",new Address("Country side area","New York"))),new Person("Qadir Khan","Librarian",new Address("PIA Society","Lahore")),new Person("Ahmed deen","Office boy",new Address("AnarKali","Lahore")));

l1.showLibraryDetails();



      }

}