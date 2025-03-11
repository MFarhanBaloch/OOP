public class Book{

private String title;
private String issn;
private Date publicationDate;
private Person author;



public Book(String title,String issn,Date publicationDate,Person author){
this.title=title;
this.issn=issn;
this.publicationDate=publicationDate;
this.author=author;

}

public Book(Book other){
this.title=other.title;
this.issn=other.issn;
this.publicationDate=new Date(other.publicationDate);
this.author=new Person(other.author);

}

public void showBookDetails()
{
System.out.println("Book Title : "+ title);
System.out.println("ISSN : "+ issn);
System.out.print("Publication Date : ");
publicationDate.showDate();
System.out.println("*****************************************");

System.out.println("          Author Details ");
author.showPersonDetails();
}
//@override
public boolean equals(Object obj){
Book a=(Book)obj;
return true;
}


public String getTitle()
{
return title;
}
public void setTitle(String title){
this.title=title;

}
public String getIssn()
{
return issn;
}
public void setIssn(String issn){
this.issn=issn;

}

}
