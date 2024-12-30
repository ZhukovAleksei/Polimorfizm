package taxes;

public class Tax6 extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        if(debit > 0 || debit - credit > 0) {
            return (debit / 100) * 6;
        }
        return 0;
    }
}
