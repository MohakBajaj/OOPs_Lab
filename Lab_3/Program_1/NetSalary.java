package Lab_3.Program_1;

// import java.util.Scanner;

public class NetSalary {

    String name;
    int basic;
    int jobStatus;
    String jobS;
    int netSalary;
    double grossSalary;

    public NetSalary(String name, int basic, int jobStatus) {
        this.name = name;
        this.basic = basic;
        // [1] for Permanent [2] for Probation
        this.jobStatus = jobStatus;
        this.jobS = (jobStatus == 1) ? "Permanent" : "Probation";
    }

    public NetSalary(String name, int basic, String jobStatus) {
        this.name = name;
        this.basic = basic;
        // Permanent or Probation
        this.jobS = jobStatus;
        this.jobStatus = (jobStatus.equals("Permanent")) ? 1 : 2;
    }

    // public void takeInput() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Name of the Employee: ");
    // name = sc.nextLine();
    // System.out.println("Enter the Basic Salary of the Employee: ");
    // basic = sc.nextInt();
    // System.out.println("Enter the Job Status of the Employee: [1] for Permanent
    // [2] for Probation");
    // jobStatus = sc.nextInt();
    // sc.close();
    // }

    public void Calculate() {
        int SpecialAllowance = 9000;
        double HRA = basic * 0.1;
        double DA = basic * 0.5;
        double TA = basic * 0.05;
        if (jobStatus == 1 || jobS.equals("Permanent")) {
            grossSalary = basic + HRA + DA + TA + SpecialAllowance;
        } else if (jobStatus == 2 || jobS.equals("Probation")) {
            grossSalary = basic + TA;
        }
        double providentFund = grossSalary * 0.12;
        double IT;
        IT = grossSalary < 50000 ? grossSalary * 0 : grossSalary * 0;
        IT = grossSalary > 50000 && grossSalary < 100000 ? grossSalary * 0.1 : grossSalary * 0;
        IT = grossSalary > 100000 ? grossSalary * 0.3 : grossSalary * 0;
        netSalary = (int) (grossSalary - providentFund - IT);
    }

    public static void main(String args[]) {
        NetSalary n1 = new NetSalary("John Doe", 100000, 1);
        n1.Calculate();
        System.out.println("Name: " + n1.name);
        System.out.println("Basic Salary: " + n1.basic);
        System.out.println("Job Status: " + n1.jobS);
        System.out.println("Net Salary: " + n1.netSalary);
        NetSalary n2 = new NetSalary("Vasu Kansal", 200000, "Probation");
        n2.Calculate();
        System.out.println("Name: " + n2.name);
        System.out.println("Basic Salary: " + n2.basic);
        System.out.println("Job Status: " + n2.jobS);
        System.out.println("Net Salary: " + n2.netSalary);
    }
}