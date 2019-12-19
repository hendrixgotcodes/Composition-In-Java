public class Main {

    public static void main(String[] args){

        Dimension dimension = new Dimension(30,50,17);
        Door door = new Door(dimension,new Paint("Brown"));
        Paint paint = new Paint("Nice");
        Window window = new Window(dimension,new Paint("Blue"));

        room Room = new room(door,window,paint,dimension);
        System.out.println(Room.window.color.getColor());
        System.out.println(Room.getDoor().paint.getColor());
        System.out.println(Room.getPaint().getColor());

    }

}
