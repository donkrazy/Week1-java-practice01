import java.util.Scanner;

public class MultipleOfTree {

	public static void main(String[] args) {
		while(true){
			System.out.println("수를 입력하시오 : ");
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			int e = d%3;
			if(e==0){
				System.out.println("3의 배수입니다");
			}
			else{
				System.out.println("3의 배수가 아닙니다");
			}
		}
	}

}
