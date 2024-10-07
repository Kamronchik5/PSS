public class Student extends Person{
    private int year;
    private double fee;
    public int getYear(){
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getFee(){
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void Student(){
        System.out.println(fee + " " + year);
    }
}
