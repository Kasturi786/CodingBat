package tech.dev.codingbat.recursion;

import java.util.Arrays;

public class CheckPalindrone {

  public static void main(String[] args) {

    // TODO Auto-generated method stub

    String s1 = "aba";
    int j = s1.length();
    char[] s = s1.toCharArray();
    int[][] d = new int[j][j];
    for(int i=0;i<j;i++) {
      for(int k=0;k<j;k++) {
        d[i][k]=9;
      }

    }
    //System.out.println(String.valueOf(j-1)+", "+String.valueOf(j-1));
    ispalindrone(d,s, j-1,j-1);

    for(int i=0;i<j;i++) {
      for(int k=0;k<j;k++) {
        System.out.print(d[i][k]+" ");
      }
      System.out.println();
    }
  }

public static void ispalindrone(int[][] d,char[] s, int i,int j){
 // System.out.println(i+", "+j);
  //System.out.println(s[i]+"->"+s[j]);
    if(i==j){
     d[i][j]=1;
     if(i!=0&&j!=0){
       //System.out.println(String.valueOf(i-1)+", "+String.valueOf(j-1));
        ispalindrone(d,s, i-1,j-1);
        //System.out.println(String.valueOf(i-1)+", "+String.valueOf(j));
        ispalindrone(d,s, i-1,j);
     }
    }else{
       if(j-i==1){
     if(s[i]==s[j]){
     d[i][j]=1;
     }else{
     d[i][j]=0;
     }
     }else{
      // System.out.println(s[i]+"->"+s[j]);
     if(s[i]==s[j]){
      int a = i+1;
      int b = j-1;
      //System.out.println(a+"->"+b);
      //System.out.println(d[a][b]);
      d[i][j] = d[a][b];
     }else{
      d[i][j]=0;
     }
     }
     if(i!=0){
       //System.out.println(String.valueOf(i-1)+", "+String.valueOf(j));
     ispalindrone(d,s, i-1,j);
     }

    }
   System.out.println(i+", "+j);
   }

}
