public class ParkingSystem {

        private String campusName;
        private Supervisor supervisor;
        private ParkingZone[] zones;
        private int zoneCount = 0;
        private PermitHolder[] permitHolders;
        private int permitCount = 0;

        private ParkingSystem(String campusName, Supervisor supervisor) {
            this.campusName = campusName;
            this.supervisor = supervisor;
            this.zones = new ParkingZone[10];
            this.permitHolders = new PermitHolder[10];
        }


        public void addZone(ParkingZone z) {
            if (zoneCount < zones.length) {
                zones[zoneCount++] = z;
            }
        }

        public void addPermitHolder(PermitHolder p) {
            if (permitCount < permitHolders.length) {
                permitHolders[permitCount++] = p;
            }
        }

public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(campusName).append("\n");
    sb.append(supervisor).append("\n\nZones:\n");
    for (int i = 0; i < zoneCount; i++) {
        sb.append(zones[i]).append("\n");
    }
    sb.append("Permit Holders:\n");
    for (int i = 0; i < permitCount; i++) {
        sb.append(permitHolders[i]).append("\n");
    }
    return sb.toString();
   }
}