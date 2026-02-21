package AbstractMethod.application;

import AbstractMethod.entities.Circle;
import AbstractMethod.entities.Color;
import AbstractMethod.entities.Rectangle;
import AbstractMethod.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AbstractMethods {
    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        double quantity = sc.nextInt();
        List<Shape> shapes = new ArrayList<>();

        for(int i = 1; i <= quantity; i++){
            System.out.printf("Shape #%d data: \n", i);
            System.out.print("Rectangle or circle (r/c)? ");
            char shape = sc.next().toLowerCase().charAt(0);
            while(shape != 'r' && shape != 'c'){
                System.out.print("Invalid shape. Rectangle or circle (r/c): ");
                shape = sc.next().toLowerCase().charAt(0);
            }
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            String colorString = sc.nextLine().toUpperCase();
            Color color = Color.valueOf(colorString);
            if(shape == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                shapes.add(new Rectangle(color, width, height));
            }
            else{
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapes.add(new Circle(color, radius));
            }
        }

        System.out.println("Shape areas: ");
        for (Shape s : shapes){
            System.out.println(String.format("%.2f", s.area()));
        }





        sc.close();
    }
}
