package java221110;

import java.util.Arrays;

public class EqualsExample {

	public static void main(String[] args) {
		int[][] original = {{1,2},{3,4}};
		
		/*
		 * equals(),1차 항목의 값만 비교, 주소x
		 * deepEqauls() 1차 항목이 서로 다른 배열을 참조할 경우 중첩된 배열의 항목까지 비교한다. 값,주소o
		*/
		//앞은 복사 후 비교
		System.out.println("[얕은 복제 후 비교]");
		int[][] cloned1=Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: "+original.equals(cloned1));
		System.out.println(original.hashCode()+","+cloned1.hashCode());
		System.out.println("1차 배열 항목값 비교: "+Arrays.equals(original, cloned1));
		System.out.println(original.hashCode()+","+cloned1.hashCode());
		System.out.println("중첩 배열 항목값 비교" + Arrays.deepEquals(original, cloned1));
		System.out.println(original.hashCode()+","+cloned1.hashCode());
		
		
		System.out.println();
		//깊은 복사 후 비교
		System.out.println("[깊은 복제 후 비교]");
		int[][] cloned2=Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println(cloned2.hashCode());
		
		System.out.println("배열 번지 비교: "+original.equals(cloned2));
		System.out.println(original.hashCode()+","+cloned2.hashCode());
		System.out.println("1차 배열 항목값 비교: "+Arrays.equals(original, cloned2));
		System.out.println(original.hashCode()+","+cloned2.hashCode());
		System.out.println("중첩 배열 항목값 비교: " + Arrays.deepEquals(original, cloned2));
		System.out.println(original.hashCode()+","+cloned2.hashCode());
	}

}
