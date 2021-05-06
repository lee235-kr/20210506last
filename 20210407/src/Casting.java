
public class Casting {

	public static void main(String[] args) {
		// 강제형변환 
		
		
		
int i=10;//00000000 00000000 00000000 0000001010
short s =(short)  i; //강제 형변환 입니다 이게 ㅇㅇ ~
		i= 65537;
		s=(short)i;
		//00000000 00000001 00000000 000000001-00000000 00000000
		System.out.println(s);
		//크기 큰 값을 작은 크기로 변환하는 것을 강제형변환이라고 한다 
		//값이 잘리는 경우가 발생하며 다른값을 가져올수 있다
		float f =15.5f;
		int i1=(int)f;   //실수를 정수로 강제캐스팅 하게되면  정수값만 저장
		System.out.println(i1);
 		
		
		
		
		
	}

}
