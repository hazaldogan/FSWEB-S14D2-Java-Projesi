package bedroom;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintColor) {
        this.height = height;
        this.paintedColor = paintColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }
    public void create(){
        System.out.println("Height: " + height + ", " + "Paint Color: " + paintedColor);
    }


}
