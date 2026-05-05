package tech.dev.codingbat.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadScanner {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
   for(int i =0;i<n;i++) {
     list.add(scanner.nextInt());
   }
   int q = scanner.nextInt();
   for(int i=0;i<q;i++) {
     String query = scanner.nextLine();
     if(query.equalsIgnoreCase("Insert")) {
         int index = scanner.nextInt();
         int value= scanner.nextInt();
         list.add(index, value);
      }

     if(query.equalsIgnoreCase("Delete")) {
         int index = scanner.nextInt();
         list.remove(index);
      }
    }
   list.forEach(a->System.out.print(a+" "));
  }

}
