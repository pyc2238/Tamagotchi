package tama;
import java.util.*;
public class TamaEnd {
	Scanner scan = new Scanner(System.in);
	public void end() {							// ����� ���� ��Ʈ�� ��ȣ�� �Է��ϸ� ���󿣵�.
		String answerStr;							// ���ڿ��Է¹��� ����.
		System.out.println("\r\nPassword : \r\n");	
		answerStr = scan.next();					// ������ �Է°� �Է�.
		if(answerStr.equals("����������J2ȭ����")) {		// �Է¹��� ���ڰ� "����������J2ȭ����" �� ���.
			System.out.println("\r\n������� Ŭ���� �Ͻ� "+TamaName.tamaName+"�� ���ϵ帳�ϴ�!\r\n �����ε� �Ͻô� �� ��� �ߵǽñ� �ٶ�ڽ��ϴ�*^^* \r\n");			// ���󿣵�.
		}
		else {
			System.out.println("\r\nERROR.\r\n");			// ��ȣ�� Ʋ���� ���.
		}
	}
	public void reStart() {						// ������ ������ �� ����� �Ұ��� �������� ����.
		System.out.println("������ ����Ǿ����ϴ�. �����ϼ̽��ϴ� ~.~");		
		System.out.print("1. �����  2. ����");		// �޴� ���.
		Tama.inputNum = scan.nextInt();				// ����.
	}
}
