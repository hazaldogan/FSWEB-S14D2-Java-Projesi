package bedroom;

public class Bedroom extends Room {
    private Bed bed;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3,
                   Wall wall4, Ceiling ceiling, Lamp lamp, Bed bed,
                   Wardrobe wardrobe, Carpet carpet) {
        super(name, wall1, wall2, wall3, wall4, ceiling, lamp);
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public Bed getBed() {
        return bed;
    }

    public void createBedroom(){
        super.getWall1();
        super.getWall2();
        super.getWall3();
        super.getWall4();
        super.getCeiling();
        bed.make();
        carpet.lying();
        wardrobe.add();

    }


    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    @Override
    public String toString() {
        return "Bedroom{" + super.toString()  +
                "bed=" + bed +
                ", wardrobe=" + wardrobe +
                ", carpet=" + carpet +
                '}';
    }


}
