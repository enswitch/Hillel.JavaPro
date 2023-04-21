package homeworks.hm3;

public class Employee {

    private String empName;
    private String empTitle;
    private String empEmail;
    private String empPhone;
    private int empAge;

    public Employee(String name, String title, String email, String phone, int age) {
        this.empName = name;
        this.empTitle = title;
        this.empEmail = email;
        this.empPhone = phone;
        this.empAge = age;
    }

    public String getName() {
        return empName;
    }

    public void setName(String empName) {
        this.empName = empName;
    }

    public String getTitle() {
        return empTitle;
    }

    public void setTitle(String empTitle) {
        this.empTitle = empTitle;
    }

    public String getEmail() {
        return empEmail;
    }

    public void setEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getPhone() {
        return empPhone;
    }

    public void setPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public int getAge() {
        return empAge;
    }

    public void setAge(int empAge) {
        if (empAge >= 18) {
            this.empAge = empAge;
        } else {
            throw new RuntimeException("Invalid age");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Wick", "CTO", "johnwick@gmail.com", "+380631792569", 18);
        employee.setAge(25);
        System.out.println(employee.getAge());

        Car car = new Car();
        car.start();
    }
}
