package chapter10ex;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort asceding");

	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");

	}
	
	@Override
	public void description() {
		System.out.println("숫자를 정렬 하는 알고리즘입니다");
		System.out.println("HeapSort 입니다");
		
	}

}
