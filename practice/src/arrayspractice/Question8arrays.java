package arrayspractice;
import java.util.*;
public class Question8arrays {
	public static void main(String[] args) {
		 int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
         sc.close();
        int n1 = 6,n2=7,s=0;
        boolean flag = false;
        for(int i : a){
            if(i == n1){
                flag = true;
            }
            if(flag == true){
                if(i == n2){
                    flag = false;
                }
                continue;
            }
            else{
                if(i == 7 ){
                    s += 6+i;
                }
                else
                    s += i;
            }
        }
        System.out.println("sum is "+s);
	}
}
