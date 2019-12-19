public class room {

    Door door;
    Window window;
    Paint paint = new Paint("mauve");
    Dimension dimension = new Dimension(20,50,10);

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }


    public Paint getPaint() {
        return paint;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public room(Door door, Window window, Paint paint, Dimension dimension) {
        this.door = door;
        this.window = window;
        this.paint = paint;
        this.dimension = dimension;
    }
}
