package tech.dev.codingbat.time;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.text.*;

public class TimeCalculation {
  public static void main(String args[]) {
    //":::.Local date time::::."
    LocalDateTime local1 = LocalDateTime.now();
    System.out.println(local1);
    System.out.println(LocalDateTime.now(ZoneOffset.UTC));
    //":::Zone date time::::."
    ZonedDateTime time = ZonedDateTime.of(local1, ZoneOffset.UTC);
    System.out.println(time);
    System.out.println(Date.from(time.toInstant()));

    ZonedDateTime time1 = ZonedDateTime.of(2024, 05, 22, 2, 0, 0, 0, ZoneOffset.UTC);
    System.out.println(time1);
    System.out.println(time1.getZone());
    System.out.println(Date.from(time1.toInstant()));


    Date date = new Date();
    System.out.println(date);
    System.out.println(Date.from(date.toInstant()));

    TimeZone tz = TimeZone.getTimeZone("UTC");
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    df.setTimeZone(tz);
    String nowAsISO = df.format(date);
    System.out.println(nowAsISO);

    System.out.println(".....Hello......");
    //1728952230000L
    Date timeStamp = new Date(1728952230000L);
    //Date timeStamp = new Date(1729001444073L); UTC
    System.out.println(timeStamp);
    LocalDateTime local = LocalDateTime.ofInstant(timeStamp.toInstant(), ZoneOffset.UTC);

    Date date1 = Date.from(LocalDateTime.of(local.getYear(), local.getMonthValue(), local.getDayOfMonth(), local.getHour(), 0, 0).toInstant(ZoneOffset.UTC));
    System.out.println(date1);
  }




}
