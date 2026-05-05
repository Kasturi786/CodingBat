package tech.dev.codingbat.recursion;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Combinatorics {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] numbers = new int[] {880}; //, 675, 961, 272, 22
    for(int num:numbers) {
      System.out.println(num);
      List<Integer> combinatorics = solveCombinatorics(num);
      System.out.println(combinatorics.toString());
    }


  }

  private static List<Integer> solveCombinatorics(int n) {
    // Write your code here
   List<Integer> combinationList = new ArrayList<Integer>();
   BigInteger a = factorial(n);
   for(int r=0;r<=n;r++){

     BigInteger d = factorial(r).multiply(factorial(n-r));
     BigInteger required = a.divide(d);
      try {
        //System.out.print(required.intValueExact()+ " ");
        combinationList.add(required.intValueExact());
      }catch(Exception ex) {
        combinationList.add(required.mod(new BigInteger("1000000000")).intValueExact());
      }

   }

   return combinationList;
    }

    private static BigInteger factorial(int n){
        if(n==0)
          return new BigInteger(String.valueOf(1));

        BigInteger z = new BigInteger(String.valueOf(n));
        return z.multiply(factorial(n-1));
    }

}

