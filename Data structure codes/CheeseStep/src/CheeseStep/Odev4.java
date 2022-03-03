package CheeseStep;

public class Odev4 {

    public static void main(String[] args) {
        // the minimum step from one point to another point in cheese for horse
        Kuyruk k = new Kuyruk();
        k.BFS(new Eleman(3, 6), new Eleman(6, 3));
        // the distance from (0, 0 ) to any point example from (0,0) to (0,7) seven step
        k.mesafe(new Eleman(0, 7));
  
    }

}
