import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		while(true){
			System.out.println("���� �Է��Ͻÿ� : ");
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			int e = d%3;
			if(e==0){
				System.out.println("3�� ����Դϴ�");
			}
			else{
				System.out.println("3�� ����� �ƴմϴ�");
			}
		}
	}

}
