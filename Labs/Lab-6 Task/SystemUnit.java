public class SystemUnit{

private String cpuName;
private int RamSize;
private int DiskSize;
private String SystemID;
private String LcdModel;

SystemUnit(String cN,int ram,int rom,String id,String model){
this.cpuName=cN;
this.RamSize=ram;
this.DiskSize=rom;
this.SystemID=id;
this.LcdModel=model;

}

public String getcpuName(){
return cpuName;
}
public void setcpuName(String name){
this.cpuName=name;
}

public int getRamSize(){
return RamSize;
}
public void setRamSize(int ram){
this.RamSize=ram;
}

public int getDiskSize(){
return DiskSize;
}
public void setDiskSize(int rom){
this.DiskSize=rom;
}

public String getSystemID(){
return SystemID;
}
public void setSystemID(String id){
this.SystemID=id;
}

public String getLcdModel(){
return LcdModel;
}
public void setLcdModel(String model){
this.LcdModel=model;
}

public String toString(){
return String.format("\nSystem Details: \nCpu Name:%s\nRam Size:%d\nDisk Size:%d\nSystem ID:%s\nLcd Model:%s\n", cpuName, RamSize, DiskSize, SystemID, LcdModel);

}

}