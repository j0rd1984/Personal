package ejemplo1.dsa.upc.edu;

/**
 * Created by Jordi on 27/09/2015.
 */
public class Tree {
    private int height;
    private String name;
    private String salida;

    public Tree() {
        this(0, null);
    }

    public Tree(int height) {
        this(height, null);
    }

    public Tree(String name) {
        this(0, name);
    }

    public Tree(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if (name == null)
            sb.append("�rbol");
        else
            sb.append(name);
        if (height > 0)
            sb.append(" de ").append(height).append(" metros");
        return sb.toString();

    }

}