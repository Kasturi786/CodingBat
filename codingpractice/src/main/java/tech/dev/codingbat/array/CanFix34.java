package tech.dev.codingbat.array;

public class CanFix34 {
  public CanFix34() {}

  public int[] fix34(int[] nums) {
    int len = nums.length;
    int l=0;
    int m =0;
    boolean pivot3=false;
    boolean pivot4=false;
    int n3=0;

    for(int i=0; i<len;i++) {

      if((nums[i]==3) && !pivot3) {
        l=i;
        pivot3 = true;
        n3 =i;
      }

      if((nums[i]==4) && !pivot4) {
         m =i;
         pivot4=true;

      }

      if(pivot3) {
        for(int j=l+1;j<len;j++) {
          if(nums[j]==4){
            int pivot = nums[l+1];
            nums[l+1] = nums[j];
            nums[j] = pivot;
            pivot3=false;
            pivot4=false;
            i=l+1;
            break;
          }
       }
     }

      if(pivot4) {
       for(int j=n3+1;j<len;j++) {
           if(nums[j]==3){
               int pivot = nums[j+1];
               nums[j+1] = nums[m];
               nums[m] = pivot;
               pivot3=false;
               pivot4=false;
               n3=j;
               break;
          }
       }
     }

  }
    return nums;
 }

}
