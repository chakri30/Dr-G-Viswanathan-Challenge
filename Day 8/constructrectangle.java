import java.util.*;
public class constructrectangle {
    public int[] constructRectangle(int area){
        int width = (int)Math.sqrt(area);
        while(area % width != 0){
            width--;
        }
        int length = area / width;
        return new int[]{length,width};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        constructrectangle solution = new constructrectangle();
        int[] result = solution.constructRectangle(area);
        for(int ind : result){
            System.out.print("[" +ind + "]");
        }
    }
    
}
