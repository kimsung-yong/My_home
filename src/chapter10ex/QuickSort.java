package chapter10ex;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");

	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descending");

	}
	
	@Override
	public void description() {
		System.out.println("숫자를 정렬 하는 알고리즘입니다");
		System.out.println("QuickSort 입니다");
		
	}


}
