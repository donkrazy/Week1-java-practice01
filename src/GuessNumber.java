import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int ans = 44;
		while(true){
			System.out.print("수를 입력하시오 : ");
			Scanner sc = new Scanner(System.in);
			int d = sc.nextInt();
			if(ans>d){
				System.out.println("크다");
				System.out.println(d+"~100");
			}
			else if(ans<d){
				System.out.println("작다");
				System.out.println("0~"+d);
			}
			else if(ans==d){
				System.out.println("정답");
				System.out.println("다시할래?(y/n): ");
				Scanner sc2 = new Scanner(System.in);
				String e = sc2.next();
				if(e.equals("y")){
					continue;
				}
				else if(e.equals("n")){
					System.out.println("수고하셨습니다");
					break;
				}
				else{
					System.out.println("뭐래니");
				}
			}
			else{
				System.out.println("입력값 오류");
			}
		}
	}
}
