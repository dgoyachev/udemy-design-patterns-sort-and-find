package com.calltouch;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Exercises {

    @Test
    public void multiplesOf3And5() {
        int sum = IntStream.range(1, 1000).filter(x -> (x % 3 == 0 || x % 5 == 0)).sum();
        System.out.println(sum);
    }

    @Test
    public void fibSequence() {
        int sum = 0;

        List<Integer> fList = new LinkedList<>(List.of(1,2));
        while (true) {
            int cNum = fList.get(fList.size() - 1) + fList.get(fList.size() - 2);
            if(cNum >= 4_000_000) {
                break;
            }
            fList.add(cNum);
        }

        System.out.println(fList);

        //your code goes here

        sum = fList.stream().mapToInt(x -> x).filter(x -> x % 2 == 0).sum();
        System.out.println(sum);
        //return sum;
    }

    @Test
    public void LargetPrimeFactor() {
        int largestFactor = -1;

        long num = 600_851_475_143L;

        //num = 13195;

        if(num % 2 ==0 ) {
            largestFactor = 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }

        if (num > 2) {
            largestFactor = (int) num;
        }

        System.out.println(largestFactor);
    }

    @Test
    public void findPalindromeTest() {
        List<Integer> palindromes = new LinkedList<>();
        for(int i = 999; i >= 100; i--) {
            for(int j = 999; j >= 100; j--) {
                int num = i * j;
                if(isPalindrome(num)) {
                    palindromes.add(num);
                }
            }
        }

        palindromes.sort(Comparator.naturalOrder());
        palindromes.forEach(System.out::println);
        //int max = palindromes.stream().mapToInt(i -> i).max().orElse(-1);
        //System.out.println(max);
    }

    private boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        if(str.length() != 6) {
            return false;
        }
        String left = str.charAt(0) + "" + str.charAt(1) + str.charAt(2);
        String right = str.charAt(5) + "" + str.charAt(4) + str.charAt(3);
        return left.equals(right);
    }

    @Test
    public void multipliersTest() {
        int curr = 20;
        while(true) {
            if(curr % 7 == 0 && curr % 8 == 0 && curr % 9 == 0 && curr % 11 == 0 && curr % 13 == 0 && curr % 15 == 0 && curr % 16 == 0 && curr % 17 == 0 && curr % 18 == 0 && curr % 19 == 0 && curr % 20 == 0) {
                System.out.println(curr);
                break;
            }
            curr++;
        }
    }

    @Test
    public void squareSumTest() {
        int sumOfSquares = IntStream.rangeClosed(1, 100).map(i -> i*i).sum();
        int sum = IntStream.rangeClosed(1, 100).sum();
        int sumSquared = sum * sum;

        System.out.println(sumSquared - sumOfSquares);
    }

    @Test
    public void findPRimeTest() {
        int i = 3;
        int count = 1;
        int primeAtCount;
        int maxCount = 10_001;
        while(true) {
            if(isPrime(i)) {
                count++;
            }
            if(count == maxCount) {
                primeAtCount = i;
                break;
            }
            i += 2;
        }

        System.out.println(primeAtCount + " is " + maxCount + "'th prime");
    }

    private boolean isPrime(long number) {
        /*
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                return false;
            }
            ++i;
        }
        return true;
         */
            return number > 1
                    && LongStream.rangeClosed(2, (long) Math.sqrt(number))
                    .noneMatch(n -> (number % n == 0));
    }

    @Test
    public void maxProductTest() {
        String num = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

        int span = 13;
        int end = num.length() - span;
        long max = 0;
        for(int i = 0; i < end; i++) {
            String subNum = num.substring(i, i + span);
            if(!subNum.contains("0")) {
                long product = 1;
                for (int j = 0; j < span; j++) {
                    int multiplier = Integer.parseInt(subNum.substring(j, j + 1));
                    product *= multiplier;
                }
                System.out.println(subNum + " -> " + product);
                if (product > max) {
                    max = product;
                }
            }
            else {
                i += span;
            }
        }

        System.out.println(max);
    }

    @Test
    public void pythagoreanTriplesTest() {
        final int MAX = 1000;

        int a, b, c;

        for(a = 1; a < MAX; a++)
        {
            for(b = a; b < MAX; b++)
            {
                for(c = b; c < MAX; c++)
                {
                    if((Math.pow(a, 2) + Math.pow(b, 2))
                            == Math.pow(c, 2))
                    {
                        if((a + b + c) == MAX) {
                            System.out.printf("%d %d %d\n",
                                    a, b, c);
                        }
                    }
                }
            }
        }
    }

    @Test
    public void primesBelowTwoMillion() {
        System.out.println(LongStream.range(1, 2_000_000).filter(this::isPrime).sum());
    }
}
