
public class promotion {

	public static void main(String[] args) {
		// 자동형 변환
		//작은단위가 큰단위로 들어가는것 이것이 자동 형변환 
		
		
		
		
		
		
		byte b= 10;      //00001010
		short s = b;      //0000000 00001010
        int i=s;             //0000 0000 0000 1010
        long l=i;          //00000000 00000000 00000000 00000000 00000000 0000000 00000000 00001010 
		
		
	
	float f =0.5f;
	double d =f;           //자동형변환
	
	
	f=i;
	System.out.println(f);
	f=l;
	System.out.println(f);
	//실수는 정수보다 크다 
	//byte<short<int<long<float<double
	double e= 3e2;//지수는 실수형으로만 저장이 가능하다
	
	}
	

}
