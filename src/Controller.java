import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Controller {
	String name;
	String num;
	String mail;
	Scanner sc = new Scanner(System.in);
	ArrayList<String> username = new ArrayList<String>();
	ArrayList<User> list = new ArrayList<User>();
	ArrayList<User> printList = new ArrayList<User>();
	User[] user = new User[4];
	User o;
	int cnt = 0;

	Controller() {
		while (cnt < 4) {
			System.out.println("�л� ������ �Է��ϼ���");
			System.out.print("�̸� : ");
			name = sc.next();
			System.out.print("��ȣ : ");
			num = sc.next();
			System.out.print("���� : ");
			mail = sc.next();
			if (!username.contains(name)) {
				username.add(name);
				list.add(new User(name, num, mail));
				System.out.println("�ߺ��Ǵ� �̸��� �����ϴ�.");
				System.out.println("��ϿϷ�!");
			} else {
				System.out.println("�ߺ��̸� �߻����� ��� ����");
			}
			cnt++;
		}
		Collections.sort(username);
		System.out.println(username);
		for (int i = 0; i < username.size(); i++) {
			int cnt2 = 0;
			o = list.get(i);
			while (cnt2 < username.size()) {
				if (username.get(cnt2).equals(o.getName())) {
					user[cnt] = o;
					cnt2 = 0;
				} else {
					cnt2++;
				}
				if (user.length == username.size()) {
					break;
				}
			}
		}
		System.out.println(username.size());

	}
}
