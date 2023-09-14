package ss6_inheritance;

import com.sun.org.apache.xpath.internal.operations.String;

public abstract class Employee extends Person {
    private float salary;

    public Employee() {
    }
    public int getBonus(int bonus){
        System.out.println("được nhận thường");
        return bonus;
    }
    @Override
    public void howToGo() {
        System.out.println("nhân viên đi làm bằng xe đạp");
    }

    public Employee(int id, java.lang.String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    public void doTask(String task){
        System.out.println("nhân viên đang làm gì đó");
    }
}
