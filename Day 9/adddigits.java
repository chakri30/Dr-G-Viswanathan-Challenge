import java.util.*;
public class adddigits {
    public static int add(int num){
        if(num == 0){
            return 0;
        }
        return (num % 9 == 0) ? 9 : num % 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nnum = sc.nextInt();
        System.out.println(add(nnum));
        sc.close();
    }
}
