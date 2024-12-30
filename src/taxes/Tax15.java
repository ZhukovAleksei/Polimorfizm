package taxes;

public class Tax15 extends TaxSystem{
    @Override
    public int calcTaxFor(int debit, int credit) {
        if(debit > 0 || debit - credit > 0) {
            return (debit - credit) / 100 * 15;
        }
        return 0;
    }
}
