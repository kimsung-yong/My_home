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
    	  System.out.println("판매한 음료의 갯수는"+sellNum+"이고,벌어들인 금액은"+money+"입니다");
      }
	
}
