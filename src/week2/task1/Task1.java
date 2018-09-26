package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        if(b==0) return a;
        else
            return gcd(b,a%b);
        // TODO: Tính ước chung lớn nhất của 2 số a, b
    }

    public static int fibonacci(int n) {
        if(n<0) {
            return -1;
        }
        else if(n==0) {
            return 0;
        }
        else if(n==1) {
            return 1;
        }
        else if(n==2)
        {
            return 1;
        }
        else
            return  fibonacci(n-1)+fibonacci(n-2);
        // TODO: Tìm số fibonacci ở vị trí n
    }
    public static void main(String Args[])
    {
        System.out.println(gcd(5,10));
        System.out.println(fibonacci(4));
    }
}
