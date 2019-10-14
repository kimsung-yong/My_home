package ksyjava;

public class ExplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dNum= 1.2;
		float fNum = 0.9f;
		
		int iNum3 = (int)dNum + (int)fNum;
		int iNum4 = (int)(dNum + fNum);
		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}

