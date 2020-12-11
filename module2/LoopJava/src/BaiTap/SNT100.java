package BaiTap;

public class SNT100 {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;
        while (count < 100){
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(n); i++){
                if( n % i == 0){
                    check = false;
                }
            }
            if(check = true){
                System.out.println(n + " ");
                count ++;
            }
            n ++;
        }
        System.out.println();
    }
}
