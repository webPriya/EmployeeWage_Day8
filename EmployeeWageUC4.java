public class EmployeeWageUC4 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_FULL_TIME :
                empHrs = 8;
                System.out.println("Employee present for Full Time");
                break;
            case IS_PART_TIME :
                empHrs = 4;
                System.out.println("Employee present for Part Time");
                break;
            default :
                empHrs = 0;
                System.out.println("Employee is absent");
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
    }
}