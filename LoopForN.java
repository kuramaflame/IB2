



import java.util.Scanner;


public class LoopForN {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        int n = Integer.parseInt(newObj.nextLine());
        int sum = 0;
        for (int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}



