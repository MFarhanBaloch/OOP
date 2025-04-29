public class Vehicle {
    private static String[] licensePlates = new String[5];
    private static int licenseIndex = 0;
    private String licensePlate;
    private String type;
    private Owner owner;

    public Vehicle(String licensePlate, String type, Owner owner) {
        boolean duplicate = false;
        for (int i = 0; i < licenseIndex; i++) {
            if (licensePlates[i].equals(licensePlate)) {
                duplicate = true;
                break;
            }
        }
        if (duplicate) {
            System.out.println("Duplicate license plate not allowed: " + licensePlate);
        }
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
        licensePlates[licenseIndex++] = licensePlate;
    }


    public String toString(){
        return String.format("\nType:%s \nLicense Plate :%s \nOwner name:%s",type,licensePlate,owner);

    }
}


