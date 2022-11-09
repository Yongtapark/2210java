package java221108;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsExample {

	public static void main(String[] args) {
		Integer o1=1000;
		Integer o2=1000;
		System.out.println(Objects.equals(o1, o2));//true		nn , nn ==> a.equals(b)의 값비교
		System.out.println(Objects.equals(o1, null));//false	nn , n  ==> false
		System.out.println(Objects.equals(null, o2));//false	n  , nn ==> false
		System.out.println(Objects.equals(null, null));//true	n  , n 	==> 둘다 null일때 참
		System.out.println(Objects.deepEquals(o1, o2)+"\n");//true n, n ==> 둘다 null일때 참
		
		Integer[] arr1= {1,2};
		Integer[] arr2= {1,2};
		System.out.println(Objects.equals(arr1, arr2));//false(주소비교)
		System.out.println(Objects.deepEquals(arr1, arr2));//true nn, nn ==> a.eqauls(b)의 값비교
		System.out.println(Arrays.deepEquals(arr1, arr2));//true  nn, nn ==> a.equals(b)의 값비교
		System.out.println(Objects.deepEquals(null, arr2));//false n, nn ==> false
		System.out.println(Objects.deepEquals(arr1, null));//false nn, n ==> false
		System.out.println(Objects.deepEquals(null, null));//true 	n, n ==> 둘다 null일때 참

	}

}
