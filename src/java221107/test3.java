package java221107;

public class test3 {
static int getnumber() {
	return(int)(Math.random()*45+1);
}
	public static void main(String[] args) {
		int[] lotto =new int[6];
		int i;
		
		System.out.println("lotto start");
		
		for(i=0; i<lotto.length;i++) {
			lotto[i]=getnumber();
			for(int j=0; j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i]+" ");
		}

	}

}
