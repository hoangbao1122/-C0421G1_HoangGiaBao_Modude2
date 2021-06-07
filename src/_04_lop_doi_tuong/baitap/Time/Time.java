package _04_lop_doi_tuong.baitap.Time;

import java.time.LocalTime;

public class Time {
  private  double startTimeNow = System.currentTimeMillis();
  private double endTime = System.currentTimeMillis();

  public double start(){
      return this.startTimeNow;
  }
  public double stop(){
      return this.endTime;
  }
   public double getElapsedTime (){
      return this.startTimeNow - this.endTime;
   }

}
