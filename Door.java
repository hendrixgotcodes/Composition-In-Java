public class Door {

    Dimension dimension = new Dimension(5,13);

    public Door(Dimension dimension, Paint paint) {
        this.dimension = dimension;
        this.paint = paint;
    }

    Paint paint = new Paint("yellow");

    public Dimension getDimension() {
        return dimension;
    }
    private void Open(){
        System.out.println("Door is opened");
    }
}
