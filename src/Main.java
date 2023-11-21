import bedroom.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Wall northWall = new Wall("north");
        Wall eastWall = new Wall("east");
        Wall westWall = new Wall("west");
        Wall southWall = new Wall("south");

        Bedroom bedroom = new Bedroom("Bedroom",northWall,eastWall,westWall,southWall,
                new Ceiling(3, PaintColor.ANTHRACITE),new Lamp(LampType.CHANDELIER,
                true,100),new Bed("Double",2,2,2,2),
                new Wardrobe(3,5,9),new Carpet(2,1,PaintColor.WHITE));
        System.out.println(bedroom);
    }

}