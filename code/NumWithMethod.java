public class NumWithMethod{
    public static void main(String[] args){
        int num1 = 100;
        int num2 = 600;
        int num3 = 300;

        int max = max(num1, num2, num3);
        System.out.println("The maximum number is: " + max);

    }

    public static int max(int num1, int num2, int num3){
        int max = 0;
        if(num1 > max && num1 > num2 && num1 > num3){
            max = num1;
        }else if( num2 > max && num2 > num3){
            max = num2;
        }else {
            max = num3;
        }
        return max;
    }
}