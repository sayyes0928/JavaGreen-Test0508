import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Controller2 {
	String name;
	String num;
	String mail;
	Scanner sc = new Scanner(System.in);
	ArrayList<String> username = new ArrayList<String>();
	ArrayList<User> list = new ArrayList<User>();
	ArrayList<User> printList = new ArrayList<User>();
	User o;
	int cnt = 0;
	int cnt2 = 0;

	Controller2() {
		User[] user = new User[5];
		while (cnt < 4) {
			System.out.println("학생 정보를 입력하세요");
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("번호 : ");
			num = sc.next();
			System.out.print("메일 : ");
			mail = sc.next();

			if (!username.contains(name)) {
				username.add(name);
				user[cnt2] = new User(name, num, mail);
				cnt2++;
				System.out.println("중복되는 이름이 없습니다.");
				System.out.println("등록완료!");
			} else {
				System.out.println("중복이름 발생으로 등록 안함");
			}
			cnt++;
		}
		Collections.sort(username);
		System.out.println(username);

		User[] temp = new User[username.size()];
		for (int i = 0; i < username.size(); i++) {

			for (int k = 0; k < username.size(); k++) {
				if (username.get(i).equals(user[k].getName())) {
					temp[i] = user[k];
				}
			}
		}

		System.out.println(username.size());

		for (int i = 0; i < username.size(); i++) {
			System.out.println(temp[i].getName() + temp[i].getNum() + temp[i].getMail());
		}

	}
}
