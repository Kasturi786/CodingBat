package tech.dev.codingbat.array;

public class CanFix45 {
  public CanFix45() {}

  public int[] fix45(int[] nums) {
   int len = nums.length;
   int l=0;
   int m =0;
   boolean pivot4=false;
   boolean pivot5=false;
   int n4=0;


   for(int i=0; i<len;i++) {

     if( (nums[i]==4) && !pivot4) {
       l=i;
       pivot4 = true;
       n4 =i;
    }

     if((nums[i]==5) && !pivot5) {
        m =i;
        pivot5=true;

     }

    if(pivot4) {
        for(int j=l+1;j<len;j++) {
            if(nums[j]==5){

             int pivot = nums[l+1];
             nums[l+1] = nums[j];
             nums[j] = pivot;

             pivot4=false;
             pivot5=false;

            i=l+1;
            break;
            }

            }
        }


    if(pivot5) {
      for(int j=n4+1;j<len;j++){
          if(nums[j]==4 && nums[j+1]!=5){
              int pivot = nums[j+1];
              nums[j+1] = nums[m];
              nums[m] = pivot;

              pivot4=false;
              pivot5=false;

              n4=j;
              break;

             }
        }
     }

   }

   return nums;
 }


}
