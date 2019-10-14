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
		orderKim.orderDate = " 2018년 3월 12일";
		orderKim.orderName = " 홍길순";
		orderKim.orderProductNumber = "PD0345-12";
		orderKim.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호:"+orderKim.orderNumber);
		System.out.println("주문자 아이디 :"+ orderKim.orderId);
		System.out.println("주문 날짜 :"+ orderKim.orderDate);
		System.out.println("주문자 이름 :"+ orderKim.orderName);
		System.out.println("주문자 아이디 :"+ orderKim.orderProductNumber);
		System.out.println("배송 주소 :"+ orderKim.orderAddress);
	}

}
                                                    