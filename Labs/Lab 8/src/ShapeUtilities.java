public class ShapeUtilities {
    public static void countShape(Shape[] shapes){
        int circles=0;
        int rectangles=0;
        int cubes=0;
        int spheres=0;
        for(int i=0;i<shapes.length;i++){
            if(shapes[i] instanceof Rectangle) {
                rectangles++;
            }
            else if (shapes[i] instanceof Circle) {
                circles++;
            }
            else if(shapes[i] instanceof Cube) {
                cubes++;
            }
            else{
                spheres++;
            }
        }
        System.out.println("Count of Shapes:");
        System.out.println("Circles:"+circles);
        System.out.println("Rectangles:"+rectangles);
        System.out.println("Cube:"+cubes);
        System.out.println("Sphere:"+spheres);
    }
}
