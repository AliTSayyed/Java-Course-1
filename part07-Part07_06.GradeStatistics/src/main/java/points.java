/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ATS
 */
import java.util.ArrayList;

public class points {

    private ArrayList<Integer> points;
    private int sum = 0;
    private int count = 0;
    private double avg = 0;
    private int fail;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
     
    

    public points() {
        this.points = new ArrayList<>();
        this.sum = 0;
        this.count = 0;
    }
    
    public ArrayList<Integer> pointList(){
        return this.points;
    }

    public void add(int point) {
        if (point <= 100 && point >= 0) {
            points.add(point);
        }
    }

    public int getSum() {
        for (Integer point : this.points) {
            this.sum = this.sum + point;
            this.count++;
        }
        return sum;
    }
    
      public int getCount() {
        for (Integer point : this.points) {
            this.sum = this.sum + point;
            this.count++;
        }
        return count;
    }

    public double getAverage() {   
        getSum();        
        this.avg = 1.0 * this.sum / this.count;
        return this.avg;
    }
    
    public void gradeDistribution(){
        for(Integer point : points){
            if (point < 50 && point >= 0){
                this.fail++;
            }              
            if (point < 60 && point >= 50){
                this.one++;
            }
            if(point < 70 && point >= 60){
                this.two++;
            }
            if (point < 80 && point >= 70){
                this.three++;
            }
            if (point < 90 && point >= 80){
                this.four++;
            }
            if (point >= 90){
                this.five++;
            }
        }
    }

    public void printStars(){
        gradeDistribution();
        System.out.print("5: ");
        for(int i = 0; i < this.five; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("4: ");
         for(int i = 0; i < this.four; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("3: ");
         for(int i = 0; i < this.three; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("2: ");
         for(int i = 0; i < this.two; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("1: ");
         for(int i = 0; i < this.one; i++){
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("0: ");
         for(int i = 0; i < this.fail; i++){
            System.out.print("*");
        }
         
    }
   
    public String toString() {
        
        if(pointList().isEmpty()){
            return "-";
        }
        return "" + this.getAverage();
    }

}
