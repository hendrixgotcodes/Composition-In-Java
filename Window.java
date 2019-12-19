public class Window {

    Dimension dimesion = new Dimension(1,3);
    Paint color = new Paint("blue");

    public Window(Dimension dimesion, Paint color) {
        this.dimesion = dimesion;
        this.color = color;
    }

    public Dimension getDimesion() {
        return dimesion;
    }

    public Paint getColor() {
        return color;
    }
}
