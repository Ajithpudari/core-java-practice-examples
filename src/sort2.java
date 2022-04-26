import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort2 {

    public static void main(String[] args) {
        int[] arr = { 95, 94, 91, 15, 99, 65, 84};
        List list = new ArrayList();
    /*int tempV = 0;
    int first = arr[arr.length - 1];
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] >= first ) {
            tempV=arr[i];
        }
    }*/
        int first = 0;
        int second = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (first < arr[i]) {
                second = first;
                first = arr[i];
            } else if (second < arr[i]) {
                second = arr[i];
            }
        }
        list.add(first);
        list.add(second);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);
    }

}
