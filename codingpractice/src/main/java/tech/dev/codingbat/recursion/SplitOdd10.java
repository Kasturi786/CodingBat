package tech.dev.codingbat.recursion;

public class SplitOdd10 {

  public SplitOdd10() {
    super();
    // TODO Auto-generated constructor stub
  }

  public boolean splitOdd10(int[] nums) {

    if(nums.length ==0)
      return false;
    if(nums.length==1)
      return true;

    return odd10Split(nums,0,0);

    }

    boolean odd10Split(int[] nums,int j,int i) {
       boolean found = false;
       int sum_first_array=sum_array(nums,j,i);

       int sum_second_array = j!=0?sum_array(nums,i+1,nums.length-1)+sum_array(nums,0,j-1):sum_array(nums,i+1,nums.length-1);

       if(sum_first_array%10==0 && sum_second_array%2!=0){
          return true;
       } else if(sum_first_array%2!=0 && sum_second_array%10==0){
          return true;
       }

        if(i<nums.length-2){
          i= i+1;
          found = found || odd10Split(nums,j,i);
        }else if(!found && j<nums.length-2){
          j = j+1;
          i=j;
          found = found || odd10Split(nums,j,i);
        }


          return found;


    }

    int sum_array(int[] nums,int i,int e) {
      if (e-i==0)
       return nums[i];

      return  sum_array(nums,i,(i+e)/2) + sum_array(nums,(i+e)/2+1,e) ;
    }


}
