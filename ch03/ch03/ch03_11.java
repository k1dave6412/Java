package ch03;

public class ch03_11 {
	public static void main(String args[]){
		int n=40,m=180;
		int temp=0;
		System.out.println("n= "+n+" m= "+m);
		do{
			temp=m%n;
			m=n;
			n=temp;
		}while(n!=0);
		System.out.println("GCM is "+m);
	}
}
