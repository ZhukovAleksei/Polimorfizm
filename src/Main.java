import taxes.Tax15;
import taxes.Tax6;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Нетология", new Tax6());
        company.shiftMoney(1000);
        company.changeOfTaxes(new Tax15());
        company.payTaxes();
    }
}