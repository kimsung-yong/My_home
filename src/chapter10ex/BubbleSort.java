package chapter10ex;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");

	}

	@Override
	public void descending(int[] arr) {
		System.out.println("BubbleSort descending");

	}

	@Override
	public void description() {
		System.out.println("숫자를 정렬 하는 알고리즘입니다");
		System.out.println("BubbleSort 입니다");

	}

}
