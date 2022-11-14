package java221110;

import java.util.Formatter;

public class FormatterEx {
	/*
	 * java.util.Formatter
	 * 1)일반 문자, 그리고 숫자 형들을 위해 포맷규칙
	 *  %[argument_index$][flags][width][. precision]conversion
	 * 2)날짜/시간들을 표현하도록 사용된 형들에 대한 포맷 규칙
	 *  %[argument_index$][flags][width]conversion
	 * 3)인자들에 부합하지 않은 포맷 규칙
	 * %[flags][width]conversion
	 * 
	 * **문법 구성 설명
	 * 1)[argument_index$] : 인자 인덱스는 전달된 인자 목록에서 인자의 위치를 표시한 십진수 정수다.
	 *                     첫번째 인자는 1$로 표현되며 두번째 인자는 2$형식으로 표현한다.(위치)
	 * 2)[flags] : 표현하고자 하는 객체 타입에 따라 출력형식을 바꿀 수 있는 문제 셋을 의미 (출력형식)
	 * 3)[width] : 출력 시 사용되는 글자들의 최저 수를 의미한다.(최소값)(글자수)
	 * 4)[.precision] 출력 시 사용되는 글자들의 수를 제한하기 위한 것이며 이것은 곧 표현될 글자들의 최대수가 된다.(정밀도)
	 * 5)conversion : 전달된 인자가 어떻게 포맷되어야 하는지를 알리는 포맷형식. 문자 셋을 의미한다. (예 : b, h,s)                 
	*/ 
	public static void main(String[] args) {
		Formatter f=new Formatter();
		
		f.format("%1$b, %3$h, %2$5s", false,500,'a');
		System.out.println(f.toString());
	}

}
