public class Dimension {

    int width;
    int breadth;
    int depth;

    public int getWidth() {
        return width;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getDepth() {
        return depth;
    }

    public Dimension(int width, int breadth, int depth) {
        this.width = width;
        this.breadth = breadth;
        this.depth = depth;
    }
    public Dimension(int width, int breadth) {
        this.width = width;
        this.breadth = breadth;
    }
    public void getDimension(){
        System.out.println( width + " " + breadth + " " + depth);
    }
}
