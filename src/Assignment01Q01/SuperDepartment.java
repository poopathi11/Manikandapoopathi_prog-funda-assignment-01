package Assignment01Q01;

public class SuperDepartment {
	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	static String isTodayAHoliday;

	public String departmentName() {
		return "Super Department";
    }
	public String getTodaysWork() {
		return "No Work as of now";
    }
	public String getWorkDeadline() {
		return "nil";
    }
	public static String isTodayAHoliday() {
		return "Today is not a holiday";
	}
}
