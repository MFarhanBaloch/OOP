public class PermitHolder extends Person{
    String name;
    String ID;

    PermitHolder(String name){
        super(name);
    }
    public void setId(String ID){
        this.ID=ID;
    }
    public String getId(){
        return ID;
    }
    public boolean equals(Object o) {
        PermitHolder p = (PermitHolder) o;
        return ID.equals(p.ID);
    }

    public String toString(){
        return String.format("\nName:%s \nPermit Holder ID:%03S",name,ID+1);
    }
}
