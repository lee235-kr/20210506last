
public class promotion {

	public static void main(String[] args) {
		// �ڵ��� ��ȯ
		//���������� ū������ ���°� �̰��� �ڵ� ����ȯ 
		
		
		
		
		
		
		byte b= 10;      //00001010
		short s = b;      //0000000 00001010
        int i=s;             //0000 0000 0000 1010
        long l=i;          //00000000 00000000 00000000 00000000 00000000 0000000 00000000 00001010 
		
		
	
	float f =0.5f;
	double d =f;           //�ڵ�����ȯ
	
	
	f=i;
	System.out.println(f);
	f=l;
	System.out.println(f);
	//�Ǽ��� �������� ũ�� 
	//byte<short<int<long<float<double
	double e= 3e2;//������ �Ǽ������θ� ������ �����ϴ�
	
	}
	

}
