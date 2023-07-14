package tech.dev.codingbat.string;

public class SumNumbers {

    public SumNumbers() {}

    public int sumNumbers(String str) {
      int sum =0;
      StringBuilder stringBuilder = new StringBuilder();
      char[] chars = str.toCharArray();
      for(char c :chars) {
        if(Character.isDigit(c)) {
          stringBuilder.append(c);
        }else if(stringBuilder.length()!=0) {
          sum = sum + Integer.parseInt(stringBuilder.toString());
          stringBuilder.delete(0, stringBuilder.length());
        }
      }

      if(stringBuilder.length()!=0) {
        sum = sum + Integer.parseInt(stringBuilder.toString());
      }
      return sum;

   }

}
