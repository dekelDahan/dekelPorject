import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Startable> arr = new ArrayList<>();
        arr.add(new Frige());
        arr.add(new Pc());
        arr.add(new Toster());

        for (Startable item : arr) {
            item.start();
        }

    }
}
