public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryReceived;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryReceived = 0;
    }

    /** get methods */
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSalary() {
        return salary;
    }

    /**
     * set method
     * obs.: id and name will not be altered
     */
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void receiveSalary(int salary){
      salaryReceived+=salary;
      School.updateTotalMoneySpent(salary);
    }
}
