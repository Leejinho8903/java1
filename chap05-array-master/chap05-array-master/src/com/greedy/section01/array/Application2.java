package com.greedy.section01.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {
		
		/* 배열의 사용 방법 */
		
		/* 배열의 선언 */
		/* 자료형[] 변수명;
		 * 자료형 변수명[]; 으로 선언할 수 있다.
		 * */
		
		/* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
		int[] iarr;
		char carr[];
		
		/* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
		 * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
		 * 발생한 주소를 레퍼런스 변수(참조형 변수)에 저장하고 이것을 참조하여 사용하기 때문에
		 * 참조 자료형(reference type)이라고 한다.
		 * */
		
		/* 배열을 할당할 떄는 반드시 배열의 크기를 지정해주어야 한다. */
		//iarr = new int[];
		iarr = new int[5];
		carr = new char[10];
		
		/* 선언과 할당을 동시에 할 수 있다. */
		int[] iarr2 = new int[5];
		char carr2[] = new char[10];
		
		/* heap 메모리는 이름으로 접근하는 것이 아니라 주소로 접근하는 영역이다.
		 * stack에 저장 된 주소로 heap에 할당 된 배열을 찾아갈 수 있다.
		 * */
		System.out.println("iarr : " + iarr);	//16진수 주소 값 출력 
		System.out.println("carr : " + carr);
		
		/* hashCode() : 일반적으로는 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
		 * */
		System.out.println("iarr의 hashcode : " + iarr.hashCode());
		System.out.println("carr의 hashcode : " + carr.hashCode());
		
		/* 배열의 길이를 알 수 있는 기능을 필드로 제공하고 있다. 
		 * 필드는 뒤에서 다시 다룬다. (일종의 변수)
		 * 참고로 String 문자열의 길이는 메소드로 제공하고 있기 때문에 문자열.length()로 사용한다.
		 * */
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("carr2의 길이 : " + carr2.length);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		/* 한 번 지정한 배열의 크기는 변경하지 못한다. */
		/* 배열의 사이즈를 변경한 것이 아니고 새로운 배열을 생성하여 그 주소 값을 레퍼런스 변수에 덮어쓴 것이다. */
		darr = new double[30];
		
		/* hashcode를 보면 다른 값을 가지고 있는 것을 확인할 수 있다.*/
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		/* 한 번 할당 된 배열을 직접 지울수는 없다.
		 * 다만 레퍼런스 변수를 null로 변경하면, 더 이상 주소가 참조 되지 않는 배열은 일정 시간이 지난 후
		 * heap의 old 영역으로 이동하여 GC(가비지컬렉터)가 삭제시킨다.
		 * 한 번 찾아갈 수 있는 주소 값을 잃어버린 배열은 다시 참조 불가능하다.*/
		darr = null;
		
		/* java.lang.NullPointerException이 발생함
		 * 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있는 경우 참조연산자를 사용하게 될 때 발생하는 에러이다. */
		System.out.println("darr의 hashcode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
	}

	
	
	
	
	
	
	
	
	
	
}
