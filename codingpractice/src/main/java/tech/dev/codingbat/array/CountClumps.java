package tech.dev.codingbat.array;

public class CountClumps {

  public CountClumps() {}

  public int countClumps(int[] nums) {
    int countClumps=0;
    int p=0;
    for(int i=0;i<nums.length-1;i=p) {
     int count =0;
     int pivot = nums[p];
     for(int j=i+1;j<nums.length;j++){
       p=j;
       if(pivot==nums[j]){
           count= count+1;
        }else{
          break;
        }

      }

      if(count>=1) {
          countClumps= countClumps+1;
        }

    }
    return countClumps;
  }


}
