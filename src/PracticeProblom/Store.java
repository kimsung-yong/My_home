package PracticeProblom;

public class Store {
      private static int money;
      static int sellNum;
      public Store() {
    	  
      }
      
      public static void sell(int money) {
    	  Store.money += money;
    	  sellNum++;
      }
      
      public void showInfo() {
    	  System.out.println("�Ǹ��� ������ ������"+sellNum+"�̰�,������� �ݾ���"+money+"�Դϴ�");
      }
	
}
