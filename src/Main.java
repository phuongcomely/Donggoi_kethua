import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length for Rec: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter width for Rec: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side for Squ: ");
        double side = Double.parseDouble(scanner.nextLine());

        Geometry geometry= new Geometry();
        double Sr = geometry.SR( length,width);
        double Cr = geometry.CR(length, width);
        double Ss = geometry.SS(side);
        double Cs = geometry.CS(side);

        System.out.println("S Rectangle= "+Sr);
        System.out.println("C Rectangle= "+Cr);
        System.out.println("S Square = "+Ss);
        System.out.println("C Square = "+Cs);
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println(rectangle);
        Square square = new Square(side);
        System.out.println(square);
    }
}