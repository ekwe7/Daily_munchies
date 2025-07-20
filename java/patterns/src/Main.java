//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        partern6(5);
    }
    
    static void partern1(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void partern2(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void partern3(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n - row + 1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void partern4(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void partern5(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
    static void partern6(int n){
        for (int row = 0; row < 2 * n ; row++) {
//            int totalColInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < row ; col++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

}