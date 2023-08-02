public class Occurances {
    public static void main(String[] args) {
        long n = 455757595987595L;
        int count = 0;
        while(n > 0){
            int remain = (int)(n % 10);
            if(remain == 5){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}