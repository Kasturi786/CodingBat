package tech.dev.codingbat.recursion;

import java.util.Arrays;

public class SplitArray {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(splitArray(new int[] {2,2}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {2,3}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {5,2,3}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {5,2,2}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {1,1,1,1,1,1}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {1,1,1,1,1}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {1}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {3,5}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {5,3,2}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {2, 2, 10, 10, 1, 1}));
    System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
    System.out.println(splitArray(new int[] {1, 2, 2, 10, 10, 1, 1}));
    System.out.println(".............................................");
    System.out.println(splitArray(new int[] {1, 2, 3, 10, 10, 1, 1}));

  }


  public static boolean splitArray(int[] nums) {
    if(nums.length==0)
      return true;

    int sum = sumOfgroup(0,nums,nums.length);
    if(sum%2==0) {
      int target = sum/2;
      Arrays.sort(nums);
      return findGroup(nums,nums.length-1,target);
    }else {
      return false;
    }

  }

  private static boolean findGroup(int[] nums, int index, int target) {
    // TODO Auto-generated method stub
    if (target==0)
        return true;
    if(index<0)
      return false;

    if(nums[index]<=target) {
      System.out.println(nums[index]);
      target = target-nums[index];
      index--;
    }
    else
      index--;

    return findGroup(nums, index, target);
  }

  public static int sumOfgroup(int start,int nums[],int end){
    if(end-start==1){
         return nums[start];
    }
   int x = (start+end)/2;
   return sumOfgroup(start,nums,x)+sumOfgroup(x,nums,end);
  }

}

