public class Ship {
    //attributes
    public String type;
    public int width;
    public int height;
    public int[] location;

    //constructor
    public class Ship (String type, int width, int height, int[] location) {
        super();
        this.type = type;
        this.height = height;
        this.width = width;
        this.location = location;
    }

    //getters and setters
    public String getType() {
        return type;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public int[] getLocation() {
        return location;
    }

}
