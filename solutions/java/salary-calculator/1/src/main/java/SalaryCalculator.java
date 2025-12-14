public class SalaryCalculator {
    final static double BASE_SALARY = 1000.00;
    public double salaryMultiplier(int daysSkipped) {
        double finalSalary = daysSkipped < 5 ? 1.0 : 0.85;
        return finalSalary;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
        
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold*(bonusMultiplier(productsSold));
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary  = (BASE_SALARY*salaryMultiplier(daysSkipped))+bonusForProductsSold(productsSold);
        return finalSalary < 2000.00 ? finalSalary : 2000.00;
    } 
}
