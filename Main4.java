/* pattern 11 problem stars in reverse
*/import java.util.Scanner;
class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =1; i<=n ;i++){
            for (int j =1 ; j<=i-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ;j<= (2*n) - (2*i-1) ; j ++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}