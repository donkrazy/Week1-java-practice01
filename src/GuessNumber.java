import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int ans = 44;
		while(true){
			System.out.print("���� �Է��Ͻÿ� : ");
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			if(ans>d){
				System.out.println("ũ��");
				System.out.println(d+"~100");
			}
			else if(ans<d){
				System.out.println("�۴�");
				System.out.println("0~"+d);
			}
			else if(ans==d){
				System.out.println("����");
				System.out.println("�ٽ��ҷ�?(y/n): ");
				Scanner sc2 = new Scanner(System.in);
				String e = sc2.next();
				if(e.equals("y")){
					continue;
				}
				else if(e.equals("n")){
					System.out.println("�����ϼ̽��ϴ�");
					break;
				}
				else{
					System.out.println("������");
				}
			}
			else{
				System.out.println("�Է°� ����");
			}
		}
	}
}
