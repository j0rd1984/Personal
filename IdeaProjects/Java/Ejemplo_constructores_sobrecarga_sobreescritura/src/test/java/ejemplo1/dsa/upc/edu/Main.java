package ejemplo1.dsa.upc.edu;
import org.junit.Test;
/**
 * Created by Jordi on 27/09/2015.
 */
public class Main {
    @Test
    public void App(String args[]) throws Exception {
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5,"Pino");

        for (Tree t : arboles)
            System.out.println(t);

    }


}
