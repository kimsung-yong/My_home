package chapter10ex;
import java.io.IOException;

public class SortTest {
	public static void main(String[] argvs) throws IOException {
		System.out.println("정렬방식을 선택하세요");
		System.out.println("B : BubbleSort");
		System.out.println("H : HeapSort");
		System.out.println("Q : QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		if(ch == 'b' || ch == 'B') {
			sort = new BubbleSort();
		}
		else if(ch == 'h' || ch == 'H') {
			sort = new HeapSort();
		}
		else if(ch == 'q' || ch == 'Q') {
			sort = new QuickSort();
		}
		else {
			System.out.println("지원하지 않는 기능 입니다");
			return;
		}
		//정렬 방식과 상관없이 Sort에 선언된 메서드 호출
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
