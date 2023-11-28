import java.util.Scanner;

public class Foot{
    private FootShape footShape;

    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }

    public static String getFootShapeTypeFromUser() {
        String footShapeType = null;
        Scanner in = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Eclipse, 2. Rectangle ");
        int type = in.nextInt();
        switch (type) {
            case 1:
                footShapeType = "Eclipse";
                break;
            case 2:
                footShapeType = "Rectangle";
                break;
        }
        return footShapeType;
    }

    public void drow(String footShapeType) {
        switch (footShapeType) {
            case "Eclipse":
                footShape.drowAsEclipse();
                break;
            case "Rectangle":
                footShape.drowAsRectangle();
                break;
        }
    }

    public static void main(String[] args) {
        String footShapeType = getFootShapeTypeFromUser();
        FootShape footShape = new FootShape();
        
        Foot app = new Foot(footShape);
        app.drow(footShapeType);
    }
}
