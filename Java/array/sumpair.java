package array;

import java.util.HashMap;
import java.util.Map;

public class sumpair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 1, 4, 3 };
		sumpair(arr, 6);

	}

	public static void sumpair(int[] arr, int k) {
		Map<Integer, Integer> temp = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (temp.containsKey(arr[i])) {
				temp.put(arr[i], temp.get(arr[i]) + 1);
			} else {
				temp.put(arr[i], 1);
			}
		}
		int sumpair = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp.containsKey(k - arr[i])) {
				sumpair += temp.get(k - arr[i]);
			}
			if (k - arr[i] == arr[i]) {
				sumpair--;
			}
		}

		System.out.println(sumpair / 2);
	}

}




//Optimal Aproach

public class DSA18 {
    public static void main(String[] args) {
        int[] a={1,5,1,7};
        int k=6;
        int ans=0;
        Map<Integer,Integer> h=new HashMap<Integer,Integer>();
        for (int i=0; i<a.length;i++){
            int b=k-a[i];
            if(h.containsKey(b)){
                ans+=h.get(b);
            }
            if(h.get(a[i])==null){
                h.put(a[i],1);
                continue;
            }
            h.put(a[i],h.get(a[i])+1);
        }
        System.out.println(ans);
    }
}
