package tama;
import java.util.Scanner;
public class TamaRank {
	Scanner scan =new Scanner(System.in);
	Tama tama = new Tama();
	
	public void ranking() {						// ������ ������ �� ���� ȣ���� ��ŭ Ŭ���� ����ä��.
		if(Tama.like>=10000) {
			System.out.println(TamaName.tamaName+"\r\n���� ȣ���� ��� ��� S��ũ�Դϴ� ���ϵ帳�ϴ�!\r\n");
		}
		else if(Tama.like>=9800) {
			System.out.println(TamaName.tamaName+"\r\n���� ȣ���� ��� ��� A��ũ�Դϴ� �������� S�� �븮�ڱ���!\r\n");
		}
		else if(Tama.like>=8500) {
			System.out.println(TamaName.tamaName+"\r\n���� ȣ���� ��� ��� B��ũ�Դϴ� ���� �������ּ���!\r\n");
		}
		else if(Tama.like>=7000) {
			System.out.println(TamaName.tamaName+"\r\n���� ȣ���� ��� ��� C��ũ�Դϴ� �����ϼ̽��ϴ�.\r\n");
		}
		else if(Tama.like>=5000) {
			System.out.println(TamaName.tamaName+"\r\n���� ȣ���� ��� ��� D��ũ �Դϴ� �����ϼ̽��ϴ�\r\n");
		}
		else if(Tama.like>=1500) {
			System.out.println(TamaName.tamaName+"\r\n���� ȣ���� �Ի� ��� F��ũ �Դϴ�. �������� �� �Ͻ� �� ���� �ſ���! >.<\r\n");
		}
		else {
			System.out.println("\r\n������ �ٽ� �������ּ���~��.��\r\n");
		}
	}
}
