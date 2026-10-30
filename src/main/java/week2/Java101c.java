package week2;

public class Java101c {
    public static void main(String[] args) {
        int sum = 0;
        for (int loop = 9; loop <= 255; loop++){
            if (loop % 2 == 0){
                sum = sum + loop;
            }
        }
        System.out.println(sum);
    }
}
