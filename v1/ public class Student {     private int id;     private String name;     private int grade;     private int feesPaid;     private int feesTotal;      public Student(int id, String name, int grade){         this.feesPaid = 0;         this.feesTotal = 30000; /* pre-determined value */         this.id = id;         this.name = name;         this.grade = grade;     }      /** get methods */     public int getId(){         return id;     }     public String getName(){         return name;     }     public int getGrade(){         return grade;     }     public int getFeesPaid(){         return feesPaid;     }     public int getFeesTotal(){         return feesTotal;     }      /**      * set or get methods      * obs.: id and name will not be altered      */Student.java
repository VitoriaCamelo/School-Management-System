
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30000; /* pre-determined value */
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /** get methods */
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeesPaid(){
        return feesPaid;
    }
    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     * set or get methods
     * obs.: id and name will not be altered
     */
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void updateFeesPaid(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(fees);
    }
}
