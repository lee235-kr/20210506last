
public class OperationCasting {

	public static void main(String[] args) {
//
		
		
		
		short s = 10;//00000000 00001010
		int i =65537;//0000000 00000000 00000001 00001010
		
		
		int i1 =s +i;
		System.out.println(i1);
		//연산 식에서의 자동형변환
		
		
		
		
		int i2=10;
		double d=170.5;
		double d1=i2+d;
		System.out.println(d1);
		
		// 정수는 4byte 로 연산
		System.out.println(10+20);
	byte b=10;
	byte b1=20;
int b2 =	b+b1;//1byte+1byte(x)
                                 //4byte+4byte(o)

		byte b3=127;  //01111111
        byte b4=2;//  00000010

System.out.println(b3+b4);


short s1=10;
short s2 =20;
int i3 =s1+ s2;//2 byte +2byte+>4byte +4byte
System.out.println(i3);




float f1=10.5f;
float f2=20.5f;
float d2= f1+f2;
System.out.println(d2);

double d3=f1+100.5;
System.out.println(d3);





	}

}
