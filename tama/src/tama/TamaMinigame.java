package tama;

import java.util.*;

public class TamaMinigame {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	Tama tama = new Tama();
	int inputNum;

	public void ccc() { // ������ ����.
		System.out.println("������ ����");
		System.out.println("1.����  2.������"); // �޴� ���.
		inputNum = scan.nextInt(); // inputNum�� ���� �Է�.

		int number = random.nextInt(2); // ����� ���� �������� �Է�.
		switch (number) { // ����� ���� ���.
		case 0: // '0'�� ���.(������ ���)
			System.out.println("��� : ����");
			break;
		case 1: // '1'�� ���.(������ ���)
			System.out.println("��� : ������");
			break;
		}
		switch (inputNum) { // inputNum�� �Է¹��� �������� ���߸� ȣ���� ����.
		case 1: // �ڽ��� ����'����'�� ���.
			System.out.println("���� ����!"); // �ڽ��� ���� ���.
			if (number == 0) { // ���� ���� �а� ���� ���.
				System.out.println("����");
				Tama.like += 30; // ȣ���� '30' ����.
			} else // ���� ���� �а� �ٸ� ���.
				System.out.println("������.");
			break;

		case 2: // �ڽ��� ����'������'�� ���.
			System.out.println("���� ������!"); // �ڽ��� ���� ���.
			if (number == 1) { // ���� ���� �а� ���� ���.
				System.out.println("����.");
				Tama.like += 30; // ȣ���� '30' ����.
			} else // ���� ���� �а� �ٸ� ���.
				System.out.println("������.");
			break;
		}
	}

	public void gbb() { // ���������� ����.
		int number = random.nextInt(3); // ����� ���� �������� ����.

		System.out.println("���� ���� �� ����");
		System.out.println("1.����  2.����  3.��"); // �޴� ���.
		inputNum = scan.nextInt(); // �ڽ��� �� ����.

		switch (number) { // ����� ���� ���.
		case 0:
			System.out.println("��� : ����");
			break;
		case 1:
			System.out.println("��� : ����");
			break;
		case 2:
			System.out.println("��� : ��");
			break;
		}
		switch (inputNum) { // �ڽ��� ���� ���.
		case 1: // �ڽ��� '����' �� ���.
			System.out.println("���� ����!"); // �ڽ��� �� ���.
			if (number == 0) // ����� ���.
				System.out.println("�����ϴ�.");
			else if (number == 1) // ���� ���.
				System.out.println("�����ϴ�.");
			else { // �̰��� ���.
				System.out.println("�̰���ϴ�.");
				Tama.like += 30; // ȣ���� '30' ����.
			}
			break;

		case 2: // �ڽ��� '����' �� ���.
			System.out.println("���� ����!"); // �ڽ��� �� ���.
			if (number == 0) {
				System.out.println("�̰���ϴ�."); // �̰��� ���.
				Tama.like += 30; // ȣ���� '30' ����.
			} else if (number == 1)
				System.out.println("�����ϴ�."); // ����� ���.
			else
				System.out.println("�����ϴ�."); // ���� ���.
			break;

		case 3:
			System.out.println("���� ��!"); // �ڽ��� '����' �� ���.
			if (number == 0) // �ڽ��� �� ���.
				System.out.println("�����ϴ�.");
			else if (number == 1) {
				System.out.println("�̰���ϴ�."); // �̰��� ���.
				Tama.like += 30; // ȣ���� '30' ����.
			} else
				System.out.println("�����ϴ�."); // ����� ���.
			break;
		}

	}
}
