package tech.dev.codingbat.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindSubset {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int[] a = new int[] {1,2};
    ArrayList<int[]> subset = new ArrayList<int[]>();
    System.out.println(getpowerset(a,a.length,subset).toString());
    for(int[] s: subset) {
      for(int x:s) {
        System.out.print(x+" ");
      }
      System.out.println();
    }



  }

  public static ArrayList<int[]> getpowerset(int a[],int n,ArrayList<int[]> ps)
  {
      if(n<0)
      {
          return null;
      }
      if(n==0)
      {
          if(ps==null)
              ps=new ArrayList<int[]>();
              ps.add(new int[] {});
          return ps;
      }
      ps=getpowerset(a, n-1, ps);
      ArrayList<int[]> tmp=new ArrayList<int[]>();
      for(int[] s:ps)
      {
          if(s.length==0)
              tmp.add(new int[] {a[n-1]});
          else {
            int[] c = new int[s.length+1];
            for(int i =0;i<s.length;i++) {
              c[i]=s[i];
            }
            c[s.length]= a[n-1];
            //System.arraycopy(new int[] {a[n-1]}, 0, c, 0, 1);
            //System.arraycopy(s, 0, c, 1, s.length);
            tmp.add(c);
          }
      }
      ps.addAll(tmp);
      return ps;
  }

}
