package ch03;

public class ch03_13 {
	public static void main(String args[]){
	int i,j;
	System.out.println("Break one loop");
	for(i=1;i<10;i++){
		for (j=1;j<=i;j++){
			if(j==5){
				continue;
			}
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println();
	
	System.out.println("Break two loops");
	
	out1:
		for(i=1;i<10;i++){
			for (j=1;j<=i;j++){
				if(j==5){
					continue out1;
				}
				System.out.print(j);
			}
			System.out.println();
		}
	System.out.println();
	}
}
