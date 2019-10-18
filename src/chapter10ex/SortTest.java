package chapter10ex;
import java.io.IOException;

public class SortTest {
	public static void main(String[] argvs) throws IOException {
		System.out.println("���Ĺ���� �����ϼ���");
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
			System.out.println("�������� �ʴ� ��� �Դϴ�");
			return;
		}
		//���� ��İ� ������� Sort�� ����� �޼��� ȣ��
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
}
