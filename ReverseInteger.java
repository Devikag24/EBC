public class ReverseInteger {
    public int reverse(int x) {
        double result =0 ; int sign =1;
        if(x <= ((int)Math.pow(-2 , 31)) || x >= (int)(Math.pow(2 , 31)-1)){
            return 0;
        }
        if(x<0){
            sign = -1;
            x= Math.abs(x);
        }
        while(x!= 0){
            int res = x%10;
            result = result*10 + res;
            x=x/10;
        }
        //return ((int)result*sign);
        result = result*sign;
        if(result <= (Math.pow(-2 , 31)) || result >= (Math.pow(2 , 31)-1))
            return 0;
        else
            return ((int)result);
    }
}

