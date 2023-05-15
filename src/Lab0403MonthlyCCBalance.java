// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Lab0403MonthlyCCBalance
{
    public static void main(String[] args)
    {
        double creditCardBalance = 5000;
        double INTEREST = .17;
        double month1Interest = 0;
        double month2Interest = 0;
        double monthlyBalance = 0;

        // Month 1
        month1Interest = INTEREST * creditCardBalance;
        monthlyBalance = month1Interest + creditCardBalance;
        // Month 2
        month2Interest = INTEREST * monthlyBalance;
        monthlyBalance = monthlyBalance + month2Interest;

        System.out.println("Your interest for month 1 is " + month1Interest + ". " + "Your interest for month 2 is " + month2Interest + ".");

    }
}