package tama;

public class TamaCounter {
	TamaQuiz quiz = new TamaQuiz();
	
	public void actCount() { 				// �� ������ �ϸ� �ٸ� �������� ī���� ����
		switch (Tama.inputNum) {
		case 4:								// '��Ѵ�'�� ���� ������ ������ ī���� ���ҿ� �ð��� '1'����.
			Tama.cplay -= 2;
			Tama.cfeed -= 8;
			Tama.cshower -= 10; Tama.time += 1.0; 
			break; 							
		case 3:								// '�Ĵ�'�� ���� ������ ������ ī���� ���ҿ� �ð��� '2'����.
			Tama.cplay -= 2;
			Tama.cfeed -= 4;
			Tama.chealth -= 2; Tama.time += 2.0; 
			break; 							
		case 2:								// '�Դ�'�� ���� ������ ������ ī���� ���ҿ� �ð��� '1.8'����.
			Tama.cplay -= 2;
			Tama.cshower -= 5;
			Tama.chealth -= 5; Tama.time += 1.8; 
			break; 							
		case 1:								// '���'�� ���� ������ ������ ī���� ���ҿ� �ð��� '0.3'����.
			Tama.cfeed -= 5;
			Tama.cshower -= 5;
			Tama.chealth -= 2; Tama.time += 0.3; 
			break;							
		}
	}
	public void dayCount() {	// Tama.time(�ð�)�� '24'�̻��� �ɰ�� Tama.Dday(��¥)�� '1' ����.
		if (Tama.time >= 24) {		// Tama.time�� '24'�̻��� ���
			Tama.Dday += 1;			// ��¥�� '1' ����.
			Tama.dCount += 1;		// ��¥ī���Ͱ� '1' ����.
			Tama.time -= 24;			// �ð��� '24' ����.(�������� �ɶ� �� ������ ����� �ð��� �Ѿ�´�. ex)23�� 1.3�ð���ŭ �帣�� ��¥�� 1�����ϰ� �ð��� 0.3)
			Tama.chanceTime = 0;		// chanceTama.time�� '0'�� �Է�.
			Tama.cplay -= 10;		// Tama.cplay�� '10'��ŭ ����.
			Tama.cfeed -= 20;		// Tama.cfeed�� '20'��ŭ ����.
			Tama.cshower -= 10;		// Tama.cshower�� '10'��ŭ ����.
			Tama.chealth -= 15;		// Tama.chealth�� '15'��ŭ ����.
		}
	}
	public void ageCount() {			// Tama.dCount(��¥ī��Ʈ)�� '7'�� �Ǹ� Tama.age(����)�� '1' ����.
		if (Tama.dCount % 7 == 0) {			// Tama.dCount�� '7'�� ������ ������ �� ���
			Tama.dCount = 1;					// Tama.dCount�� '0'�� �ʱ�ȭ.
			Tama.age +=1;					// Tama.age�� '1' ����.
			switch(Tama.age) {				// Tama.age�� �����Կ� ���� �������.
			case 1: quiz.quiz1(); break;
			case 2: quiz.quiz2(); break;
			case 3: quiz.quiz3(); break;
			case 4: quiz.quiz4(); break;
			case 5: quiz.quiz5(); break;
			case 6: quiz.quiz6(); break;
			case 7: quiz.quiz7(); break;
			case 8: quiz.quiz8(); break;
			case 9: quiz.quiz9(); break;
			case 10: quiz.quiz10(); break;
			}
		}
	}
	public void warning() { 			// �� ������ ī���Ϳ� ���� �˸��� ��� �Ǵ� ȣ���� ����.
		if (Tama.cplay < 10) { 						// Tama.cplay�� '10'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� �ܷο� �ϰ��־��!");
			Tama.like -= 3;							// Tama.like '3' ����.
		} else if (Tama.cplay < 40)					// Tama.cplay�� '40'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� �ɽ��� �ϰ��־��!");

		if (Tama.cfeed < 10) { 						// Tama.cfeed�� '10'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� ���ָ��� �־��!");
			Tama.like -= 10;							// Tama.like '10' ����.
		} else if (Tama.cfeed < 30)					// Tama.cfeed�� '30'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� ����� �մϴ�!");

		if (Tama.cshower < 20) { 					// Tama.cshower�� '20'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� �����������!");
			Tama.like -= 14;							// Tama.like '14' ����.
		} else if (Tama.cshower < 50)				// schower�� '50'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� ������ �������!");	

		if (Tama.chealth < 10) { 					// Tama.chealth�� '10'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"�� ��� �ؾ߰ھ��!");
			Tama.like -= 6;							// Tama.like '6' ����.
		} else if (Tama.chealth < 40)				// Tama.chealth�� '40'�̸��� ���.
			System.out.print("(����-`��)\r\n"+TamaName.tamaName+"���� ���� �����մϴ�.");
		System.out.println();
	}
}
