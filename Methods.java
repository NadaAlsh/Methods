import java.util.ArrayList;
import java.util.List;
public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<>();
     nums.add(3);
     nums.add(7);
     nums.add(5);
System.out.println(sum(nums));
  }

  public static int sum(ArrayList<Integer> num) {
  int sum = 0;
    for(int i = 0; i < num.size(); ++i){
      sum += num.get(i);
    }
    return sum;


  }
   @Override 
  public String toString() {
    return "Main []";
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
   }
}
