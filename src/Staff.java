public class Staff extends Person{

    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }

    public double getPay() {
        return pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public void Staff(){
        System.out.println(pay + " " + school);
    }
}
