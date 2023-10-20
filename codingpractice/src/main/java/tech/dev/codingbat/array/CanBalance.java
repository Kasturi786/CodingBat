package tech.dev.codingbat.array;

public class CanBalance {

  public CanBalance() {}

  public boolean canBalance(int[] nums) {

    int i=0;
    int j= nums.length-1;
    Boolean isPlaceToSplit = false;

    int sum1 = nums[i];
    int sum2 = nums[j];

    while((j-i)>=1) {

      if(sum1==sum2 && (j-i)!=1){
          i=i+1;
          sum1=sum1+nums[i];
          j=j-1;
          sum2=sum2+nums[j];

      }

      if(sum1==sum2 && (j-i)==1){
        isPlaceToSplit = true;
        break;
      }

      if((sum1<sum2 || sum2<sum1) && (j-i)==1){
        break;
      }

      if(sum1<sum2 && j-i!=1){
        i=i+1;
        sum1=sum1+nums[i];

      }

      if(sum2<sum1 && j-i!=1){
        j=j-1;
        sum2=sum2+nums[j];

      }
    }

    return isPlaceToSplit;

  }

}
