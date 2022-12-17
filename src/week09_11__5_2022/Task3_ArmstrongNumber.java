package week09_11__5_2022;

public class Task3_ArmstrongNumber {
    public static void main(String[] args) {
        
        
      boolean result =  isNumberArmstrong(407);

        System.out.println(result);
    }

    private static boolean isNumberArmstrong(int number) {

        boolean isArmstrong =true;


        int temp, hundredsDigit,  theyDigit, onesDigit,sum ;

        for (int i = 100; i < 999.; i++) {
temp = i;
onesDigit=temp % 10;
temp /= 10;

theyDigit=temp % 10;
temp /= 10;

hundredsDigit=temp % 10;
temp /= 10;

sum = (hundredsDigit*hundredsDigit*hundredsDigit)+(theyDigit*theyDigit*theyDigit)+(onesDigit*onesDigit*onesDigit);
if (sum==i){ isArmstrong =true;}
else {
    isArmstrong = false;
}

        }


return isArmstrong;



    }
}
