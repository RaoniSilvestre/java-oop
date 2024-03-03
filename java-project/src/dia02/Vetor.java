package dia02;
import java.util.Vector;

public class Vetor {

  public static void VetorExercicio1() {
    Vector<Integer> v1 = new Vector<>();
    Vector<Integer> v2 = new Vector<>();

    v1.add(1);
    v1.add(3);
    v1.add(5);

    v2.add(2);
    v2.add(4);
    v2.add(6);

    Integer result = 0;

    for (Integer i = 0; i < 3; i++) {
      result += (v1.get(i) * v2.get(i));
    }
    System.out.println(result);
  }

}