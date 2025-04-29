public class Owner extends Person{
    private static String id;
    Owner(String name){
        super(name);
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public String toString(){
        return String.format("\nName:%s \nOwner Id:%03s",name,id+1);
    }
}
