import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;

public class Array {
    public static void main(String[] args){
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;

        Integer[] a = {2,1,4,3,2,6,3,8};
        v1 = new ArrayList<>(Arrays.asList(a));

        List<Integer> v2 = v1;
        List<Integer> v3 = new ArrayList<>(v2);

        System.out.println(v1.size()+ " "+ v2.size()+" "+ v3.size());

        System.out.println(v3.get(0));

        v3.set(0,-1);
        v3.add(-9);
        v3.add(1,-19);
        System.out.println("Size:" + v3.size());
        for(int item : v3){
            System.out.println(item);
        }
        Collections.sort(v3);
        System.out.println("Sorted Array");
        for(int item : v3){
            System.out.println(item);
        }
        v3.remove(1);
        System.out.println(v3);
    }
}
