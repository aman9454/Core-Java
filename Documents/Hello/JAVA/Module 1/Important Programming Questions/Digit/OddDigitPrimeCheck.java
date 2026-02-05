class OddDigitPrimeCheck {

    
    static boolean isPrime(int num) {
        if (num < 2) 
        	return false;
        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) 
            	return false;
        }
        return true;
    }

 
    static int sumOfOddDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) 
            {
                sum =sum+digit;
            }
            num /= 10;
        }
        return sum;
    }

    
    public static void main(String[] args) {
        int number = 824;  // You can change the number here

        int sum = sumOfOddDigits(number);
        System.out.println("Sum of odd digits of " + number + " is: " + sum);

        if (isPrime(sum)) {
            System.out.println(sum + " is a Prime number.");
        } else {
            System.out.println(sum + " is NOT a Prime number.");
        }
    }
}
