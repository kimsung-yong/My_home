package chapter5;

public class Order {

	String orderNumber;
	String orderId;
	String orderDate;
	String orderName;
	String orderProductNumber;
	String orderAddress;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order orderKim = new Order();
		
		orderKim.orderNumber = "201803120001";
		orderKim.orderId = "abc123";
		orderKim.orderDate = " 2018�� 3�� 12��";
		orderKim.orderName = " ȫ���";
		orderKim.orderProductNumber = "PD0345-12";
		orderKim.orderAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ:"+orderKim.orderNumber);
		System.out.println("�ֹ��� ���̵� :"+ orderKim.orderId);
		System.out.println("�ֹ� ��¥ :"+ orderKim.orderDate);
		System.out.println("�ֹ��� �̸� :"+ orderKim.orderName);
		System.out.println("�ֹ��� ���̵� :"+ orderKim.orderProductNumber);
		System.out.println("��� �ּ� :"+ orderKim.orderAddress);
	}

}
                                                    