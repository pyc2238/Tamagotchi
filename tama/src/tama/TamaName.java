package tama;
import java.util.*;
public class TamaName {
	Scanner scan = new Scanner(System.in);
	static String tamaName;
	
	public void naming() {			// �ٸ���ġ�� �̸��� �Է¹���.
		System.out.print("�����ٷ� �ٸ���ġ�� �̸��� �������� �ұ��?\n�Է� : \n");
		tamaName = scan.next();		// tamaName������ �̸� �Է�.
		System.out.println("\r\n��ȯ���մϴ�! "+tamaName+"��\r\n");
	}
}
