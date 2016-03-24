public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<=99; i++){
			String j = String.valueOf(i);
			int count = 0;
			for(int k=0; k<j.length(); ++k){
				int x = Integer.valueOf(j.substring(k, k+1));
				if(x==3 || x==6 || x==9){
					count+=1;
				}
			}
			if(count==1){
				System.out.print(i);
				System.out.println("¦");
			}
			else if(count==2){
				System.out.print(i);
				System.out.println("¦¦");
			}
		}
	}
}