package tama;
import java.util.*;
public class TamaAction {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	TamaMinigame minigame = new TamaMinigame();
	public void action() {								// �ٸ���ġ���� ������ �����ϴ� �޼ҵ�.
		while(true) {						// �Է¹��� ���� �߸��� ��� �ٽ� �޴�������ϰ� �Է¹ް� �Ѵ�.
		System.out.println("\r\n������ �Ͻðڽ��ϱ�?");
		System.out.print("(1.���) (2.��Ա�) (3.�ı�) (4.�) (5.����)");	// �����޴� ���.
		if(Tama.gameChance == true ) {						// gameChance�� 'true'�� ���.(�̴ϰ����� ������ ���)
			System.out.print(" (6.�̴ϰ���)");				// "6.�̴ϰ���" �׸��� ���.
		}
		System.out.print("\n�Է� : ");
		Tama.inputNum = scan.nextInt();	// ���� �Է�			// inputNum�� �����Է�.
		System.out.println("\r\r");
		if(Tama.inputNum < 1 || 6 < Tama.inputNum || (Tama.inputNum == 6 && Tama.gameChance == false)) {	// �Է¹��� ���ڰ� '1~6'�� �ƴϰų� �̴ϰ����� �Ҽ� ���°�쿡 '6'�� �Է����� ���
			System.out.println("�߸��� �Է��Դϴ�.");
			continue;									// while���� ó������ ���ư���.
		}
		else break;										// �׷��� ������� while���� �������´�.
		}
		switch(Tama.inputNum) {				// �Է¹��� ���ڿ� ���� �ش� case ����.
		case 6:	miniGame(); break;		// '6'�� �Է����� ��� �̴ϰ��� ����.
		case 5: break;					// '5'�� �Է����� ��� ���� �޼ҵ忡 ���ؼ� ������ ����ȴ�. 
		case 4: health(); break;		// '4'�� �Է����� ��� health�޼ҵ� ����. 
		case 3: shower(); break;		// '3'�� �Է����� ��� shower�޼ҵ� ����.
		case 2: feed(); break;			// '2'�� �Է����� ��� feed�޼ҵ� ����.
		case 1: play(); break;			// '1'�� �Է����� ��� play�޼ҵ� ����.
		}
	}
	public void miniGame() {				// �̴ϰ��ӽ���.
		Tama.time += 1;							// �ð��� '1' ����.
		Tama.gameChance = false;					// Tama.gameChance�� 'false'�� �Ϸ�.(�̴ϰ����� �� ��ȸ�� ���ش�.)
		int whatGame = random.nextInt(2);	// whatGame�� '0'��'1'�� �������� ���� �Է�.
		switch(whatGame) {					// whatGame�� �Էµ� �������� �ش� case ����	.
		case 0 : minigame.gbb(); break;				// ���������� ���� ����.
		case 1 : minigame.ccc(); break;				// ������ ���� ����.
		}
	}
	public void health() { 						// '��Ѵ�'�� ���� ������ ����
		if (Tama.chealth < 100) {					// chealth�� '100'�̸��� ���.
			Tama.chealth += 9;						// chealth���� '9'��ŭ ����.
			Tama.like += 1;							// like���� '1'��ŭ ����.
			System.out.println("��(*^��^*)����(*�ޡ��*)��\r\n"  +TamaName.tamaName+"���� ���� ưư�� �����ϴ�.");		
		}
		else									// �׷��� ���� ��� �˸����� ���.
			System.out.println("��(����o�ƣ�)����(���ơۡƣ�)��\r\n���̻��� ��� �׸��μ���!\r\n");
	}
	public void shower() { 						// '�Ĵ´�'�� ���� ������ ����
		if (Tama.cshower < 100) {					// cshower�� '100'�̸��� ���.
			Tama.cshower += 42;						// cshower���� '42'��ŭ ����.
			Tama.like += 1;							// like���� '1'��ŭ ����.
			System.out.println("��(*^��^*)����(*�ޡ��*)��\r\n"+TamaName.tamaName+"���� ���� �����������ϴ�.\r\n");
		}
		else									// �׷��� ���� ��� �˸����� ���.
			System.out.println("��(����o�ƣ�)����(���ơۡƣ�)��\r\n�Ǻΰ� ��� �����ھ��!\r\n");
	}
	public void feed() { 						// '�Դ�'�� ���� ������ ����
		if (Tama.cfeed < 100) {						// cfeed�� '100'�̸��� ���.
			Tama.cfeed += 21;						// cfeed���� '21'��ŭ ����.
			Tama.like += 3;							// like���� '3'��ŭ ����.
			System.out.println("��(*^��^*)����(*�ޡ��*)��\r\n���� ������ ����� �������ϴ�!\r\n");
		}
		else									// �׷��� ���� ��� �˸����� ���.
			System.out.println("��(����o�ƣ�)����(���ơۡƣ�)��\r\n"+TamaName.tamaName+"�� �谡 ���������ھ��!\r\n");
	}
	
	
	public void play() { 						// '���'�� ���� ������ ����
		
		
		if (Tama.cplay < 100) {						// cplay�� '100'�̸��� ���.
			Tama.cplay += 7;							// cplay���� '7'��ŭ ����.
			Tama.like += 1;							// like���� '1'��ŭ ����.
			System.out.println("��(*^��^*)����(*�ޡ��*)��\r\n"+TamaName.tamaName+"���� ��ſ��մϴ�.\r\n");
			
		}
		
		else									// �׷��� ���� ��� �˸����� ���.
			System.out.println("��(����o�ƣ�)����(���ơۡƣ�)��\r\n��°��� �׸� �־߰ڳ׿�.\r\n");
	}
}
