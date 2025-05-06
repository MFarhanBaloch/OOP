import java.sql.SQLOutput;

public class ShapeTest {


    public static void main(String[] args) {
        Shape shape1;
        Shape2D shape2d;
        Shape3D shape3d;
        Circle circle1=new Circle();
        circle1.setRadius(10);

        Rectangle rectangle1=new Rectangle();
        rectangle1.setLength(2);
        rectangle1.setWidth(3);
        Sphere sphere1=new Sphere();
        sphere1.setRadius(10);
        Cube cube1=new Cube();
        cube1.setSide(2);

        System.out.println("\nArea of Circle: "+circle1.area());
        System.out.println("\nCircumference of Circle: "+circle1.circumference());
        System.out.println("\nArea of Rectangle: "+rectangle1.area());
        System.out.println("\nPerimeter of Rectangle: "+ rectangle1.perimeter());
        System.out.println("\nArea of Sphere: "+sphere1.area());
        System.out.println("\nVolume of Sphere: "+sphere1.volume());
        System.out.println("\nArea of Cube: "+cube1.area());
        System.out.println("\nVolume of Cube: "+cube1.volume());

        Shape shapes[]=new Shape[20];
        shapes[0]=new Circle(5);
        shapes[1]=new Rectangle(3,4);
        shapes[2]=new Sphere(5);
        shapes[3]=new Cube(5);
        shapes[4]=new Sphere(40);
        shapes[5]=new Circle(7);
        shapes[6]=new Rectangle(2,3);
        shapes[7]=new Sphere(9);
        shapes[8]=new Cube(2);
        shapes[9]=new Circle(7);
        shapes[10]=new Rectangle(3,9);
        shapes[11]=new Sphere(8);
        shapes[12]=new Cube(3);
        shapes[13]=new Circle(6);
        shapes[14]=new Rectangle(9,8);
        shapes[15]=new Sphere(4);
        shapes[16]=new Cube(11);
        shapes[17]=new Circle(22);
        shapes[18]=new Rectangle(33,76);
        shapes[19]=new Sphere(31);
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].area());
        }

        for(Shape shape : shapes){
            System.out.println(shape);
        }

        for(int i=0;i<shapes.length;i++){

            if(shapes[i] instanceof Rectangle) {
                double k = 5;
                ((Rectangle) shapes[i]).setLength(5);
                k+=5;
            }
        }
        System.out.println("\nAfter changing length of Rectangle");
        for(Shape shape : shapes){
            System.out.println(shape);
        }

        ShapeUtilities sc= new ShapeUtilities();
        sc.countShape(shapes);
    }
}
