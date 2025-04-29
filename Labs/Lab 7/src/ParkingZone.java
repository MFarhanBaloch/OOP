public class ParkingZone {
        private static int zoneCounter = 1;
        private String zoneId;
        private Vehicle[] vehicles;
        private int count = 0;

        public ParkingZone() {
            this.zoneId = "A" + zoneCounter++;
            this.vehicles = new Vehicle[5];
        }

        public void addVehicle(Vehicle v) {
            if (count < 5) {
                vehicles[count++] = v;
            } else {
                System.out.println("Zone " + zoneId + " is full");
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Zone: " + zoneId + "\n");
            for (int i = 0; i < count; i++) {
                sb.append(vehicles[i]).append("\n");

            }
            return sb.toString();
        }
    }

